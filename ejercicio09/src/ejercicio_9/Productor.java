
package ejercicio_9;

public class Productor extends Thread {
    private final int id;//.
    private final ColaTareas cola;  //identificador y referencia compartida
    
    public Productor(int id,ColaTareas cola){   //constructor de la clase
    this.id=id;
    this.cola=cola;
    }
    
    @Override
    public void run() { //codigo concurrente del productor
        try {
            cola.agregarTarea(() ->
                    System.out.println("Tarea ejecutada por " + Thread.currentThread().getName())); //se crea una tarea mas no se ejecuta
            System.out.println("Productor " + id + " agregó una tarea");    //simplemente visual
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
