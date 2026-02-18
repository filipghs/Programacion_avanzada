package ejercicio6; // Define el paquete donde se encuentra el ejercicio, usado para organizar el código

class Recurso {} // Clase vacía que representa un recurso compartido que será bloqueado por los hilos usando synchronized

public class Deadlock { // Clase principal que demuestra una situación clásica de interbloqueo (deadlock)

    private static final Recurso recurso1 = new Recurso(); // Primer recurso compartido, accesible por ambos hilos
    private static final Recurso recurso2 = new Recurso(); // Segundo recurso compartido, también accesible por ambos hilos
    

    public static void main(String[] args) { // Método principal donde se crean y ejecutan los hilos

        Thread hilo1 = new Thread(() -> { // Creación del primer hilo usando una expresión lambda
            synchronized (recurso1) { // El hilo 1 adquiere el bloqueo del recurso1
                System.out.println("Hilo 1 tomo recurso 1"); // Mensaje que confirma que el hilo 1 tiene el recurso1

                try { Thread.sleep(100); } catch (InterruptedException e) {} // Pausa intencional para aumentar la probabilidad de deadlock

                synchronized (recurso2) { // El hilo 1 intenta adquirir el recurso2 mientras aún mantiene el recurso1
                    System.out.println("Hilo 1 tomo recurso 2"); // Este mensaje normalmente no se imprime si ocurre el deadlock
                }
            }
        });

        Thread hilo2; // Declaración del segundo hilo
        hilo2 = new Thread(() -> { // Creación del segundo hilo usando una expresión lambda
            synchronized (recurso2) { // El hilo 2 adquiere primero el bloqueo del recurso2
                System.out.println("Hilo 2 tomo recurso 2"); // Mensaje que confirma que el hilo 2 tiene el recurso2

                try { Thread.sleep(100); } catch (InterruptedException e) {} // Pausa intencional para forzar la intercalación de los hilos

                synchronized (recurso1) { // El hilo 2 intenta adquirir el recurso1 mientras aún mantiene el recurso2
                    System.out.println("Hilo 2 tomo recurso 1"); // Este mensaje normalmente no se imprime si ocurre el deadlock
                }
            }
        });

        hilo1.start(); // Inicia la ejecución del hilo 1
        hilo2.start(); // Inicia la ejecución del hilo 2, creando la posibilidad de interbloqueo
    }
}