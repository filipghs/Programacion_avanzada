# Taller concurrencia

Autor:
Felipe José Garzón Herrera  
Universidad Distrital Francisco José de Caldas  
Programación Avanzada  
Grupo: 020-85  
Docente: Nancy Gelvéz García  
Febrero 2026  

## Descripción

Este repositorio reúne métodos que muestran la implementación de 10 ejercicios prácticos de concurrencia en Java, enfocados en el estudio de problemas como la sincronización, la exclusión mutua, el interbloqueo (deadlock) y el control del acceso a recursos compartidos. El objetivo principal es comprender qué mecanismo de concurrencia resulta más adecuado aplicar en cada caso para garantizar un funcionamiento correcto de la sincronización.

## Aplicación de los conceptos

- Control de acceso con *Semáforos* (Semaphore).
- Puntos de encuentro entre hilos (CyclicBarrier).
- Comunicación segura entre hilos (BlockingQueue).
- Uso de synchronized para garantizar la exclusión mutua.
- Coordinación con wait(), notify() y notifyAll().
- Sincronización Avanzada (java.util.concurrent)
      
## Problemas Abordados:
- Exclusión Mutua= synchronized, ReentrantLock.
- Deadlock (Interbloqueo)*= Lock, ReentrantLock, tryLock().
- Programación Concurrente*= Thread, Runnable.
- Semáforos*= Semaphore.
- Barreras*= CyclicBarrier.
      
## Recursos necesario para su ejecución

Para la correcta ejecucion de los programas presentes en el taller se debe tener los siguientes recursos-programas:

1. Sistema operativo (Windows, Linux o macOs)
   
2. Oracle JVK (versión 25): https://download.oracle.com/java/25/latest/jdk-25_windows-x64_bin.exe
   
3. IDE integrado, como:

- *IntelliJ IDEA:* https://www.jetbrains.com/idea/download/
   
- *Visual Studio Code:* https://code.visualstudio.com/download
   
- *IDE NetBeans* en su ultima version (NetBeans 28):https://netbeans.apache.org/front/main/download/nb28/
## No funcionamiento del codigo por JVK 21
En algunos casos puede suceder que se esté utilizando una JDK más antigua que la versión 25; en ese caso, será necesario hacer un downgrade de la JDK. No hay ningún problema con esto, pues al entrar a NetBeans y abrir el archivo que contiene el código, el mismo IDE indicará que existe un inconveniente. Solo hay que seleccionar la opción de solucionar, y el IDE realizará el downgrade de manera automática, permitiendo ejecutar y editar el proyecto sin ningún problema.

## Uso

Este tipo de programas está hecho principalmente con fines educativos; no se pretende nada más allá de que los estudiantes se relacionen y entiendan cómo funcionan y se implementan soluciones concurrentes a diferentes problemas en el ámbito del desarrollo de software, para después poder aplicarlas en ámbitos laborales y de cualquier otro tipo.

## Contribuciones
La naturaleza de este proyecto es netamente educativa-pedagógica; por lo tanto, no se espera ningún tipo de feedback. Sin embargo, si deseas hacer algún aporte, será totalmente bienvenido.
