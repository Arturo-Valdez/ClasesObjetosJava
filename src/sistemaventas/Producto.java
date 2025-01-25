package sistemaventas;

public class Producto {
    //Atributos
    private final int idProducto;
    private String nombre;
    private double precio;
    private  static int contadorProductos;

    //Constructor
    public Producto(String nombre, double precio){
        this.idProducto = ++Producto.contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos Get y Set
    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo toString para impresion
    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
