/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 *
 * @author isabbb
 * @class autovolador 
 * @version 1.0
 * Clase de un auto volador que hereda de la clase carro para su implementación 
 * 
 */
public class autovolador extends carro{
    public boolean esta_Volando=false;

    public autovolador() {
    }

    public autovolador(String marca, String color, Date anioCompra, int año) {
        super(marca, color, anioCompra, año);
    }

    public boolean isEsta_Volando() {
        return esta_Volando;
    }

    public void setEsta_Volando(boolean esta_Volando) {
        this.esta_Volando = esta_Volando;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getAnioCompra() {
        return anioCompra;
    }

    public void setAnioCompra(Date anioCompra) {
        this.anioCompra = anioCompra;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    /**
     * Metodo volar para que el auto vuele o aterrice (definicion del metodo)
     * @param estado 
     * el estado es un booleano que controla, si estaa volando (explicacion del parametro)
     */
   public void Volar(boolean estado){
       this.esta_Volando=estado;
   }  
}
