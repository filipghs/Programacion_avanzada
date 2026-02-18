
package ejercicio_8;

public class Usuario extends Thread {   // hace que cada usuario sea un hilo, 
                                        //y extiende threads para ejecutar paralelamente
    private final int id;   //unicamente para poder identificar el hilo
    private final Impresora impresora;  //hace referencia a el recurso compartido
    
    public Usuario(int id, Impresora impresora){    //constructor, se inyecta en impresora pues todos comparten el mismo recurso
        this.id=id;
        this.impresora= impresora;
    }
    
    @Override
    public void run() {     //define que hcae el hilo
        try {   // el hilo intenta usar la impresora, si ya hay 2 , queda bloqueado
            System.out.println("Usuario " + id + " esperando impresora...");
            impresora.imprimir(id);
        } catch (InterruptedException e) {  //en dado caso maneja interrupciones del hilo
            e.printStackTrace();
        }
    }
}
