import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();
        int opcion;

        do {
            System.out.println("\n SISTEMA TREE-STOCK");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario (Ordenado)");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = sc.nextLine();
                    inventario.insertar(id, nombre);
                    System.out.println("Producto registrado.");
                    break;
                case 2:
                    System.out.println("\n LISTADO DE PRODUCTOS");
                    inventario.mostrarInorden(inventario.raiz);
                    break;
                case 3:
                    System.out.print("ID a buscar: ");
                    int idBuscar = sc.nextInt();
                    Producto hallado = inventario.buscar(inventario.raiz, idBuscar);
                    if (hallado != null) {
                        System.out.println("Existe: " + hallado.nombre);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}