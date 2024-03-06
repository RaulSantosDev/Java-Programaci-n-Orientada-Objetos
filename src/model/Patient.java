package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
    private String birthday;
    private Double weigth;
    private Double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email) {
        super(name,email);
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public String getWeigth() {
        return this.weigth + " Kg.";
    }

    public String getHeight() {
        return this.height + " Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    //Esta es la manera de como aplicamos polimosfismo de nuevo, es decir
    //Modificamos una clase que heramos de nuestra clase padre.
    @Override
    public String toString() {
        return super.toString() + "\nAge: " +birthday+ "\nWeigth: " +getWeigth()+
                "\nHeight: " +getHeight()+  "\nTipo de Sangre: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo del paciente desde nacimiento");
    }
}

