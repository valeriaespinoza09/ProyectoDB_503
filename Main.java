public class Main {
    public static void main(String[] args) {
        Cotizacion c1 = new Cotizacion(1, "Valeria", "Laptop", 2, 8500);
        System.out.println("Cliente: " + c1.getCliente());
        System.out.println("Producto: " + c1.getProducto());
        System.out.println("Total: " + c1.getTotal());
    }
}
