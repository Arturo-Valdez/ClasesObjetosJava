package sistemaventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");

        //Productos generados
        var producto1 = new Producto("Blusa", 30.00);
        //System.out.println(producto1);
        var producto2 = new Producto("Zapato", 500.00);
        //System.out.println(producto2);


        //Primera Orden
        var orden1 = new Orden();
        //Agregar productos
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto1);
        //Mostrar productos de la orden
        //orden1.mostrarOrden();
        System.out.println(orden1);

        //Segunda Orden
        var orden2 = new Orden();
        //Agregar productos
        orden2.agregarProducto(new Producto("Gorra", 144.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto1);
        //Mostrar productos de la orden
        //orden1.mostrarOrden();
        System.out.println(orden2);

        //Tercera Orden Sobrecarga
        var orden3 = new Orden();
        //Agregar productos
        orden3.agregarProducto(new Producto("Gorra", 144.00));
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto2);
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(new Producto("Gorra", 144.00));
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto2);
        orden3.agregarProducto(new Producto("Gorra", 144.00));
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(new Producto("Pantalon", 50.00));
        orden3.agregarProducto(producto2);
        //Mostrar productos de la orden
        //orden1.mostrarOrden();
        System.out.println(orden3);
    }
}
