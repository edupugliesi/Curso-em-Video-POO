/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercícioaula02;

/**
 *
 * @author edu-pop
 */
public class ExercícioAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mouse 1
        Mouse mouse1 = new Mouse();
        mouse1.marca = "Razer";
        mouse1.modelo = "Viper v2";
        mouse1.sensor = "Focus Optico";
        mouse1.botoes = 5;
        mouse1.peso = 55;
        mouse1.dpi = 30000;
        mouse1.conexao = "Wireless";
        mouse1.conectado = true;
        
        mouse1.status();
        mouse1.desconectar();
        mouse1.usarMouse();
        
        System.out.println("-------------------------");
        
        //Mouse 2
        Mouse mouse2 = new Mouse();
        mouse2.marca = "Logitech";
        mouse2.modelo = "G Pro X Superlight";
        mouse2.sensor = "Hero";
        mouse2.botoes = 5;
        mouse2.peso = 60;
        mouse2.dpi = 25000;
        mouse2.conexao = "Wireless";
        mouse2.conectado = false;
        
        mouse2.status();
        mouse2.conectar();
        mouse2.usarMouse();
        
    }
    
}
