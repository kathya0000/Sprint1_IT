package S102n1.Ex1;

public class InstrumentoDeViento extends Instrumento {
    public InstrumentoDeViento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {

        System.out.println("Está sonando un instrumento de viento");
    }
}




