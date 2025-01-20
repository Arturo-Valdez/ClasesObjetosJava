public class Aritmetica {
    //Atributos de clase
    int operando1;
    int operando2;

    //Constructor vacio permite que no sea necesario agregar valores obligatorios
    public Aritmetica(){
        System.out.println("Constructor vacio");
    }

    //Crear constructor de aritmetica
    public Aritmetica(int operando1, int operando2){
        System.out.println("Ejecutando Constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    void suma(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado suma = " + resultado);
    }
    void resta(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado resta = " + resultado);
    }
    void multiplicacion(){
        var resultado = this.operando1 * this.operando2;
        System.out.println("Resultado multiplicacion = " + resultado);
    }
    void divicion(){
        var resultado = this.operando1 / this.operando2;
        System.out.println("Resultado divicion = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");

        //El constructor permite agregar los valores directamente a la clase
        var aritmetica1 = new Aritmetica(5,7);
        //aritmetica1.operando1 = 5;
        //aritmetica1.operando2 = 7;
        aritmetica1.suma();
        aritmetica1.resta();
        aritmetica1.multiplicacion();
        aritmetica1.divicion();
        System.out.println();


        //Constructor vacio permite que no sea necesario agregar valores obligatorios
        var aritmetica2 = new Aritmetica();
        aritmetica2.suma();
        aritmetica2.resta();
        aritmetica2.multiplicacion();
        //aritmetica2.divicion();

        /*Crear nuevo objeto
        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.suma();
        aritmetica2.resta();
        aritmetica2.multiplicacion();
        aritmetica2.divicion();
        */


    }

}
