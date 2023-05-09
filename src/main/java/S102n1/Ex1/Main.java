package S102n1.Ex1;


public class Main {
    public static void main(String[] args) {
        InstrumentoDeViento flauta = new InstrumentoDeViento("Flauta", 100.0);
        InstrumentoDeCuerda guitarra = new InstrumentoDeCuerda("Guitarra", 200.0);
        InstrumentoDePercusion tambor = new InstrumentoDePercusion("Tambor", 50.0);

        flauta.tocar();
        guitarra.tocar();
        tambor.tocar();
    }
}
