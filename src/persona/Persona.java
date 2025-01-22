//Clase persona
public class Persona {
    //Encapsulamiento de atributos
    private String nombre;
    private String apellido;
    private String email;
    private String tel;

    //Agregar constructor publico con 4 argumentos, (nombre, apellido, email, tel)
    //Uso del operador this
    public Persona(String nombre, String apellido, String email, String tel){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tel = tel;
    }

    //Mostrar persona
    void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Numero Celular: " + this.tel);
    }

    //AGREGAR METODOS GET Y SET PARA EL METODO ENCAPSULAMIENTO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y objetos tipo Persona ***");
        var objeto1 = new Persona();
        objeto1.nombre = "Santiago";
        objeto1.apellido = "Guardado";
        objeto1.email = "santi@gmail.com";
        objeto1.tel = "313 1122 4456";

        objeto1.mostrarPersona();

        ///////////////////////////////////
        //Creacion de objeto2 mandando a llamar a la clase Persona
        var objeto2 = new Persona();
        objeto2.nombre = "Santiago";
        objeto2.apellido = "valdez";
        objeto2.email = "sssss@gmail.com";
        objeto2.tel = "313 1442 4456";

        objeto2.mostrarPersona();


    }
}

