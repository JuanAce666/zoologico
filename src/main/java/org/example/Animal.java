package org.example;

public class Animal {

    String nombre;
    String genero;
    double peso;
    Animal pareja;
    public Animal(){

    }

    public Animal(String nombre, String genero, double peso) {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                ", pareja=" + pareja +
                '}';
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public Animal getPareja() {return pareja;}

    public void setPareja(Animal pareja) {this.pareja = pareja;}

    public void encontrarPareja(Animal pareja){this.pareja=pareja;}


}
