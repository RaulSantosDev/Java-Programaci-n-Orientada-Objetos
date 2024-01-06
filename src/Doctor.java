import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;

    Doctor(String name, String email) {
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
    public void addAvailableAppointment(Date date, String time) {
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

    public static class AvailableAppointment {
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
