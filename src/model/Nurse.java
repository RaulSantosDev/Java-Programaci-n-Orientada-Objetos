package model;

public class Nurse extends User{

    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    public void showDataUser(){
        System.out.println("Empleado del Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutrilogía, Pedriatría");
    }

    public String getSpeciality(){
        return speciality;
    }
    public void setSpeciality(String Speciality){
        this.speciality = speciality;
    }
}
