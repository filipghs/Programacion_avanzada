package app;

// Clase Escritor que representa un hilo escritor
class Escritor extends Thread {

    // Recurso compartido que será leído o escrito
    private Recursoc recurso;

    // Identificador del escritor (solo para mostrar mensajes)
    private int id;

    // Constructor del escritor
    public Escritor(Recursoc recurso, int id) {
        this.recurso = recurso;
        this.id = id;
    }

    // Código que se ejecuta cuando el hilo inicia
    public void run() {
        try {
            // Solicita permiso para comenzar a escribir
            recurso.comenzarEscribir(id);

            // Simula el tiempo que tarda en escribir
            Thread.sleep(1500);

            // Indica que terminó de escribir y libera el recurso
            recurso.terminarEscribir(id);

        } catch (InterruptedException e) {
            // Manejo de interrupciones del hilo
            e.printStackTrace();
        }
    }
}