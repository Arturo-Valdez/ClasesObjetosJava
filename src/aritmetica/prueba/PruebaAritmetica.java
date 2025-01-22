package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        //El constructor permite agregar los valores directamente a la clase
        var aritmetica1 = new Aritmetica(5,7);
        //aritmetica1.operando1 = 5;
        //aritmetica1.operando2 = 7;

        //ENCAPSULAMIENTO 'GET' MOSTRAR INFORMACION YA GENERADA
        System.out.println("ENCAPSULAMIENTO 'GET' MOSTRAR INFORMACION YA GENERADA");
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        System.out.println("Atributo operando1: " + aritmetica1.getOperando2());

        //ENCAPSULAMIENTO 'SET' MODIFICAR LOS VALORES DE LOS ATRIBUTOS
        System.out.println("ENCAPSULAMIENTO 'SET' MODIFICAR LOS VALORES DE LOS ATRIBUTOS MODIFICADA");
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);

        //ENCAPSULAMIENTO 'GET' MOSTRAR INFORMACION
        System.out.println("ENCAPSULAMIENTO 'GET' MOSTRAR INFORMACION");
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        System.out.println("Atributo operando1: " + aritmetica1.getOperando2());

        aritmetica1.suma();
        aritmetica1.resta();
        aritmetica1.multiplicacion();
        aritmetica1.divicion();
        System.out.println();



        //Constructor vacio permite que no sea necesario agregar valores obligatorios
        //var aritmetica2 = new Aritmetica();
        //aritmetica2.suma();
        //aritmetica2.resta();
        //aritmetica2.multiplicacion();
        //aritmetica2.divicion();

        /*Crear nuevo objeto
        var aritmetica2 = new aritmetica.Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.suma();
        aritmetica2.resta();
        aritmetica2.multiplicacion();
        aritmetica2.divicion();
        */


    }
}
