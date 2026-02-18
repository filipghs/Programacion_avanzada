
package app;

public class Cuenta {
    
    private int saldo;  //variable privada que se asigna a el valor de el saldo de la cuenta, es de tipo privada
    
    public Cuenta(int saldoInicial){    //constructor de la clase cuenta
        this.saldo = saldoInicial;
    }
    
    public synchronized boolean retirar(int monto){ //metodo sincronizado
        if (monto > 0 && saldo >= monto){   //verifica que el monto sea positivo y que el saldo sea suficiente
            saldo = saldo-monto;    //resta el monto al saldo
            return true;    //indica que el retiro fue exitoso
        }else   //si no se cumplen las condiciones devuelve falso y el retiro no es posible
           return false;
    }
    
    public synchronized int getSaldo(){ //método sincronizado que devuelve el saldo actual
        return saldo;   //retorna el valor de el saldo
    }
}
