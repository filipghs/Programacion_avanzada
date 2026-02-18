
package ejercicio_9;

import java.util.concurrent.BlockingQueue;  // es una cola thread safe que maneja sincronizacion internamente
import java.util.concurrent.LinkedBlockingQueue;

public class ColaTareas {
    private final BlockingQueue<Runnable> cola = new LinkedBlockingQueue<>();   //cola infinita, segura para multiples hilos
                                                                                //runnable representa una tarea ejecutable
    public void agregarTarea (Runnable tarea) throws InterruptedException{  //el metodo inserta una tarea, si la cola estuviera llena bloquea (aqui no pasa)
        cola.put(tarea);
    }
    
    public Runnable obtenerTarea() throws InterruptedException{ //el metodo extrae una tarea, si esta vacia el hilo espera
        return cola.take();
    }
    
}

