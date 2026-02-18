
package app;

public class Main {

    public static void main(String[] args) throws InterruptedException{ //throws InterruptedException permite manejar la posible interrupción al usar join() con hilos.
        Contador contador = new Contador(); //se crea un objeto Contador compartido por todos los hilos.
        
        Hilo[] h1 = new Hilo[5];    //se crea un arreglo para 5 objetos 
        
        for (int i = 0; i < 5; i++){    //bucle for que se repite 5 veces, una por cada hilo
            h1[i] = new Hilo(contador); //se crea un nuevo hilo con el objeto contador para que los demas lo compartan
            h1[i].start();  //inicia ejecucion del hilo
        }
        for(Hilo hilo : h1){    //ciclo que recorre cada hilo del arreglo
            hilo.join();    //hace que el hilo principal espere a que este hilo termine su ejecución
        }
        System.out.println("Resultado: "+contador.getValor());  //imprime el valor final de el contador
    }
}
