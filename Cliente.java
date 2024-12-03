public class Cliente {
    private final String nombre;
    private final String cedula;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarCliente() {
        System.out.println("Nombre: " + nombre + ", DNI: " + cedula);
    }
}
