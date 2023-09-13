package aula11;

public class Aula11 {

    public static void main(String[] args) {
        /*
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        */
        
        /*
        Aluno a1 = new Aluno();
        a1.setNome("Barbecue");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setCurso("ADS");
        a1.setMatricula(123);
        a1.pagarMensalidade();
        
        System.out.println(a1.toString());
        */
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Maria Chiquinha");
        b1.setIdade(23);
        b1.setSexo("F");
        b1.setCurso("ADM");
        b1.setMatricula(124);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
    
}
