package app;

public class Contador {
    private int valor;  //variable privada que almacena el valor de el contador
    
    public Contador(){  //constructor de la clase contador
        this.valor = 0; //se inicializa el contador en 0
    }
    public synchronized void incrementar(){ //metodo concurrente que garantiza que solo un hilo a la vez pueda ejecutar el metodo
        valor = valor + 1;
    }
    public int getValor(){  //método que devuelve el valor actual del contador.
        return valor;
    }
}
