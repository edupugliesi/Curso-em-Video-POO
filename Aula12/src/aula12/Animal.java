package aula12;

public abstract class Animal {
    private float peso;
    private int idade;
    private int membros;
    
    
    //Getters e Setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    //Métodos públicos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}