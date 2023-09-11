package aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    
    //Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    //Métodos Públicos
    public void receberAumento(float s){
        setSalario(getSalario() + s);
        System.out.println("Professor " + this.getNome() + " recebeu um aumento de R$" + s + ",00.");
    }
}
