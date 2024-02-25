import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Aquí vamos a hacer un hack para que podamos instaciar una clase abstracta
        User user1 = new User("doctor", "ajksdfhjkahd@gndjk.xo0n") {
            @Override
            public void showDataUser() {
                System.out.println("Soy un Usuario");
                System.out.println("Y de esta forma es como pudimos instancear la una clase abstracta.");
            }

        }; //Este método solo se usa en andriod con el evento onclick en particular para ese momento.


        // Tambien podemos tener el mismo compotamiento con las interfaces.
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        //De esta manera es como llamamos la clase abstracta que
        user1.showDataUser();

       //ui.UIMenu.showMenu();
//        Doctor myDoctor = new Doctor("Raymundo","Development");
//        System.out.println(myDoctor.name);
//        System.out.println(myDoctor.speciality);

//        myDoctor.addAvailableAppointment(new Date(), "4pm");
//        myDoctor.addAvailableAppointment(new Date(), "10pm");

//        Patient myPatient = new Patient("Raymundo", "@gmail.con");
//        myPatient.setAddress("Calle 32");
//        myPatient.setPhoneNumber("9999999999");
//
//        System.out.println(myDoctor);

//        User user = new Doctor("Raul Santos", "raul@gmail.com");
//        user.showDataUser();
//
//        User patientuser = new Patient("Raymundo", "Hola@gmail.com");
//        patientuser.showDataUser();



    }
}