package ui;
import model.Doctor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UiPatientMenu {
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while(response!=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do{
            System.out.println(":: Book an appointment");
            System.out.println(":: Select Date: ");

            //Numeración de la lista de fechas.
            //Indice de la fecha seleccionada.
            // [dotors]
            // 1.- Doctor1
                // 1.- Fecha1
                // 2.- Fecha2
            // 2.- Doctor 2
                // 1.- Fecha1
                // 2.- Fecha2

            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++){
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointmets = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointmets.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointmets);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDataSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDataSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");
            for (Map.Entry<Integer, Doctor> doc :doctorAvailableSelected.entrySet()){
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +
                    ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected, doctorSelected.getAvailableAppointments().get(indexDate).getDate(null), doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();
            }
        }while (response != 0);
    }

    private static void showPatientMyAppointments () {
        int response = 0;
        do {
            System.out.println("::My appointmets");
            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
                System.out.println("Don't have appontments");
                break;
            }
            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i ++) {
                int j= 0;
                System.out.println(j + "." +
                        " Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        " Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
                        );
            }
            System.out.println("0. Return");
        } while (response != 0);
    }
}
