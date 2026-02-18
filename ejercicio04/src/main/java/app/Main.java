package app; // Paquete principal

public class Main { // Clase principal del programa

    public static void main(String[] args) { // Punto de entrada del programa

        Recursoc r1 = new Recursoc(); // Se crea el recurso compartido

        for (int i = 1; i <= 3; i++) { // Ciclo para crear lectores
            new Lector(r1, i).start(); // Se crea y se inicia un lector
        }

        for (int i = 1; i <= 2; i++) { // Ciclo para crear escritores
            new Escritor(r1, i).start(); // Se crea y se inicia un escritor
        }
    }
}