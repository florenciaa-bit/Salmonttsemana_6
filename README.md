# SalmonttApp

Aplicación de ejemplo para modelar la digitalización de la empresa salmonera **Salmontt**, ubicada en la Región de Los Lagos.

## Objetivo de la Semana 6

En esta semana se implementa una jerarquía de clases con herencia simple para representar las unidades operativas de la empresa, reutilizando atributos comunes y especializando comportamientos según el tipo de unidad.

Los objetivos son:

- Crear una superclase `UnidadOperativa` con atributos compartidos (`nombre`, `comuna`).
- Crear subclases `CentroCultivo` y `PlantaProceso` que extienden `UnidadOperativa`.
- Usar `super(...)` en los constructores para inicializar atributos heredados.
- Sobrescribir el método `toString()` en las subclases para mostrar toda la información.
- Probar la creación de objetos de cada tipo desde una clase gestora y mostrarlos en consola.

## Clases creadas esta semana

- `model.UnidadOperativa`  
  Clase base que representa una unidad operativa genérica de Salmontt. Contiene los atributos:
  - `nombre`
  - `comuna`

- `model.CentroCultivo`  
  Subclase de `UnidadOperativa` que agrega:
  - `toneladasProduccion`

- `model.PlantaProceso`  
  Subclase de `UnidadOperativa` que agrega:
  - `capacidadProceso`

- `data.GestorUnidades`  
  Clase encargada de crear instancias de prueba de las distintas unidades operativas.

- `app.Main`  
  Punto de entrada de la aplicación. Llama a `GestorUnidades` para crear las unidades de prueba y las muestra en la consola usando `toString()`.

## Instrucciones para ejecutar `Main`

1. Importar el proyecto en tu IDE.
2. Asegurarse de que la estructura de paquetes sea:
   - `model`
   - `data`
   - `app`
3. Ejecutar la clase:

   - `app.Main`

4. Verificar en la consola la salida con el detalle de las unidades operativas creadas (centros de cultivo y plantas de proceso).
