import java.util.ArrayList;
import java.util.Scanner;

public class GestorProductos {
    private final ArrayList<Producto> productos = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void ingresarProducto() {
        try {
             System.out.print("Ingrese el nombre del producto: ");
             String nombre = scanner.nextLine();
             double precio;
             do {
                 System.out.print("Ingrese el precio del producto (debe ser mayor a 0): ");
                 precio = Double.parseDouble(scanner.nextLine());
                 if (precio <= 0) {
                     System.out.println("El precio debe ser mayor a 0.");
                 }
             } while (precio <= 0);

             int stock;
             do {
                 System.out.print("Ingrese el stock del producto (debe ser mayor o igual a 0): ");
                 stock = Integer.parseInt(scanner.nextLine());
                 if (stock < 0) {
                     System.out.println("El stock no puede ser negativo.");
                 }
             } while (stock < 0);

             System.out.print("Ingrese la categoría del producto: ");
             String categoria = scanner.nextLine();

             productos.add(new Producto(nombre, precio, stock, categoria));
             System.out.println("Producto agregado exitosamente.");
        } catch (NumberFormatException e) {
             System.out.println("Entrada inválida. Intente de nuevo.");
        }
     }


    public void mostrarProductos() {
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
    }
public void inicializarProductos() {
    productos.add(new Producto("Laptop HP", 2500.0, 10, "Computo"));
    productos.add(new Producto("Mouse Logitech", 50.0, 25, "Computo"));
    productos.add(new Producto("Teclado mecanico", 150.0, 15, "Computo"));
    productos.add(new Producto("Monitor Samsung", 800.0, 8, "Computo"));
    productos.add(new Producto("Disco duro externo", 300.0, 12, "Computo"));
    productos.add(new Producto("Memoria ram", 150.0, 12, "Computo"));
    productos.add(new Producto("Disco solido", 250.0, 10, "Computo"));
    System.out.println("               BEST BUY               ");
    System.out.println("LISTA DE PRODUCTOS DE COMPUTO & TECNOLOGIA ");
}
    public void modificarProducto() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        Producto producto = buscarProducto(nombre);
        if (producto == null) {
            System.out.println("Producto no encontrado.");
            return;
        }
        System.out.print("Ingrese el nuevo precio: ");
        producto.setPrecio(scanner.nextDouble());
        System.out.print("Ingrese el nuevo stock: ");
        producto.setStock(scanner.nextInt());
        scanner.nextLine(); // limpiar buffer
        System.out.print("Ingrese la nueva categoría: ");
        producto.setCategoria(scanner.nextLine());

        System.out.println("Producto modificado exitosamente.");
    }


    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}
