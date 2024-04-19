package abstratas;

public class Programa {
    public static void main(String args[]) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("055");
        empregado.setNome("Jorge");
        empregado.setSobrenome("Chediack");
        empregado.setSalario(10000d);
        System.out.println(empregado.getNome() + " tem salario de: " + empregado.vencimento());

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("071");
        comissionado.setNome("Jeff");
        comissionado.setSobrenome("Henrique");
        comissionado.setTotalComissao(0.2d);
        comissionado.setTotalVenda(78000d);
        System.out.println(comissionado.getNome() + " tem salario comissão de: " + comissionado.vencimento());

        Horista horista = new Horista();
        horista.setCpf("071");
        horista.setNome("Guiguino");
        horista.setSobrenome("Miguel");
        horista.setPrecoHora(250d);
        horista.setTotalHoraTrabalhada(15d);
        System.out.println(horista.getNome() + " tem salario horista de: " + horista.vencimento());
    }
}
