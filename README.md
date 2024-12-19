# Ejercicio de Automatización E2E con Serenity

Este proyecto contiene una prueba funcional automatizada (E2E) para el flujo de compra en la página de [OpenCart](http://opencart.abstracta.us/).

### Flujo 
- Agregar dos productos al carrito.
- Visualizar el carrito.
- Completar el Checkout como invitado Guest Checkout.
- Finalizar la compra hasta confirmacion: Your order has been placed!

## Requisitos
* Java 17 installed
* Gradle  (Suggested version 7.5.1)
* IDE installed (Suggested IntelliJ IDEA)
* Google Chrome installed

## Instalación

1. Clona este repositorio en tu máquina local.

## Ejecución de las pruebas y Visualización de reporte

1. Navega hasta el directorio del proyecto en tu terminal.
2. Ejecuta las pruebas con `gradle clean test`.

3. Una vez que las pruebas se hayan ejecutado, Serenity generará un informe en HTML. Puedes encontrar el enlace al informe de Serenity en la salida de la consola después de ejecutar las pruebas.
> Ejemplo: 
> ```plaintext
> Generating Serenity Reports
> Main report: file:///C:/Users/cristian.tironi/Desktop/reto_automatizacion/template_screenplay_sura-master/target/site/serenity/index.html
>


También puedes encontrar este informe dentro del proyecto, se encuentra en el directorio dentro `target/site/serenity/index.html` 

