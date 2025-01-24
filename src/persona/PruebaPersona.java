package persona;

//MOVER LA CLASE A UN PAQUETE LLAMADO PERSONA Y HACER
//LA PRUEBA DESDE PruebaPersona DENTRO DEL MISMO PAQUETE

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y objetos tipo persona.Persona ***");

        //Impresion de ID
        System.out.println("Variable estaica: " + Persona.contadorPersonas);
        var objeto1 = new Persona("Karen", "Contreras","kco@gmail.com","41254477889");

        //USO DEL SET
        /*objeto1.setNombre("Santiago");
        objeto1.setApellido("Valdez");
        objeto1.setEmail("santi@gmail.com");
        objeto1.setTel("313 1122 4456");*/

        System.out.println(objeto1);//Se manda a llamar automaticamente metodo toString

        //Impresion de ID
        System.out.println("Variable estaica: " + Persona.contadorPersonas);

        //Segundo objeto persona
        var objeto2 = new Persona("Santiago","Valdez","santi@gmail.com","313 1122 4456");
        System.out.println(objeto2);//Se manda a llamar automaticamente metodo toString

        //Impresion de ID
        System.out.println("Variable estaica: " + Persona.contadorPersonas);

        //USO DE GET
        //System.out.println(objeto1.getNombre());
        //objeto1.mostrarPersona();

        //Imprimiendo metodo toString
        //System.out.println(objeto1.toString());

    }
}
