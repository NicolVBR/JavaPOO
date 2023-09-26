import model.*;

import javax.jws.soap.SOAPBinding;

import static model.Doctor.*;

public class Main {
    public static void main(String[] args) {
       // User user = new User(); //NO SE INSTANCIAN LAS CLASES ABSTRACTAS

        /*User user = new User() {
            @Override
            public int getId() {
                return super.getId(); // SE LE DA UN COMPORTAMIENTO POR MEDIO DE UN METODO.
            }
        };*/
        //ABSTRACCIÓN DE CLASES
        User userDoc = new Doctor("Nicol", "Nicol@gmail.com");//si se puede crear
        userDoc.showDataUser();
        User userPat = new Patient("Sara", "Sari@gmail.com");//si se puede crear
        userPat.showDataUser();
        User userNurse = new Nurse("Andres", "Andre@gmail.com");//si se puede crear
        userNurse.showDataUser();

        //ABSTRACCION DE UN MÉTODO MEDIANTE CLASES ANONIMAS
        User userMetAnon = new User("Julian","Juli@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("MÉTODO MEDIANTE CLASE ANONIMA");
                System.out.println("Doctor");
                System.out.println(" Hospital Costa Azul");
                System.out.println("Departamento: Pediatria");
            }
        };
        userMetAnon.showDataUser();
       //Doctor myDoctor = new Doctor();
        Doctor myDoctor = new Doctor("Nicol Barajas","nicol@gmail.com");
        myDoctor.setSpeciallity("Cirujana");
        myDoctor.setAddress("Cra. 5 # 6 B");
        myDoctor.setPhoneNumber("11111568");
       /* System.out.println("\nID: " + myDoctor.getId()+
                "\nName: " + myDoctor.getName() +
                "\nEspecialidad: " + myDoctor.getSpeciallity());

        myDoctor.addAvaibleAppointment(new Date(), "7:00am");
        myDoctor.addAvaibleAppointment(new Date(), "8:00am");
        myDoctor.addAvaibleAppointment(new Date(), "7:15am");
        //Muestra la dirección de memoria
        System.out.println("\nLista de citas para el doctor "+myDoctor.getName()+
                           ": \n" + myDoctor.getAvaibleAppointments());


        //Para imprimir los valor de la dirrecion de memoria
        for (Doctor.AvaibleAppointment availableAppointment:myDoctor.getAvaibleAppointments()) {
            System.out.println(availableAppointment.getDate() + "\t" + availableAppointment.getTime());
        }
        */

        System.out.println(myDoctor);



        /*myDoctor.name="Pedro Ruiz";
        myDoctor.showName();
        System.out.println(Doctor.id);
        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showid();*/
        //showMenu();

    }

    public void usoDeMemoriaVariablesVsObjetos(){
        //Uso de memoria en variables.
        int i = 0;
        int b = 2;
        b = i;
        //b = 0

        //Memoria de objetos
        Patient myPatient = new Patient("Ramiro","Ramiro@mail.com");
        Patient myPatient2 = new Patient("Andres","Andres@mail.com");
        System.out.println(myPatient.getName());
        System.out.println(myPatient2.getName());
        // Igualando la direccion de memoria
        myPatient2 = myPatient;
        System.out.println("\n" + myPatient);
        System.out.println(myPatient2);
        System.out.println("\n" + myPatient.getName());
        System.out.println(myPatient2.getName());
        // Se cambia el valor para los dos pacientes ya que se encuentran en la misma direccion de memoria
        myPatient2.setName("Saray");
    }
    public void settersGetters(){
        Patient myPatient = new Patient("tereza","tere@gmail.com");
        System.out.println("\n" + myPatient.getName());
       // System.out.println(myPatient2.getName());
        //System.out.println( "\nName: " + myPatient2.getName() + "\nEmail: " + myPatient2.getEmail());
        myPatient.setWeight(60.0);
        System.out.println(myPatient.getWeight());
        myPatient.setPhoneNumber("11111223");
        System.out.println(myPatient.getPhoneNumber());
        myPatient.setWeight(60.5);
        myPatient.setHeight(1.65);
        System.out.println("\nPeso: " + myPatient.getWeight() +
                "\nAltura: " + myPatient.getHeight());
    }
}
