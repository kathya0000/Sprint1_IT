package S102n1.Ex1;

public abstract class Instrumento {
    private String nombre;
    private double precio;

    public Instrumento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {

        return nombre;
    }

    public double getPrecio() {

        return precio;
    }

    public abstract void tocar();
}

