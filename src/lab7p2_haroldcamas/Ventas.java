package lab7p2_haroldcamas;

public class Ventas {
    Vendedor vendedor;
    Cliente cliente;
    Vehiculo carro;
    int costo;

    public Ventas() {
    }

    public Ventas(Vendedor vendedor, Cliente cliente, Vehiculo carro, int costo) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.carro = carro;
        this.costo = carro.getPrecioVenta();
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Ventas{" + "vendedor=" + vendedor + ", cliente=" + cliente + ", carro=" + carro + ", costo=" + costo + '}';
    }
}
