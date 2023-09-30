package collection;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Accion eliminar");
        map.put(3, "Accion mostrar");
        System.out.println(map);
        map.put(20, "AccionCualquiera");
        map.put(1, "AccionCualquiera2");
        map.put(11, "AccionCualquiera3");

        System.out.println(map);

    }
}
