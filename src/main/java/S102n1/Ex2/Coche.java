package S102n1.Ex2;

public class Coche {
    public static final String MARCA = "Toyota";
    public static String modeloEstatico = "Corolla";
    public final int potenciaFinal;

    public Coche(int potencia) {
        this.potenciaFinal = potencia;
    }

    public static void frenar() {
        System.out.println("El vehículo está frenando");
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }
}
