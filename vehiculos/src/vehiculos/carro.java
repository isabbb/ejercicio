/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 *
 * @author sistemas
 */
public class carro {
    private String marca;
    public String color;
    public Date anioCompra;
    public int año;

    public carro() {
    }

    public carro(String marca, String color, Date anioCompra, int año) {
        this.marca = marca;
        this.color = color;
        this.anioCompra = anioCompra;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
    
    


}