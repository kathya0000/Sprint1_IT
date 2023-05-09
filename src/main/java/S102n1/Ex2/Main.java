package S102n1.Ex2;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche(150);
        Coche coche2 = new Coche(200);

        System.out.println(coche1.MARCA); // "Toyota"
        System.out.println(coche1.modeloEstatico); // "Corolla"
        System.out.println(coche1.potenciaFinal); // 150

        System.out.println(coche2.MARCA); // "Toyota"
        System.out.println(coche2.modeloEstatico); // "Corolla"
        System.out.println(coche2.potenciaFinal); // 200

        coche1.modeloEstatico = "Camry";

        System.out.println(coche1.modeloEstatico); // "Camry"
        System.out.println(coche2.modeloEstatico); // "Corolla" porque el atributo es estático


        Coche.frenar(); // "El vehículo está frenando"

        Coche coche3 = new Coche(250);
        coche3.acelerar(); // "El vehículo está acelerando"
    }
}
