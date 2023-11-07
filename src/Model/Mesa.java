package Model;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numeroMesa;
    private int id;
    private boolean activo;
    private List<Pedido> pedidos; // Atributo para almacenar la lista de pedidos
    
    
    public Mesa(int numeroMesa, int id, boolean activo) {
        this.numeroMesa = numeroMesa;
        this.id = id;
        this.activo = activo;
        this.pedidos = new ArrayList<>(); // Inicializamos la lista de pedidos vacía
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getid() {
        return id;
    }

    public boolean getisActivo() {
        return activo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido); // Agrega un pedido a la lista
    }

    public void eliminarPedido(Pedido pedido) {
        pedidos.remove(pedido); // Elimina un pedido de la lista
    }

    
    /*
    public void mostrarInformacion() {
        System.out.println("Numero de mesa: " + numeroMesa);
        System.out.println("ID: " + id);
        System.out.println("Activo: " + (activo ? "Sí" : "No"));
        System.out.println("Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println("  - " + pedido.getDescripcion());
        }
    }

    public void actualizarMesa(int nuevoNumero, int nuevoId, boolean nuevoActivo) {
        this.numeroMesa = nuevoNumero;
        this.id = nuevoId;
        this.activo = nuevoActivo;
    }
   */
}