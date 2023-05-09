package S101n3.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nombre;
    private String dni;
    private double sueldo;
    private List<Noticia> noticias;

    public Redactor(String nombre, String dni, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.noticias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void eliminarNoticia(Noticia noticia) {
        noticias.remove(noticia);
    }
    public void setNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void setNoticias(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

}
