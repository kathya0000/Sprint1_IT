package S101n2.Ex1;

// Clase Smartphone, que extiende Teléfono e implementa Cámara y Reloj
public class Smartphone extends Telefono implements Camara, Reloj {
    // Constructor
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementación del método fotografiar de la interfaz Cámara
    public void fotografiar() {
        System.out.println("Mi teléfono marca " + marca + " modelo " + modelo + " está haciendo una foto");
    }

    // Implementación del método alarma de la interfaz Reloj
    public void alarma() {
        System.out.println("Mi teléfono marca " + marca + " modelo " + modelo + " está sonando la alarma");
    }
}

