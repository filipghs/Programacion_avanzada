
package ejercicio_10;

public class Auto extends Thread {  //cada auto es un hilo
    private final int id;
    private final Cruce cruce;

    public Auto(int id, Cruce cruce) {
        this.id = id;   //.
        this.cruce = cruce; //identificador y recurso compartido
    }
    
    @Override
    public void run() { //parte del codigo que emplea concurrencia
        try {
            System.out.println("Auto " + id + " esperando cruzar...");  //.
            cruce.cruzar(id);   //si el cruce esta ocupado entonces espera
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
