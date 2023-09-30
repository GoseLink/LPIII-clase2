package PACKAGE_NAME.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int OPCION_SALIR = 6;
    public static void main(String[] args) {

          Map<Integer, Accion> strategy = AccionHandler.getStrategy();
//        Map<Integer, Accion> strategy = new HashMap<>();
//        strategy.put(1, new AccionCrear());
//        strategy.put(2, new AccionLeer());
//        strategy.put(3, new AccionActualizar());
//        strategy.put(4, new AccionEliminar());

        int opcion;
        do {
            System.out.println("Ingrese una opcion\n" + "1. Crear\n" + "2. Leer\n" + "3. Actualizar\n" + "4. Eliminar\n" + "5. Buscar\n" + "6. Salir \n");
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(opcion);
            if (opcion == OPCION_SALIR){
                System.out.println("Salida exitosa");
                continue;
            }
            if (accion == null ){
                System.out.println("Esta opcion no existe");
            } else accion.aplicar();
        } while (opcion != OPCION_SALIR);

    }

}
