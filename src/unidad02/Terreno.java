/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad02;

/**
 *
 * @author eliez
 */

public class Terreno {
    // atributos
    private String numTerreno;
    private float ancho;
    private float largo;

    // constante para el formato de los números (antes venía de la interfaz)
   

    // metodos

    // metodo constructor por omision
    public Terreno() {
        this.numTerreno = "Sin numero";
        this.ancho = 0.0f;
        this.largo = 0.0f;
    }

    // constructor por argumento
    public Terreno(String numTerreno, float ancho, float largo) {
        this.numTerreno = numTerreno;
        this.ancho = ancho;
        this.largo = largo;
    }

    // constructor por copia
    public Terreno(Terreno x) {
        this.numTerreno = x.numTerreno;
        this.ancho = x.ancho;
        this.largo = x.largo;
    }

    // metodos set/get

    public void setNumTerreno(String numTerreno) {
        this.numTerreno = numTerreno;
    }

    public String getNumTerreno() {
        return this.numTerreno;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAncho() {
        return this.ancho;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getLargo() {
        return this.largo;
    }

    // metodos de comportamiento

    public float calcularPerimetro() {
        float perimetro = 0.0f;
        perimetro = this.ancho * 2 + this.largo * 2;
        return perimetro;
    }

    public float calcularArea() {
        float area = 0.0f;
        area = this.ancho * this.largo;
        return area;
    }

    public void imprimir() {
        System.out.println("Num. Lote " + this.numTerreno);
        System.out.println("Ancho: " + this.ancho);
        System.out.println("Largo: " + this.largo);
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Perimetro: " + this.calcularPerimetro());
    }
   
    
}
