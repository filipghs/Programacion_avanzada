package ejercicio7; // Define el paquete del programa principal

import java.util.concurrent.Semaphore; // Importa Semaphore para manejar los tenedores

public class MainFilosofos { // Clase principal del programa

    public static void main(String[] args) { // Método principal de ejecución

        Semaphore[] tenedores = new Semaphore[5]; // Arreglo de semáforos que representan los 5 tenedores

        for (int i = 0; i < 5; i++) { // Inicializa cada tenedor
            tenedores[i] = new Semaphore(1, true); // Cada tenedor permite un solo filósofo a la vez y usa equidad para evitar inanición
        }

        for (int i = 0; i < 5; i++) { // Crea los 5 filósofos

            Semaphore izquierdo = tenedores[i]; // El tenedor izquierdo corresponde a la posición i
            Semaphore derecho = tenedores[(i + 1) % 5]; // El tenedor derecho es el siguiente (uso de módulo para el último)

            if (i == 4) // Caso especial para el último filósofo
                new Filosofo(i, derecho, izquierdo).start(); // El último filósofo toma primero el derecho, rompiendo la simetría
            else
                new Filosofo(i, izquierdo, derecho).start(); // Los demás toman primero el izquierdo
        }
    }
}


