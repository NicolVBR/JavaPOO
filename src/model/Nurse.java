package model;

public class Nurse extends User{
    private String speciallity;
    public Nurse (String name, String email){
        super(name,email);
    }

    public String getSpeciallity() {
        return speciallity;
    }

    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                super.toString() +
                "speciallity='" + speciallity + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital Gran Colombia sur");
        System.out.println("Tipo: Empleado");
        System.out.println("Departamento: Maternidad, Hipertensin, Urgencias");
    }
}
