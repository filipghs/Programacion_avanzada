package ejercicio_10;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Cruce cruce = new Cruce();  //un solo cruce compartido

        for (int i = 1; i <= 5; i++) {  //multiples autos intentan usar un solo recurso
            new Auto(i, cruce).start();
        }
    }
}
