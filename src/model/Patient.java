package model;

public class Patient extends User {
    private String birthday, blood;
    private double weight, height;

    public Patient(String name, String email) {
        super(name,email);
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPatient: \n" +
                "\nBirthday='" + birthday +
                "\nBlood='" + blood +
                "\nWeight=" + getWeight() +
                "\nHeight=" + getHeight() ;
    }

    @Override
    public void showDataUser() {
        System.out.println("Tipo de paciente: Beneficiario");
        System.out.println("Hsitorial medico");
        System.out.println("Enfern¿medades : Ninguna");
    }
}
