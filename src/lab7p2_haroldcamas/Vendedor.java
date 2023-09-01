package lab7p2_haroldcamas;

public class Vendedor {
    String nombre;
    int carrosVendidos;
    int dineroGenerado;

    public Vendedor() {
    }

    public Vendedor(String nombre, int carrosVendidos, int dineroGenerado) {
        this.nombre = nombre;
        this.carrosVendidos = carrosVendidos;
        this.dineroGenerado = dineroGenerado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarrosVendidos() {
        return carrosVendidos;
    }

    public void setCarrosVendidos(int carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }

    public int getDineroGenerado() {
        return dineroGenerado;
    }

    public void setDineroGenerado(int dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
