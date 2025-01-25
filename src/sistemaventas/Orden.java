package sistemaventas;

import java.util.Arrays;

public class Orden {
    //Atributos
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final  int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    //Constructor solo incremento de idOrden
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    //Metodo agregar producto
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
    }

    //Metodo calcular Total
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            var producto = this.productos[i];
            total += producto.getPrecio();//total = total + procuto.getPrecio()

        }
        return total;
    }

//    public void mostrarOrden(){
//        System.out.println("Id Orden: " + this.idOrden);
//        var totalOrden = this.calcularTotal();
//        System.out.println("\tToal de la Orden: $" + totalOrden);
//        System.out.println("\tProductos de la Orden: ");
//        for (int i = 0; i < this.contadorProductos; i++) {
//            System.out.println("\t\t" + this.productos[i]);
//        }
//    }

    //Impresion metodo toString
    @Override
    public String toString() {
        var resultado = "Id Orden: " + this.idOrden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la Orden: $" + totalOrden + "\n";
        resultado += "\tProductos de la Orden: "+ "\n";
        for (int i = 0; i < this.contadorProductos; i++) {
            resultado += "\t\t" + this.productos[i]+ "\n";
        }
        return resultado;
    }
}
