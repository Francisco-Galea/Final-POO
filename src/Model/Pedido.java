package Model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import Model.Producto;

public class Pedido {
    private Date fechaApertura;
    private Date fechaCierre;
    private List<Producto> productos; // Lista de productos asociados al pedido
    private boolean pedidoCerrado;
    private float descuento;

    // Constructor para crear un Pedido
    public Pedido(Date fechaApertura, List<Producto> productos) {
        this.fechaApertura = fechaApertura;
        this.productos = productos;
        this.pedidoCerrado = false; // Por defecto, el pedido no está cerrado
        this.descuento = 0.0f; // Por defecto, no hay descuento
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public boolean getIsPedidoCerrado() {
        return pedidoCerrado;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public void setPedidoCerrado(boolean pedidoCerrado) {
        this.pedidoCerrado = pedidoCerrado;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    // Método para agregar un producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del pedido
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para cerrar el pedido
    public void cerrarPedido() {
        this.fechaCierre = new Date(); // Se registra la fecha de cierre
        this.pedidoCerrado = true;
    }

    // Método para calcular el total del pedido con descuento
    public float calcularTotalConDescuento() {
        float total = 0.0f;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        // Se aplica el descuento si está configurado
        total -= descuento;
        return total;
    }

    String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
