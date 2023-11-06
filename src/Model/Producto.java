package Model;

import java.util.List;

public class Producto {
    private String nombre;
    private String categoria;
    private float precio;
    private float costo;
    private int stock;

    // Constructor para crear un Producto
    public Producto(String nombre, String categoria, float precio, float costo, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.costo = costo;
        this.stock = stock;
    }

    // Métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public float getCosto() {
        return costo;
    }

    public int getStock() {
        return stock;
    }

    // Métodos para actualizar los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para eliminar el Producto (Delete)
    public void eliminarProducto() {
        // Aquí implementarías la lógica para eliminar el producto de tu sistema
        // Puedes eliminarlo de una base de datos o realizar la acción que corresponda
    }

    // Método para mostrar información del Producto (Read)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Costo: $" + costo);
        System.out.println("Stock: " + stock);
    }

    // Método para actualizar información del Producto (Update)
    public void actualizarProducto(String nuevoNombre, String nuevaCategoria, float nuevoPrecio, float nuevoCosto, int nuevoStock) {
        this.nombre = nuevoNombre;
        this.categoria = nuevaCategoria;
        this.precio = nuevoPrecio;
        this.costo = nuevoCosto;
        this.stock = nuevoStock;
    }

    // Método estático para listar productos en una tabla desde la vista
    public static void listarProductosEnTabla(List<Producto> productos) {
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-15s | %-10s | %-10s | %-10s |\n", "Nombre", "Categoría", "Precio", "Costo", "Stock");
        System.out.println("------------------------------------------------------------------------");
        for (Producto producto : productos) {
            System.out.printf("| %-20s | %-15s | $%-9.2f | $%-9.2f | %-10d |\n", producto.getNombre(), producto.getCategoria(), producto.getPrecio(), producto.getCosto(), producto.getStock());
        }
        System.out.println("------------------------------------------------------------------------");
    }
    
    
    
}
    
    
    
    
    
    
    
    
    
    

