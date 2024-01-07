import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

       //ui.UIMenu.showMenu();
        Doctor myDoctor = new Doctor("Raymundo","Development");
//        System.out.println(myDoctor.name);
//        System.out.println(myDoctor.speciality);

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");

        Patient myPatient = new Patient("Raymundo", "@gmail.con");
        myPatient.setAddress("Calle 32");
        myPatient.setPhoneNumber("9999999999");

        System.out.println(myDoctor);



    }
}