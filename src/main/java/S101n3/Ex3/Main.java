package S101n3.Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Redactor> redactores = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("1.- Introducir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introducir noticia a un redactor.");
            System.out.println("4.- Eliminar noticia (debe pedir redactor y titular de la noticia).");
            System.out.println("5.- Mostrar todas las noticias por redactor.");
            System.out.println("6.- Calcular puntuación de la noticia.");
            System.out.println("7.- Calcular precio-noticia.");
            System.out.println("Elija una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    // Introducir redactor
                    System.out.println("Introduzca el nombre del redactor: ");
                    String nombre = input.next();
                    System.out.println("Introduzca el DNI del redactor: ");
                    String dni = input.next();
                    Redactor redactor = new Redactor(nombre, dni, 1500);
                    redactores.add(redactor);
                    System.out.println("Redactor añadido correctamente.");
                    break;

                case 2:
                    // Eliminar redactor
                    System.out.println("Introduzca el DNI del redactor que desea eliminar: ");
                    dni = input.next();
                    for (Redactor redac : redactores) {
                        if (redac.getDni().equals(dni)) {
                            redactores.remove(redac);
                            System.out.println("Redactor eliminado correctamente.");
                            break;
                        }
                    }
                    break;

                case 3:
                    // Introducir noticia a un redactor
                    System.out.println("Introduzca el DNI del redactor al que desea añadir la noticia: ");
                    dni = input.next();
                    Redactor redac = null;
                    for (Redactor red : redactores) {
                        if (red.getDni().equals(dni)) {
                            redac = red;
                            break;
                        }
                    }
                    if (redac == null) {
                        System.out.println("No existe ningún redactor con ese DNI.");
                    } else {
                        System.out.println("Introduzca el titular de la noticia: ");
                        String titular = input.next();
                        System.out.println("Introduzca el deporte de la noticia (fútbol, baloncesto, tenis, F1 o motociclismo): ");
                        String deporte = input.next();
                        Noticia noticia = new Noticia(titular, deporte);
                        if (redac.getNoticias() == null) {
                            redac.setNoticias(new ArrayList<>());
                        }
                        redac.getNoticias().add(noticia);
                        System.out.println("Noticia añadida correctamente.");
                    }

                    break;

                case 4:
                    // Eliminar noticia
                    System.out.println("Introduzca el DNI del redactor: ");
                    dni = input.next();
                    System.out.println("Introduzca el titular de la noticia: ");
                    String titular = input.next();
                    redac = null;
                    for (Redactor red : redactores) {
                        if (red.getDni().equals(dni)) {
                            redac = red;
                            break;
                        }
                    }
                    if (redac == null) {
                        System.out.println("No existe ningún redactor con ese DNI.");
                    } else {
                        boolean eliminado = false;
                        for (Noticia noti : redac.getNoticias()) {
                            if (noti.getTitular().equals(titular)) {
                                redac.getNoticias().remove(noti);
                                System.out.println("Noticia eliminada correctamente.");
                                eliminado = true;
                                break;
                            }
                        }
                        if (!eliminado) {
                            System.out.println("No existe ninguna noticia con ese titular.");
                        }
                    }
                    break;

                case 5:
                    // Mostrar todas las noticias por redactor
                    System.out.println("Introduzca el DNI del redactor: ");
                    dni = input.next();
                    redac = null;
                    for (Redactor red : redactores) {
                        if (red.getDni().equals(dni)) {
                            redac = red;
                            break;
                        }
                    }
                    if (redac == null) {
                        System.out.println("No existe ningún redactor con ese DNI.");
                    } else {
                        System.out.println("Noticias del redactor " + redac.getNombre() + ":");
                        for (Noticia noti : redac.getNoticias()) {
                            System.out.println("- " + noti.getTitular());
                        }
                    }
                    break;

                case 6:
                    // Calcular puntuación de la noticia
                    System.out.println("Introduzca el titular de la noticia: ");
                    titular = input.next();
                    Noticia noticia = null;
                    for (Redactor red : redactores) {
                        for (Noticia noti : red.getNoticias()) {
                            if (noti.getTitular().equals(titular)) {
                                noticia = noti;
                                break;
                            }
                        }
                        if (noticia != null) {
                            break;
                        }
                    }
                    if (noticia == null) {
                        System.out.println("No existe ninguna noticia con ese titular.");
                    } else {
                        int puntuacion = 0;
                        switch (noticia.getDeporte()) {
                            case "fútbol":
                                puntuacion += 5;
                                if (noticia.getTitular().contains("Liga de Campeones")) {
                                    puntuacion += 3;
                                    noticia.setPrecio(noticia.getPrecio() + 100);
                                } else if (noticia.getTitular().contains("Liga") && !noticia.getTitular().contains("Liga de Campeones")) {
                                    puntuacion += 2;
                                }
                                if (noticia.getTitular().contains("Barça") || noticia.getTitular().contains("Madrid")) {
                                    puntuacion += 1;
                                    noticia.setPrecio(noticia.getPrecio() + 100);
                                }
                                if (noticia.getTitular().contains("Ferran Torres") || noticia.getTitular().contains("Benzema")) {
                                    puntuacion += 1;
                                    noticia.setPrecio(noticia.getPrecio() + 50);

                                }
                            case "baloncesto":
                                puntuacion += 4;
                                if (noticia.getTitular().contains("Euroliga")) {
                                    puntuacion += 3;
                                    noticia.setPrecio(noticia.getPrecio() + 75);
                                } else if (noticia.getTitular().contains("ACB") && !noticia.getTitular().contains("Euroliga")) {
                                    puntuacion += 2;
                                }
                                if (noticia.getTitular().contains("Barça") || noticia.getTitular().contains("Madrid")) {
                                    puntuacion += 1;
                                    noticia.setPrecio(noticia.getPrecio() + 75);
                                }
                                break;

                            case "tenis":
                                puntuacion += 4;
                                if (noticia.getTitular().contains("Federer") || noticia.getTitular().contains("Nadal") || noticia.getTitular().contains("Djokovic")) {
                                    puntuacion += 3;
                                    noticia.setPrecio(noticia.getPrecio() + 100);
                                }
                                break;

                            case "F1":
                                puntuacion += 4;
                                if (noticia.getTitular().contains("Ferrari") || noticia.getTitular().contains("Mercedes")) {
                                    puntuacion += 2;
                                    noticia.setPrecio(noticia.getPrecio() + 50);
                                }
                                break;

                            case "motociclismo":
                                puntuacion += 3;
                                if (noticia.getTitular().contains("Honda") || noticia.getTitular().contains("Yamaha")) {
                                    puntuacion += 3;
                                    noticia.setPrecio(noticia.getPrecio() + 50);
                                }
                                break;

                            default:
                                break;
                        }
                        System.out.println("La puntuación de la noticia \"" + noticia.getTitular() + "\" es " + puntuacion + ".");
                    }
                    break;

                case 7:
                    // Calcular precio-noticia
                    System.out.println("Introduzca el titular de la noticia: ");
                    titular = input.next();
                    noticia = null;
                    for (Redactor red : redactores) {
                        for (Noticia noti : red.getNoticias()) {
                            if (noti.getTitular().equals(titular)) {
                                noticia = noti;
                                break;
                            }
                        }
                        if (noticia != null) {
                            break;
                        }
                    }
                    if (noticia == null) {
                        System.out.println("No existe ninguna noticia con ese titular.");
                    } else {
                        noticia.calcularPrecioNoticia();
                        System.out.println("El precio de la noticia \"" + noticia.getTitular() + "\" es " + noticia.getPrecio() + "€.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}



