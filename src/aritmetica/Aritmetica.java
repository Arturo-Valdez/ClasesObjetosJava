package aritmetica;

public class Aritmetica {
    //Atributos de clase encapsulamiento
    private int operando1;
    private int operando2;

    //Constructor vacio permite que no sea necesario agregar valores obligatorios
    //Tambien llamado sobrecarga cuando hay mas de 1 constructor
    public Aritmetica(){
        System.out.println("Constructor vacio");
    }

    //Crear constructor de aritmetica
    public Aritmetica(int operando1, int operando2){
        System.out.println("Ejecutando Constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void suma(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado suma = " + resultado);
    }
    public void resta(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado resta = " + resultado);
    }
    public void multiplicacion(){
        var resultado = this.operando1 * this.operando2;
        System.out.println("Resultado multiplicacion = " + resultado);
    }
    public void divicion(){
        var resultado = this.operando1 / this.operando2;
        System.out.println("Resultado divicion = " + resultado);
    }



    ///METODO DE ENCAPSULAMIENTO GET Y SET
    public int getOperando1(){
        return this.operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }
}
