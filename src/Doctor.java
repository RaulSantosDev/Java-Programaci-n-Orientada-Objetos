import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    // Al hacer el atributo estático
    private String email;
    static int id = 0;
    private String name;
    private String speciality;

    Doctor() {
        System.out.println("Este es mi metodo constructor");
    }

    Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName () {
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id Doctor: " + id);
    }

    //Creamos un Arraylist que solo puede tener tipos de datos AvailableAppoitnment.
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Creamos el método que recibirá como parámetros la fecha y la hora.
    public void addAvailableAppointment(Date date, String time) {
        // Cuando recibamos la hora y la fecha, se creará un nuevo objeto tipo AvailableAppointment
        // Que tendrá como argumentos la fecha y hora. y ese objeto se agregará a nuestra ArraList en forma de objeto
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    //Esta función nos ayuda a devolver la lista completa ArrayList
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time + "Hrs.";
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
