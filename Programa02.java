import java.util.Scanner;
public class Programa02 {
    static GestorProductos gestorProductos = new GestorProductos();
    static GestorClientes gestorClientes = new GestorClientes();
    static GestorVentas gestorVentas = new GestorVentas();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        gestorProductos.inicializarProductos();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENU DEL SISTEMA ---");
            System.out.println("1. Ingresar Producto");
            System.out.println("2. Mostrar Productos");
            System.out.println("3. Ingresar Cliente");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Realizar Venta");
            System.out.println("6. Generar boleta de venta");
            System.out.println("7. Modificar Producto");
            System.out.println("8. Salir");
            System.out.print("SELECCIONE UNA OPCION: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> gestorProductos.ingresarProducto();
                case 2 -> gestorProductos.mostrarProductos();
                case 3 -> gestorClientes.ingresarCliente();
                case 4 -> gestorClientes.mostrarClientes();
                case 5 -> gestorVentas.realizarVenta(gestorProductos, gestorClientes);
                case 6 -> gestorVentas.mostrarVentas();
                case 7 -> gestorProductos.modificarProducto();
         
                case 8 -> {
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opción invalida, intente de nuevo.");
            }
        }
    }
}


