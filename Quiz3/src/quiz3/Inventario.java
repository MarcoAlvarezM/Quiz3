/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3;

/**
 *
 * @author Marco
 */
public class Inventario {
    public String supermercado;
    public String codigo;
    public String n_producto;
    public String n_empleado;
    public String c_empleado;
    public int cantidad;
    public double precio;
    public String tipo;
    public double precio_bruto;
    public double ganancia;


    
    
    public Inventario() {
        this.supermercado="";
        this.codigo = "";
        this.n_producto = "";
        this.n_empleado = "";
        this.c_empleado = "";
        this.cantidad = 0;
        this.precio = 0;
        this.tipo = "";
        this.precio_bruto = 0;
        this.ganancia = 0;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getN_producto() {
        return n_producto;
    }

    public void setN_producto(String n_producto) {
        this.n_producto = n_producto;
    }

    public String getN_empleado() {
        return n_empleado;
    }

    public void setN_empleado(String n_empleado) {
        this.n_empleado = n_empleado;
    }

    public String getC_empleado() {
        return c_empleado;
    }

    public void setC_empleado(String c_empleado) {
        this.c_empleado = c_empleado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio_bruto() {
        return precio_bruto;
    }

    public void setPrecio_bruto(double precio_bruto) {
        this.precio_bruto = precio_bruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    
    
    
}
