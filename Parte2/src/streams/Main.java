package streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1L, 20, "Andres"));
        empleados.add(new Empleado(6L, 18, "Fernando"));
        empleados.add(new Empleado(8L, 17, "Andrey"));

        Set<Character> iniciales = empleados.stream()
                .map(empleado -> empleado.getNombre())
                .map(nombre -> nombre.charAt(0))
                .collect(Collectors.toSet());

        Set<Empleado> edades = empleados.stream()
                .filter(empleado -> empleado.getEdad() > 18)
                .collect(Collectors.toSet());

        Set<Empleado> empleadosFiltrados = empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0) != 'A')
                .collect(Collectors.toSet());

        Optional<Empleado> empleadosFiltrados0 = empleados.stream()
                        .min(Comparator.comparing(empleado -> empleado.getEdad()));

        Optional<Empleado> empleadosFiltrados1 = empleados.stream().filter(empleado -> empleado.getNombre().charAt(0) == 'A').findAny();

        Map<Long, Empleado> empleadoMap = empleados.stream()
                        .collect(Collectors.toMap(empleado -> empleado.getId(), empleado -> empleado));

        empleados.stream().filter(empleado -> empleado.getId() < 5L).forEach(System.out::println);

        System.out.println(iniciales);
        System.out.println(edades);
        System.out.println(empleadosFiltrados);
        System.out.println(empleadosFiltrados0);
        System.out.println(empleadosFiltrados1);
        System.out.println(empleadoMap);
        System.out.println(empleados);

    }
}
