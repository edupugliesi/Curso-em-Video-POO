package aula12;

public class Aula12 {

    public static void main(String[] args) {
        
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro  k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        c.locomover(); // Sobreposição do locomover para caunguru
        k.locomover(); // Herança do método locomover herdada de mamifero para cachorro
        
        k.emitirSom(); // Sobreposição do método emitirSom de mamífero para cachorro.
        c.emitirSom();
    }
    
}
