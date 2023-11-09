package Model;

import java.math.BigDecimal;

public class Producto {
    private String nombre;
    private String categoria;
    private BigDecimal costo;
    private BigDecimal precio;    
    private int stock;

    public Producto(String nombre, String categoria, BigDecimal costo, BigDecimal precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public int getStock() {
        return stock;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
 
}
    
    
    
    
    
    
    
    
    
    

