# Taller concurrencia

Autor:
Felipe Jose Garzon Herrera  
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

para la correcta ejecucion de los programas presentes en el taller se debe tener los siguientes recursos-programas:

1. Sistema operativo (Windows, Linux o macOs)
   
2. Oracle JVK (versión 21): https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe (sha256)
   
3. IDE integrado, como:

- *IntelliJ IDEA:* https://www.jetbrains.com/idea/download/
   
- *Visual Studio Code:* https://code.visualstudio.com/download
   
- *IDE NetBeans* en su ultima version (NetBeans 28):https://netbeans.apache.org/front/main/download/nb28/

## Uso

Este tipo de programas esta hecho principalmente con fines educativos, no se pretende nada mas alla que el hecho de que los estudiantes se relacionen y entiendan como funcionan y se implementan soluciones concurrentes a diferentes problemas en el ambito de el desrrollo de software, para despues poder aplicarlo en ambitos laborales y de cualquier tipo.

## Contribuciones
La naturaleza de este proyecto es netamente educativa-pedagogica, luego no se espera ningun tipo de feedback, sin embargo si deseas hacer algun tipo de aporte, es totalmente bienvenido.
