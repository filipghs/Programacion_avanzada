package app; // Paquete del recurso compartido

class Recursoc { // Clase que controla el acceso al recurso

    private int lectores = 0;        // Número de lectores activos
    private boolean escribiendo = false; // Indica si hay un escritor escribiendo

    public synchronized void comenzarLeer(int id) throws InterruptedException { // Inicio de lectura
        while (escribiendo) { // Si hay un escritor activo
            wait();           // El lector espera
        }
        lectores++; // Se incrementa el número de lectores
        System.out.println("Lector " + id + " está leyendo. Lectores activos: " + lectores); // Mensaje
    }

    public synchronized void terminarLeer(int id) { // Fin de lectura
        lectores--; // Se reduce el número de lectores
        System.out.println("Lector " + id + " ha terminado de leer. Lectores activos: " + lectores); // Mensaje
        if (lectores == 0) { // Si ya no quedan lectores
            notifyAll();     // Despierta a escritores en espera
        }
    }

    public synchronized void comenzarEscribir(int id) throws InterruptedException { // Inicio de escritura
        while (lectores > 0 || escribiendo) { // Si hay lectores o escritores
            wait(); // El escritor espera
        }
        escribiendo = true; // Marca que hay un escritor activo
        System.out.println("Escritor " + id + " está escribiendo."); // Mensaje
    }

    public synchronized void terminarEscribir(int id) { // Fin de escritura
        escribiendo = false; // Libera el recurso
        System.out.println("Escritor " + id + " ha terminado de escribir."); // Mensaje
        notifyAll(); // Despierta a lectores y escritores
    }
}