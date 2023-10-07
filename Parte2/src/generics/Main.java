package generics;

public class Main {

    public static void main(String[] args) {
        Creador<Peluche> creadorPeluche = new Creador<>(){
            public Peluche crear(){
                return new Peluche();
            }
        };

        Creador<Carrito> creadorCarrito = new Creador<>() {
            @Override
            public Carrito crear() {
                return new Carrito();
            }
        };

        creadorCarrito.crear();
        creadorPeluche.crear();
    }
}
