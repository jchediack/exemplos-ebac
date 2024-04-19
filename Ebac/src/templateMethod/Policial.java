package templateMethod;

public class Policial extends Trabalhador {

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Policial");
    }

    @Override
    public void levantar() {    //Override para diferenciar de todos os outros Trabalhadores
        System.out.println("Levantando da cama as 8hs");
    }
    
}
