package templateMethod;

public abstract class Trabalhador {

    public void executar() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarPraCasa();
    }

    protected abstract void trabalhar();


    private void irAoTrabalho() {
        System.out.println("Indo para o trabalho");
    }
    private void voltarPraCasa() {
        System.out.println("Voltando para casa");
        System.out.println("**********************************");
    }
    private void iniciarRotina() {
        System.out.println("**********************************");
        System.out.println("Iniciando Rotina");
    }
    public void levantar() {
        System.out.println("Levantando da cama");
    }
}
