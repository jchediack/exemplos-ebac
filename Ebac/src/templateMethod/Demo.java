package templateMethod;

public class Demo {
    public static void main(String []args) {
        Trabalhador trabalhadorBombeiro = new Bombeiro();
        trabalhadorBombeiro.executar();
        Trabalhador trabalhadorPolicial = new Policial();
        trabalhadorPolicial.executar();


    }
}
