
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Venta {
    private final Cliente cliente;
    private final Producto producto;
    private final int cantidad;

    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }



    public void mostrarVenta() {
        // Información adicional
        String numeroEmpresa = "2065122553";
        String vendedor = "Mirtha Salas A.";

        // Fecha y hora actual
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = now.format(formatter);

        // Logo y encabezado de la boleta
        System.out.println("\n*****************************************");
        System.out.println("            ┌─────────────┐             ");
        System.out.println("            │   COMPANY   │             ");
        System.out.println("    ┌───────┤             ├───────┐");
        System.out.println("    │       └─────────────┘       │");
        System.out.println("    │       *** BEST BUY ***      │");
        System.out.println("    │     SERVICIO, CALIDAD       │");
        System.out.println("    │       Y COMPROMISO          │");
        System.out.println("    └─────────────────────────────┘");
        System.out.println("*****************************************");
        System.out.println("           BOLETA DE VENTA              ");
        System.out.println("*****************************************");


        // Información de la empresa y vendedor
        System.out.println("RUC: " + numeroEmpresa);
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Fecha y Hora: " + fechaHora);
        System.out.println("*****************************************");

        // Detalles de la venta
        double subtotal = producto.getPrecio() * cantidad;
        double igv = subtotal * 0.18; // Suponiendo un 18% de IGV
        double total = subtotal + igv;

        // Mostrar la venta
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.printf("Precio Unitario: S/ %.2f\n", producto.getPrecio());
        System.out.printf("Subtotal: S/ %.2f\n", subtotal);
        System.out.printf("IGV (18%%): S/ %.2f\n", igv);

        // Total a Pagar en negrita
        String totalPagar = String.format("Total a Pagar: S/ %.2f", total);
        System.out.println("\033[1m" + totalPagar + "\033[0m");  // \033[1m es el código ANSI para negrita

        System.out.println("*****************************************");
        System.out.println("Gracias por su compra...!!");
    }


    Cliente getCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
