
package ejercicio_9;

public class Consumidor extends Thread {
    
    private final ColaTareas cola;  // hace referencia a la cola compartida

    public Consumidor(ColaTareas cola) {    //instanciador de la clase
        this.cola = cola;
    }
    
    @Override
    public void run() { //aqui se ejecuta como tal el codigo concurrente
        try {
            while (true) {  // el consumidor se ejecuta indefinidamente
                Runnable tarea = cola.obtenerTarea();   //en el caso de no haber tareas espera y no consume cpu
                tarea.run();    //ejecuta la tarea
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
