# MaquinaEstadosTurinFranLopez

https://github.com/franlopezsoto/MaquinaEstadosTurinFranLopez


# Proyecto TuringMachinee

## Descripción

Este proyecto implementa una máquina de Turing simplificada con dos programas: un programa de parada y un programa de no parada.

## Clases Principales

### `HaltingProgram`

Esta clase implementa un programa de parada que cuenta regresivamente desde 10 y se detiene cuando llega a 0.

### `NonHaltingProgram`

Esta clase implementa un programa de no parada que cuenta hacia arriba sin límites.

### `Reverser`

Esta clase invierte el mensaje que se muestra para cada programa. Cuando se ejecuta un programa de parada, muestra el mensaje de un programa de no parada, y viceversa.

## Pruebas

Las pruebas unitarias para las clases `HaltingProgram`, `NonHaltingProgram` y `Reverser` se encuentran en el directorio de pruebas.


# Reflexión sobre el Proyecto TuringMachinee

## Elección del Patrón de Diseño

Para este proyecto, no hemos utilizado un patrón de diseño específico como Chain of Responsibility. Sin embargo, hemos aplicado principios de diseño orientado a objetos, como el polimorfismo. La clase `Reverser` puede interactuar con cualquier objeto que implemente la interfaz `Program`, lo que nos permite pasar diferentes tipos de programas (`HaltingProgram` y `NonHaltingProgram`) al método `reverse(Program program)`.

## Distribución de Clases

El proyecto se compone de tres clases principales: `HaltingProgram`, `NonHaltingProgram` y `Reverser`. Cada una de estas clases tiene una responsabilidad única, lo que se alinea con el principio de responsabilidad única (Single Responsibility Principle, SRP) de SOLID.

- `HaltingProgram`: Representa un programa que se detiene después de un cierto número de iteraciones.
- `NonHaltingProgram`: Representa un programa que no se detiene y sigue iterando indefinidamente.
- `Reverser`: Invierte el mensaje que se muestra para cada programa y luego ejecuta el programa.

## Reflexiones Generales

El proyecto ha sido un desafío interesante. La implementación de `Reverser` ha requerido un pensamiento cuidadoso para manejar correctamente los diferentes tipos de programas. Aunque no hemos utilizado un patrón de diseño específico, hemos aplicado principios de diseño orientado a objetos para mantener el código flexible y fácil de mantener.

Las pruebas también han presentado desafíos, especialmente para la clase `NonHaltingProgram`, que representa un bucle infinito. Esto ha requerido considerar enfoques alternativos para las pruebas, como limitar el tiempo de ejecución o interrumpir el hilo.

En general, este proyecto ha proporcionado una valiosa experiencia en la implementación de conceptos de máquinas de Turing y pruebas unitarias en Java.
