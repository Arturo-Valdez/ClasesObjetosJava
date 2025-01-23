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
//El uso del extends es la funcion que llamara a herencia de animal
class Perro extends  Animal{
    public void hacerSonido(){
        System.out.println("Ladrando...");
    }

    @Override//Anotacion de sobreescritura al metodo de la clase animal en Perro
    protected  void dormir(){
        System.out.println("Duermo 15 horas al dia...");

        //Acceder al metodo Padre Animal utilizando 'super' y asi accediendo a el
        System.out.println("Metodo de la clase Padre: ");
        super.dormir();
    }
}
class PrebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Herencia ***");
        System.out.println("Clase Padre, Soy un animal");

        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacerSonido();//Este metodo no pertenece a la clase padre

        System.out.println("\nClase Hija, soy un Perro");
        var perro1 = new Perro();
        perro1.dormir();//Sobreescrito
        perro1.comer();
        perro1.hacerSonido();

    }
}
