/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coladeprioridad;


class Cliente {
    private String nombre;
    private int id;
    private boolean membresiaPremium;

    public Cliente(String nombre, int id, boolean membresiaPremium) {
        this.nombre = nombre;
        this.id = id;
        this.membresiaPremium = membresiaPremium;
    }

    
    // Otros métodos de la clase Cliente...

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMembresiaPremium() {
        return membresiaPremium;
    }

    public void setMembresiaPremium(boolean membresiaPremium) {
        this.membresiaPremium = membresiaPremium;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + id + ", Membresia Premium: " + membresiaPremium;
    }
}
