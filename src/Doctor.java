import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static int id = 0;
    private String  name, speciallity, email;
    //private String time;
    //private Date date;
    //private int idAvilabelApointment;
    //Un doctor tiene muchas citas, por lo tato se crearia un array.
    //Se cea una clase para ello, solo el doctor puede definir citas disponibles.


  //Comportamientos
    Doctor(){
        System.out.println("Construcción del objeto doctor");
        //id ++;
    }
    Doctor(String name, String speciallity){
        //System.out.println("El nombre del doctor asignado es: " + name);
        this.name = name;
        this.speciallity = speciallity;
        id ++;
    }
    public  void showName(){//Imprime el nombre del doctor
        System.out.println(name);
    }
    public  void showid(){
        System.out.println("Id doctor: "+ id);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciallity() {
        return speciallity;
    }

    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //Se crea método a nivel de la clase Doctor, crea la coleccion de AvaibleAppointment()
    ArrayList<AvaibleAppointment> avaibleAppointments = new ArrayList<>(); // ArrayList de tipo AvaibleAppointment()
    public void addAvaibleAppointment(Date date, String time){
        avaibleAppointments.add(new AvaibleAppointment(date,time)); //Alamcena una nueva cita mediante el constructor
    }
    //Se crea funcion con parametro de retorno ArrayList<AvaibleAppointment>, el cual nos trae los datos del ArraList


    public ArrayList<AvaibleAppointment> getAvaibleAppointments() {
        return avaibleAppointments;
    }


    //Clase anidada
    public class AvaibleAppointment {
        private String time;
        private Date date;
        private int idAvilabelApointment;

        public AvaibleAppointment(Date date, String time) {
            this.time = time;
            this.date = date;

        }

        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public int getIdAvilabelApointment() {
            return idAvilabelApointment;
        }
        public void setIdAvilabelApointment(int idAvilabelApointment) {
            this.idAvilabelApointment = idAvilabelApointment;
        }
    }


}
