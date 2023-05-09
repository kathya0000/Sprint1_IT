package S101n3.Ex3;

public class Noticia {
    private String titular;
    private String texto;
    private int puntuacion;
    private double precio;
    private String deporte;

    public Noticia(String titular, String deporte) {
        this.titular = titular;
        this.deporte = deporte;
        this.texto = "";
        this.puntuacion = 0;
        this.precio = 0;
    }

    public String getTitular() {

        return titular;
    }

    public String getTexto() {

        return texto;
    }
    public int getPuntuacion() {

        return puntuacion;
    }
    public double getPrecio() {

        return precio;
    }
    public String getDeporte() {

        return deporte;
    }

    public void setTexto(String texto) {

        this.texto = texto;
    }
    public void setPuntuacion(int puntuacion) {

        this.puntuacion = puntuacion;
    }
    public void setPrecio(double precio) {

        this.precio = precio;
    }
    public void calcularPrecioNoticia() {
        switch (deporte) {
            case "fútbol":
                precio = 10;
                break;
            case "baloncesto":
                precio = 8;
                break;
            case "tenis":
                precio = 6;
                break;
            case "F1":
                precio = 12;
                break;
            case "motociclismo":
                precio = 7;
                break;
            default:
                precio = 5;
                break;
        }

        if (puntuacion > 0) {
            precio += puntuacion * 0.5;
        }
    }



}

