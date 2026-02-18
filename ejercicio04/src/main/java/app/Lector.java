package app; // Paquete al que pertenece la clase

class Lector extends Thread { // Clase Lector que hereda de Thread

    private Recursoc recurso; // Recurso compartido que será leído
    private int id;           // Identificador del lector

    public Lector(Recursoc recurso, int id) { // Constructor del lector
        this.recurso = recurso; // Asigna el recurso compartido
        this.id = id;           // Asigna el id del lector
    }

    public void run() { // Método que ejecuta el hilo
        try {
            recurso.comenzarLeer(id);  // Solicita permiso para leer
            Thread.sleep(1000);        // Simula el tiempo de lectura
            recurso.terminarLeer(id);  // Finaliza la lectura
        } catch (InterruptedException e) { // Captura interrupciones
            e.printStackTrace();           // Muestra el error
        }
    }
}

