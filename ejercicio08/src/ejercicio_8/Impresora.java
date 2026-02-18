
package ejercicio_8;

import java.util.concurrent.Semaphore; //nos permite instanciar la clase semaforo

public class Impresora {
    private final Semaphore semaforo;  //este objeto se encarga de el acceso concurrente
                                       //no se puede remplazar por otro semaforo
    public Impresora (int capacidad){    //constructor que permite instanciar la clase
        this.semaforo= new Semaphore (capacidad);
    }
    
    public void imprimir(int usuarioId) throws InterruptedException{    //MEtodo que usa la impresora lanza InterruptedException porque acquire() puede bloquear
        semaforo.acquire(); //el hilo esta pidiendo permiso para entrar, si no ha
                            //se duerme,  desde aqui se controla la concurrencia
        try{    //garantiza que el semaforo se libere pase lo que pase
            System.out.println("Usuario"+ usuarioId + "usando la impresora");
            Thread.sleep(2000); //simula el tiempo de impresion
            System.out.println("Usuario" + usuarioId + "termino de imprimir");
        } finally { // siempre se ejecuta, libera el permiso del semaforo
            semaforo.release();
        }
    }
}
