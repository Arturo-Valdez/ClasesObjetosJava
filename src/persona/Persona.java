package persona;

//Clase persona
public class Persona{
    //Encapsulamiento de atributos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String tel;
    static int contadorPersonas = 0;


    @Override//Sobreescritura
    public String toString(){
        return "ID: " + this.idPersona +"\tNombre: " + this.nombre + "\tApellido: " + this.apellido + "\tEmail: " +
                this.email + "\tTel: " + this.tel + "\tDireccion de memoria: " + super.toString();
    }

    //Agregar constructor publico con 4 argumentos, (nombre, apellido, email, tel)
    //Uso del operador this
    public Persona(String nombre, String apellido, String email, String tel){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tel = tel;
        this.idPersona = ++Persona.contadorPersonas;
    }

    //Mostrar persona
    public void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Numero Celular: " + this.tel);
    }

    //AGREGAR METODOS GET Y SET PARA EL METODO ENCAPSULAMIENTO A ATRIBUTOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

}

