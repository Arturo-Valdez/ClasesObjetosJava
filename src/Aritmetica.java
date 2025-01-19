public class Aritmetica {
    int operando1;
    int operando2;

    void suma(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado suma = " + resultado);
    }
    void resta(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado resta = " + resultado);
    }
    void multiplicacion(){
        var resultado = operando1 * operando2;
        System.out.println("Resultado multiplicacion = " + resultado);
    }
    void divicion(){
        var resultado = operando1 / operando2;
        System.out.println("Resultado divicion = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");

        var aritmetica1 = new Aritmetica();
        aritmetica1.operando1 = 5;
        aritmetica1.operando2 = 7;
        aritmetica1.suma();
        aritmetica1.resta();
        aritmetica1.multiplicacion();
        aritmetica1.divicion();
        System.out.println();

        //Crear nuevo objeto
        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.suma();
        aritmetica2.resta();
        aritmetica2.multiplicacion();
        aritmetica2.divicion();

    }

}
