package aula11;

public class Bolsista extends Aluno{
    private float Bolsa;
    
    
    //Getters e Setters
    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float Bolsa) {
        this.Bolsa = Bolsa;
    }
    
    
    //Métodos Públicos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno" + this.getNome());
    }
    
    
    //Método de pagarMensalidade sobreposto
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista. Pagamento facilitado.");
    }
}
