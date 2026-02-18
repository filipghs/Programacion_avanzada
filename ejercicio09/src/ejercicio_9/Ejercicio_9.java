
package ejercicio_9;

public class Ejercicio_9 {

    public static void main(String[] args) {
        
        ColaTareas cola = new ColaTareas(); //instancia la clase
        
        new Consumidor(cola).start();
        new Consumidor(cola).start();
        
        for (int i = 1; i <= 5; i++) {  //genera mas hilos para verificar la fiabilidad de el sistema
            new Productor(i, cola).start();
        }
        
    }
    
}
