# Proyecto Java

## Instrucciones

### Ejecutar el proyecto usando DevContainers

1. Asegúrate de tener Docker instalado y ejecutándose en tu máquina.
2. Abre el proyecto en Visual Studio Code.
3. Cuando se te solicite, abre el proyecto en el contenedor de desarrollo.
4. Una vez que el contenedor esté listo, abre una terminal en VS Code y ejecuta:
    ```sh
    cd hospitales
    mvn clean install
    mvn compile exec:java -Dexec.mainClass="com.uade.adoo.mri.Main"
    ```

### Requerimientos y paso a paso para ejecutar el proyecto sin DevContainers

#### Requerimientos

- Java JDK 21 o superior
- Apache Maven 3.6.0 o superior

#### Paso a paso

1. Cumplir los requerimientos
2. Compila el proyecto:
    ```sh
    cd hospitales
    mvn clean install
    ```
3. Ejecuta la aplicación:
    ```sh
    mvn compile exec:java -Dexec.mainClass="com.uade.adoo.mri.Main"
    ```

### Ejecutar la test suite

1. Abre una terminal en el directorio del proyecto.
2. Ejecuta los tests con Maven:
    ```sh
    mvn test
    ```