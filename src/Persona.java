//Clase persona
public class Persona {
    String nombre;
    String apellido;
    String email;
    String tel;
    //Mostrar persona
    void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Numero Celular: " + tel);
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

