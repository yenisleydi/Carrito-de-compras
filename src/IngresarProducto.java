import java.util.Scanner;

public class IngresarProducto extends Producto{
    IngresarProducto[] productos;
    @Override
    public  void ingresar(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("cuantos productos quieres registrar:");
        int n=scanner.nextInt();
        scanner.nextLine();
        productos =  new IngresarProducto[n];
        for (int i = 0; i < n ; i++) {
            productos[i]=new IngresarProducto();
            System.out.println("Ingresa el nombre del producto que deseas agregar al carrito");
            String nombre = scanner.nextLine();
            productos[i].setNombreProducto(nombre);
            System.out.println("Ingrese la cantidad de productos que va a agregar");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            productos[i].setCantidad(cantidad);
            System.out.println("Ingrese el precio del producto");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            productos[i].setPrecio(precio);
        }
    }
    public void mostrar(){
        for (int i = 0; i <productos.length ; i++) {
            System.out.println(productos[i]);
        }
    }
    public IngresarProducto[] getArray(){
        return productos;
    }
}
