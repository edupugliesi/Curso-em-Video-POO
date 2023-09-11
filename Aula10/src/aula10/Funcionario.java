package aula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    //Métodos Públicos
    public void mudarTrabalho(){
        if (isTrabalhando() == true){
            setTrabalhando(false);
            System.out.println("Funcionário " + this.getNome() + " parou de trabalhar");
        } else if (isTrabalhando() == false){
            setTrabalhando(true);
            System.out.println("Funcionário " + this.getNome() + " começou a trabalhar");
        }
    }
}
