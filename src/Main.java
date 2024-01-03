import java.util.Date;

public class Main {
    public static void main(String[] args) {

       //UIMenu.showMenu();
        Doctor myDoctor = new Doctor("Raymundo","Development");
//        System.out.println(myDoctor.name);
//        System.out.println(myDoctor.speciality);

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        

    }
}