
package ejercicio_10;

import java.util.concurrent.locks.Lock; //lock permiite exclusion mutua explicita
import java.util.concurrent.locks.ReentrantLock;    //ReentrantLock es mas flexible que synchronized

public class Cruce {
    private final Lock lock = new ReentrantLock();  //solo un hilo puede poseer el lock a la vez
    
    public void cruzar (int autoId) throws InterruptedException{    //seccion critica
        lock.lock();    //el vehiculo entra al cruce, otros autos esperan
        try{    //protege la liberacion del lock
            System.out.println("Auto " + autoId + " cruzando"); //.
            Thread.sleep(1000); //simula el cruce
            System.out.println("Auto " + autoId + " salió del cruce");
        }finally{
            lock.unlock();  //libera el cruce siempre
        }
    }
}
