import java.util.Scanner;

public class Menu {
    public void menu(){
        IngresarProducto ingresarProducto=new IngresarProducto();
        Pagar pagar = new Pagar();
        Scanner scanner=new Scanner(System.in);
        int elegir;
        do {
            System.out.println("------- Menu carrito ------");
            System.out.println("[1]. Ingresar producto");
            System.out.println("[2]. Mostrar el carrito");
            System.out.println("[3]. Pagar con efectivo");
            System.out.println("[4]. Pagar con tarjeta");
            System.out.println("[5]. Salir");
            elegir = scanner.nextInt();
            switch (elegir) {
                case 1 ->
                    ingresarProducto.ingresar();
                case 2 ->
                    ingresarProducto.mostrar();
               case 3 ->pagar.efectivo(ingresarProducto);
               case 4 -> pagar.Tarjeta(ingresarProducto);


            }
        } while (elegir!=5);
    }
}
