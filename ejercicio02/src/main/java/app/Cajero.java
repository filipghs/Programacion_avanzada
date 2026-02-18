package app;

public class Cajero extends Thread {    //define la gerencia de thread, en cada objeto cajero 
    
    private String nombre;  //almacena el nombre del cajero
    private Cuenta cuenta;  //Hace referencia a la cuenta bancaria compartida
    
    public Cajero(String nombre, Cuenta cuenta){    //constructor de la clase cajero
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    
    public void run(){  //método que se ejecuta cuando el hilo se inicia con start().
        for(int i = 0; i < 3; i++){ //cada cajero intenta hacer 3 retiros
           int monto = 100 + (int)(Math.random() * 301);    //se genera un numero aleatorio entre 100 y 400
            
        if (cuenta.retirar(monto)){ //El cajero intenta retirar el monto, devuelve true si el retiro fue realizado exitosamente
            System.out.println(nombre + " retiro $: " + monto + " saldo $: " + cuenta.getSaldo());
        }else{  //en el caso de que el retiro no fuese posible
            System.out.println("No se puedo realizar el retiro, saldo $: " + cuenta.getSaldo());
        }
        try{    //bloquea en el caso de una excepcion
            Thread.sleep(100);  //pausa la ejecucion del hilo 100 milisegundos
        }catch (InterruptedException e){    //captura una interrupcion del hilo
                e.printStackTrace();    //muestra informacion del error ocurrido en consola
        }
        }
    }
}
