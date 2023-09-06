package aula09;

public class Aula09 {
    
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa("Maria", "F", 25);
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", p[0], 300);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", p[1], 500);
        l[2] = new Livro("Java Avançado", "Maria Candido", p[0], 800);
        
        l[0].abrir();
        l[0].folhear(500);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        
    }
    
}
