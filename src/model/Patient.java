package model;

public class Patient extends User{
    private String birthday;
    private Double weigth;
    private Double height;
    private String blood;

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
    // modificamos una clase que heramos de nuestra clase padre.
    @Override

    public String toString() {
        return super.toString() + "\nAge: " +birthday+ "\nWeigth: " +getWeigth()+
                "\nHeight: " +getHeight()+  "\nTipo de Sangre: " + blood;
    }
}

