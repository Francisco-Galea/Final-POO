package Model;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numeroMesa;
    private int idMesa;
    private boolean activo;
    private List<Pedido> pedidos;


public Mesa(int idMesa, int numeroMesa, boolean activo) {
    this.idMesa = idMesa;
    this.numeroMesa = numeroMesa;
    this.activo = activo;
    this.pedidos = new ArrayList<>();
}

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getIdMesa() {
        return idMesa;
    }
    public boolean isActivo() {
        return activo;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}