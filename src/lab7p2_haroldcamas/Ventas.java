package lab7p2_haroldcamas;

public class Ventas {
    String vendedor;
    String cliente;
    String carro;
    int costo;

    public Ventas() {
    }

    public Ventas(String vendedor, String cliente, String carro, int costo) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.carro = carro;
        this.costo = costo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
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
