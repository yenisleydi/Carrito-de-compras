public abstract class Producto {
  private String nombreProducto;
  private Double precio;
  private int cantidad;

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract void ingresar();
    @Override
    public String toString(){
        return "Nombre producto: " + nombreProducto + "\nPrecio: " + precio + "\nCantidad: " +cantidad;
    }
}
