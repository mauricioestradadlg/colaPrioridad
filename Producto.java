/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coladeprioridad;

/**
 *
 * @author ntact
 */
public class Producto {
    
     //Atributos
    String nombre;
    double precio;
    int id;

    //Constructores
    public Producto() {
    }

    
    public Producto(String nombre, double precio, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
     @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
    
    
    
    
}
