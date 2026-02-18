package ejercicio7; // Define el paquete donde se encuentra esta clase

import java.util.concurrent.Semaphore; // Importa la clase Semaphore para controlar el acceso concurrente a los tenedores

class Filosofo extends Thread { // Clase Filosofo que extiende Thread para ejecutarse como hilo independiente

    private Semaphore izquierdo; // Semáforo que representa el tenedor izquierdo del filósofo
    private Semaphore derecho;   // Semáforo que representa el tenedor derecho del filósofo
    private int id;              // Identificador único del filósofo

    public Filosofo(int id, Semaphore izquierdo, Semaphore derecho) { // Constructor que recibe el id y los dos tenedores
        this.id = id;             // Asigna el identificador del filósofo
        this.izquierdo = izquierdo; // Asigna el semáforo del tenedor izquierdo
        this.derecho = derecho;     // Asigna el semáforo del tenedor derecho
    }

    @Override
    public void run() { // Método que contiene el comportamiento concurrente del filósofo
        try {
            while (true) {  // Bucle infinito para simular que el filósofo alterna entre pensar y comer continuamente

                System.out.println("Filosofo " + id + " pensando"); // El filósofo se encuentra en estado de pensamiento
                Thread.sleep((long)(Math.random() * 1000)); // Simula el tiempo aleatorio que tarda pensando

                izquierdo.acquire(); // Intenta tomar el tenedor izquierdo (bloquea si otro filósofo lo tiene)
                derecho.acquire();   // Intenta tomar el tenedor derecho (solo continúa si ambos están disponibles)

                System.out.println("Filosofo " + id + " comiendo"); // El filósofo comienza a comer al tener ambos tenedores
                Thread.sleep((long)(Math.random() * 1000)); // Simula el tiempo que tarda comiendo

                izquierdo.release(); // Libera el tenedor izquierdo para que otros filósofos puedan usarlo
                derecho.release();   // Libera el tenedor derecho, permitiendo continuar a otros hilos
            }

        } catch (InterruptedException e) { // Captura una posible interrupción del hilo
            e.printStackTrace(); // Imprime el error en consola
        }
    }
}