package persona;

//MOVER LA CLASE A UN PAQUETE LLAMADO PERSONA Y HACER
//LA PRUEBA DESDE PruebaPersona DENTRO DEL MISMO PAQUETE

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y objetos tipo persona.Persona ***");
        var objeto1 = new Persona();
        //USO DEL SET
        objeto1.setNombre("Santiago");
        objeto1.setApellido("Valdez");
        objeto1.setEmail("santi@gmail.com");
        objeto1.setTel("313 1122 4456");

        //USO DE GET
        //System.out.println(objeto1.getNombre());
        //objeto1.mostrarPersona();

        //Imprimiendo metodo toString
        //System.out.println(objeto1.toString());
        System.out.println(objeto1);//Se manda a llamar automaticamente metodo toString
    }
}
