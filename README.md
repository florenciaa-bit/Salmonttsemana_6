SalmonttApp
Descripción del objetivo de esta semana

Durante la semana 6 se trabajó en la implementación de una jerarquía de clases con herencia simple para representar las unidades operativas de la empresa salmonera Salmontt. El objetivo principal fue crear una estructura que permitiera reutilizar atributos comunes y, al mismo tiempo, especializar el comportamiento de cada tipo de unidad según su función dentro de la empresa.

Para esto, se definió una clase base que contiene la información general de cualquier unidad operativa, y se crearon subclases que extienden esta clase para agregar características propias de los centros de cultivo y las plantas de proceso. De esta forma, se logra un modelo más ordenado, escalable y fácil de mantener.

Clases creadas

UnidadOperativa
Clase base que representa una unidad operativa general de Salmontt. Contiene los atributos comunes:

nombre

comuna

CentroCultivo
Subclase de UnidadOperativa que representa un centro donde se produce el salmón. Agrega el atributo:

toneladasProduccion

PlantaProceso
Subclase de UnidadOperativa que representa una planta donde se procesa el salmón. Agrega el atributo:

capacidadProceso

GestorUnidades
Clase encargada de crear instancias de prueba de los distintos tipos de unidades operativas para mostrar su funcionamiento.

Main
Clase principal que ejecuta el programa y muestra por consola la información de las unidades creadas mediante el método toString().

Instrucciones para ejecutar Main

Abrir el proyecto SalmonttApp en el IDE utilizado (IntelliJ IDEA, NetBeans u otro).

Verificar que la estructura del proyecto contenga los siguientes paquetes:

model

data

ui

Ubicar la clase Main dentro del paquete ui.

Ejecutar la clase presionando el botón Run o utilizando la opción “Ejecutar”.

Revisar la salida en la consola, donde se mostrarán los datos de los centros de cultivo y plantas de proceso creadas.
