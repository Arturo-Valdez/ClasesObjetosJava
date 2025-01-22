package animales;

public class Animal {
    //Protected solo puede acceder las clases hijas y no externas
    protected void comer(){
        System.out.println("Comiendo...");
    }

    //Protected solo puede acceder las clases hijas y no externas
    protected void dormir(){
        System.out.println("Durmiendo...");
    }
}

class Perro extends  Animal{
    public void hacerSonido(){
        System.out.println("Ladrando...");
    }
}
