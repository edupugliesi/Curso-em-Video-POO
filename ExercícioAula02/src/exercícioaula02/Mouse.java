/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercícioaula02;

/**
 *
 * @author edu-pop
 */
public class Mouse {
    String marca;
    String sensor;
    String modelo;
    int botoes;
    int dpi;
    int peso;
    String conexao;
    Boolean conectado;
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Sensor: " + this.sensor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Número de botões: " + this.botoes);
        System.out.println("DPI: " + this.dpi);
        System.out.println("Peso: " + this.peso + "g");
        System.out.println("Conexão: " + this.conexao);
        
        
    }
    
    void usarMouse(){
        if (this.conectado == false){
            System.out.println("Não é possível usar o mouse");
        }
        else if (this.conectado == true){
            System.out.println("Mouse pronto para uso");
        }
    }
    
    void conectar(){
        this.conectado = true;
    }
    
    void desconectar(){
        this.conectado = false;
    }
    
}
