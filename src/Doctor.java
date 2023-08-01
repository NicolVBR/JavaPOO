import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String  speciallity;
    //private String time;
    //private Date date;
    //private int idAvilabelApointment;
    //Un doctor tiene muchas citas, por lo tato se crearia un array.
    //Se cea una clase para ello, solo el doctor puede definir citas disponibles.


  //Comportamientos
    Doctor(){
        super();
        //System.out.println("Construcción del objeto doctor");
        //id ++;
    }
    Doctor(String name, String email){
        super(name,email);
        //System.out.println("El nombre del doctor asignado es: " + name);
        /*this.name = name;
        this.speciallity = speciallity;
        id ++;*/
    }
    public  void showName(){//Imprime el nombre del doctor
        System.out.println(""+ getName());
    }
    public  void showid(){
        System.out.println("Id doctor: "+ getId());
    }


    public String getSpeciallity() {
        return speciallity;
    }

    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
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

    @Override
    public String toString() {
        return "Doctor: \n" +
                super.toString() +
                "Speciallity: " + speciallity ;
    }
}
