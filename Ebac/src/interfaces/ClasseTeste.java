package interfaces;

public class ClasseTeste {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Jedi Logan");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Jeff");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Mundo");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());

        ICarro carropasseio = new CarroPasseio();
        carropasseio.andar();
        carropasseio.parar();

        ICarro caminhao = new Caminhao();
        caminhao.parar();
        caminhao.andar();
    }
}
