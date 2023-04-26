public class Pagar  {
    double total=0;
    public void efectivo(IngresarProducto producto){
        double subtotal=pagar(producto);
        double total = subtotal*1.16;
        System.out.println("total a pagar con efectivo="+total);
    }
    public void Tarjeta(IngresarProducto producto){
        double subtotal=pagar(producto);
        double totaliva = subtotal*1.16;
        if(totaliva>80){
            double comision = (totaliva * 0.5)/100;
            System.out.println("total a pagar con tarjeta="+(totaliva+comision));
        }
    }
    private double  pagar(IngresarProducto producto){
        int size=producto.getArray().length;
        IngresarProducto[] productoArreglo= producto.getArray();
        for (int i=0;i<size;i++){
           int cantidad= productoArreglo[i].getCantidad();
           double precio= productoArreglo[i].getPrecio();
            total+=cantidad*precio;
        }
        return total;
    }
}
