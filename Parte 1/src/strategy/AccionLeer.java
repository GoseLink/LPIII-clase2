package PACKAGE_NAME.strategy;

public class AccionLeer implements Accion{

    @Override
    public void aplicar() {
        System.out.println("Estoy leyendo");
    }

    @Override
    public int getOpcion() {
        return 2;
    }


}
