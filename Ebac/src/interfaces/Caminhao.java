package interfaces;

public class Caminhao implements ICarro {

    @Override
    public void andar() {
        System.out.println("Caminhao andando");
    }

    @Override
    public void parar() {
        System.out.println("Caminhão parando");
    }
}
