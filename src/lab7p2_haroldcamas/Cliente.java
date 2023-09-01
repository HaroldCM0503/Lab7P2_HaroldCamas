package lab7p2_haroldcamas;

public class Cliente {
    String nombre;
    int edad;
    String profesion;
    int cantidadComprados;
    int sueldo;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String profesion, int cantidadComprados, int sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.cantidadComprados = cantidadComprados;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCantidadComprados() {
        return cantidadComprados;
    }

    public void setCantidadComprados(int cantidadComprados) {
        this.cantidadComprados = cantidadComprados;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
