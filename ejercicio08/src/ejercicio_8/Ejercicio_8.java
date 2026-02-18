
package ejercicio_8;
public class Ejercicio_8 {

    public static void main(String[] args) {
       Impresora impresora = new Impresora(2);  //creamos una instancia de impresora con capacidad de 2
       
       for (int i=1; i<=5; i++){
           new Usuario(i,impresora).start();
       }    //crea mas hilos para demostrar que el sistema funciona
        
    }
    
}
