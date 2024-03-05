package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    // Cuando a un metodo le asignamos la propiedad static es porque necesitamos llamarlo en main pero sin la necesidad de hacer una instancia de este.
    public static void showMenu(){
        System.out.println("Welcome to My Appoinments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch(response){
                case 1:
                    System.out.println("\nDoctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while(response !=0);
    }

    private static void authUser(int userType){
        //userType = 1 = Doctor
        //userType = 2 = Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Santos Raul", "Pacheco@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "Sosa@gmail.com"));
        doctors.add(new Doctor("Rocío Gomez", "Gomez@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Raul Santos", "Santos@gmail.com"));
        patients.add(new Patient("Lu Ojeda", "Ojeda@gmail.com"));
        patients.add(new Patient("Glo OJeda", "glo@gmail.com"));

        //Validando el email.
        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1) {
                for(Doctor d: doctors){
                  if(d.getEmail().equals(email)){
                      emailCorrect = true;
                      //Obtener el usuario Loguedo
                      doctorLogged = d;
                      UIDoctorMenu.showDoctorMenu();
                  }
                }
            }
            if(userType == 2) {
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        //ShowPatientMenu
                    }
                }
            }
        } while (!emailCorrect);

    }

    // Los métodos con con la propriedad static NO SE PUEDEN SOBREESCRIBIR.
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++){
                        System.out.println(i + ". " + MONTHS[i - 1]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointment");
                    break;
                case 0:
                    showMenu();
                    break;
            }

        }while(response != 0);

    }

}
