
package app;


public class Main {

    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta(1000);   //crea una cuenta bancaria con un saldo inicial de 1000
        
        Cajero c1 = new Cajero("Cajero 1", cuenta);
        Cajero c2 = new Cajero("Cajero 2", cuenta);
        Cajero c3 = new Cajero("Cajero 3", cuenta);
        //se crean 3 cajeros que comparten la misma cuenta
        
        
        System.out.println("Saldo $: " + cuenta.getSaldo());    //se imprime en pantallael saldo inicial
        
        c1.start();
        c2.start();
        c3.start();
        //se inicia la ejecucion de los 3 cajeros
        
        try {   //bloque en caso de manejar excepciones
            c1.join();
            c2.join();
            c3.join();
            //hace que el hilo principal espere a que los tres cajeros terminen
        } catch (InterruptedException e) {  //captura la interrupcion de el hilo
            e.printStackTrace();    //muestra el error
        }

        System.out.println("\nSaldo final: $" + cuenta.getSaldo()); //muestra el saldo final después de todos los retiros
            
    }
}
