package animales;

public class Animales {
    //Protected solo puede acceder las clases hijas y no externas
    protected void hacerSonido(){
        System.out.println("Haciendo Sonido...");
    }

}

//El uso del extends es la funcion que llamara a herencia de animal
class Perros extends  Animales{
    @Override
    protected void hacerSonido(){
        System.out.println("Ladrando...");
    }
}

//El uso del extends es la funcion que llamara a herencia de animal
class Gatos extends  Animales{
    @Override
    protected void hacerSonido(){
        System.out.println("Maullando...");
    }
}

class PrebaAnimales{

    //Metodo Polimorfico
    static void imprimirSonido(Animales animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //Objeto de la clase Padre (Animales)
        var animal = new Animales();
        imprimirSonido(animal);

        var perro = new Perros();
        imprimirSonido(perro);

        var gato = new Gatos();
        imprimirSonido(gato);

    }
}


