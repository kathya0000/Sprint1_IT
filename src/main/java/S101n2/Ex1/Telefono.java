package S101n2.Ex1;

public class Telefono {

    protected String marca;
    protected String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método llamar
    public void llamar(String numero) {
        System.out.println("Mi teléfono marca " + marca + " modelo " + modelo + " está llamando al teléfono " + numero);
    }
}