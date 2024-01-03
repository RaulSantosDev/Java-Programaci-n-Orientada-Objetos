public class Patient {
    //Atributos.
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Double weigth;
    private Double height;
    private String blood;

    Patient(String name, String email) {
        this.name = name;
        this.email = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10){
            System.out.println("El número telefónico debe ser de 8 dígitos.");
        } else if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}

