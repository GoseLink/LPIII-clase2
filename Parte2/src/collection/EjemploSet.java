package collection;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(5);
        System.out.println(integers);
        integers.add(1);
        System.out.println(integers);
        integers.addAll(Set.of(5,3,4,6,2,10,30,8));
        System.out.println(integers);
        integers.add(11);
        System.out.println(integers);

        integers.forEach(integer -> System.out.println(integer));
    }
}
