package collection;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hola");
        strings.add("Chao");
//        System.out.println(strings);
        strings.add("Mundo");
//        System.out.println(strings);
        strings.remove("          Mundo           ".trim());
        strings.remove(0);
//        System.out.println(strings);
        strings.addAll(List.of("Saludo", "Despedida"));
//        System.out.println(strings);
        strings.add(2, "Entre");
        for(String string : strings){
            System.out.println(string);
        }

    }

}
