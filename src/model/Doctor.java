package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);
        this.speciality = speciality;
    }

    //Comportamientos
    public String getSpeciality(){
        return speciality;
    }
    public void setSpeciality(){
        this.speciality = speciality;
    }

    //Creamos un Arraylist que solo puede tener tipos de datos AvailableAppoitnment.
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Creamos el método que recibirá como parámetros la fecha y la hora.
    public void addAvailableAppointment(String date, String time) {
        // Cuando recibamos la hora y la fecha, se creará un nuevo objeto tipo AvailableAppointment
        // Que tendrá como argumentos la fecha y hora. y ese objeto se agregará a nuestra ArraList en forma de objeto
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    //Esta función nos ayuda a devolver la lista completa ArrayList
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality +
                                   "\nAvailable " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");


        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDate(String date) {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointment \nDate: " +date+ "\nTime: " + time;
        }
    }
}
