package aula10;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;
    
    
    //Getters e Setters
    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    //Métodos Públicos
    public void cancelarMatricula(){
        if (isMatricula() == true){
            setMatricula(false);
        } else {
            System.out.println("Aluno já está desmatriculado");
        }
    }
    
}
