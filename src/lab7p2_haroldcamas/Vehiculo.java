package lab7p2_haroldcamas;

import java.awt.Color;

public class Vehiculo {
    String marca;
    Color color;
    String modelo;
    int año;
    int precioVenta;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, Color color, String Modelo, int año, int precioVenta) {
        this.marca = Marca;
        this.color = color;
        this.modelo = Modelo;
        this.año = año;
        this.precioVenta = precioVenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}