# Tree-Stock: Sistema de Inventario

Aplicación de consola en Java que utiliza una estructura de *Árbol Binario de Búsqueda* para gestionar productos de forma eficiente.


## Estructura del Proyecto
*   `Producto.java`: Define el nodo del árbol (ID, Nombre y punteros).

*   `ArbolInventario.java`: Contiene la lógica de inserción recursiva, búsqueda y recorrido inorden.

*   `Main.java`: Interfaz de usuario con menú interactivo.


## Funcionalidades
1.  Registrar: Inserta productos de modo que los IDs menores quedan a la izquierda y los mayores a la derecha.

2.  Mostrar: Utiliza el recorrido **Inorden** para listar los productos organizados de menor a mayor ID.

3.  Buscar: Localiza un producto en tiempo logarítmico basado en su ID.

## Instrucciones de Ejecución

1. Compila los archivos

2. Ejecuta la aplicación: `java Main`