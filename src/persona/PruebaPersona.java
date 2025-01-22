package persona;

//MOVER LA CLASE A UN PAQUETE LLAMADO PERSONA Y HACER
//LA PRUEBA DESDE PruebaPersona DENTRO DEL MISMO PAQUETE

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y objetos tipo persona.Persona ***");
        var objeto1 = new Persona();
        objeto1.setNombre("Santiago");
        objeto1.setApellido("Valdez");
        objeto1.setEmail("santi@gmail.com");
        objeto1.setTel("313 1122 4456");

        objeto1.mostrarPersona();
    }
}
