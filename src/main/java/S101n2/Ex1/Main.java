package S101n2.Ex1;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Smartphone
        Smartphone miTelefono = new Smartphone("Samsung", "Galaxy S21");

        // Llamar al método llamar de la clase Teléfono
        miTelefono.llamar("123456789");

        // Llamar al método fotografiar de la interfaz Cámara
        miTelefono.fotografiar();

        // Llamar al método alarma de la interfaz Reloj
        miTelefono.alarma();
    }
}