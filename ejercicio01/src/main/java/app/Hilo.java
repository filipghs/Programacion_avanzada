
package app;


public class Hilo extends Thread{   //define la herencia de thread
    private Contador contador;  //variablke que lamacena la referencia de contador
    
    public Hilo(Contador contador){ //constructor de la clase
    this.contador = contador;   //asigna el contador recibido al atributo del hilo
    }
    
    public void run() { //método que contiene el código que ejecutará el hilo cuando se llame a start().
        for (int i = 0; i < 1000; i++) {    //bucle que se repite 1000 veces
            contador.incrementar(); //incrementa el valor de el contador
        }
    }
}
