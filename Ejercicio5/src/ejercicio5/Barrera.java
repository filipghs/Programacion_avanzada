package ejercicio5; // Define el paquete donde se encuentra este ejercicio

import java.util.concurrent.BrokenBarrierException; // Excepción que se lanza si la barrera se rompe
import java.util.concurrent.CyclicBarrier; // Clase que permite sincronizar un conjunto de hilos en puntos comunes

class Trabajador implements Runnable { // Clase Trabajador que implementa Runnable para ser ejecutada por un hilo

    private final CyclicBarrier barrera; // Referencia a la barrera compartida por todos los hilos
    private final int id;                // Identificador del hilo, usado para mostrar mensajes en consola

    public Trabajador(int id, CyclicBarrier barrera) { // Constructor que recibe el id del hilo y la barrera compartida
        this.id = id;                                 // Asigna el identificador del hilo
        this.barrera = barrera;                       // Asigna la barrera compartida
    }

    @Override
    public void run() { // Método que se ejecuta cuando el hilo inicia su ejecución
        try {
            for (int fase = 1; fase <= 3; fase++) { // Ciclo que simula 3 fases de trabajo
                System.out.println("Hilo " + id + " ejecutando fase " + fase); // Muestra que el hilo está trabajando en la fase actual
                Thread.sleep((long)(Math.random() * 1000)); // Simula tiempo de ejecución aleatorio para cada fase

                System.out.println("Hilo " + id + " esperando a que los demas hilos terminen"); // Indica que el hilo llegó a la barrera
                barrera.await(); // El hilo se bloquea hasta que todos los hilos lleguen a este punto
            }
        } catch (InterruptedException | BrokenBarrierException e) { // Captura interrupciones o ruptura de la barrera
            // En este caso la excepción se ignora, pero en un sistema real debería manejarse adecuadamente
        }
    }
}

public class Barrera { // Clase principal que contiene el método main
    public static void main(String[] args) { // Punto de entrada del programa

        CyclicBarrier barrera = new CyclicBarrier(5, () -> // Se crea una barrera cíclica para 5 hilos
            System.out.println("Todos completaron la fase\n") // Acción que se ejecuta automáticamente cuando todos llegan a la barrera
        );

        for (int i = 1; i <= 5; i++) { // Ciclo para crear 5 hilos trabajadores
            new Thread(new Trabajador(i, barrera)).start(); // Se crea y se inicia cada hilo, todos compartiendo la misma barrera
        }
    }
}
