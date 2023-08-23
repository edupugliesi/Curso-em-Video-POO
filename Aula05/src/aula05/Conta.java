/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

import java.util.Scanner;


/**
 *
 * @author edu-pop
 */
public class Conta {
    Scanner teclado = new Scanner(System.in);
    
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    
    //Constructor
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    
    
    
    //GETTERS
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
    
    
    
    //SETTERS
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    //MÉTODOS
    public void abrirConta(){
        //setNumConta(this.numConta += 1);
        
        System.out.println("\n--Criar nova conta--\n");
        System.out.print("Nome: ");
        String nome = teclado.nextLine().toUpperCase();
        this.setDono(nome);
        
        System.out.print("Tipo [CP/CC]: ");
        String tipoConta = teclado.nextLine().toUpperCase();
        this.setTipo(tipoConta);
        
        if ("CP".equals(tipoConta)){
            this.setSaldo(150);
            System.out.println("Conta Poupança criada. Você recebeu R$150,00 de incentivo.");
        }
        else if ("CC".equals(tipoConta)){
            this.setSaldo(50);
            System.out.println("Conta Corrente criada. Você recebeu R$50,00 de incentivo.");
        }
        this.setStatus(true);
       
    }
    
    public void fecharConta(){
        if (this.isStatus() == false){
            System.out.println("\nA conta já está fechada");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("\nVocê está negativado, portando não pode fechar a conta!");
        }
        else if (this.getSaldo() > 0) {
            System.out.println("\nVocê possui um saldo de R$" + getSaldo() + ", portanto não pode fechar a conta!");          
        }
        else if (this.getSaldo() == 0 && this.isStatus() == true){
            System.out.println("\nConta fechada com sucesso.");
            this.setStatus(false);  
        }
    }
    
    public void depositar(){
        if (this.isStatus() == true){
            System.out.print("Digite o valor que deseja depositar: ");
            float deposito = teclado.nextFloat();

            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Seu saldo agora é: R$" + this.getSaldo());
        }
        else if (this.isStatus() == false){
            System.out.println("Está conta está fechada. Impossível realizar depositos.");
        }
    }
    
    public void sacar(){
        if (this.isStatus() == true){
            System.out.println("\nDigite o valor que deseja sacar: ");
            float saque = teclado.nextFloat();
            
            if (saque > this.getSaldo()){
                System.out.println("Saldo insuficiente para saque.");
            }
            else if (saque <= this.getSaldo()){
                setSaldo(this.getSaldo() - saque);
                System.out.println("Saque efetuado. Seu saldo agora é: R$" + this.getSaldo());
            }
        }
        else if (this.isStatus() == false){
            System.out.println("Esta conta está fechada. Impossível realizar saques.");
        }
    }
    
    public void mensalidade(){
        if (this.isStatus() == true){
            if("CC".equals(getTipo())){
                this.setSaldo(- 12);
                if (this.getSaldo() < 12){
                    System.out.println("\nMensalidade da sua conta corrente debitada. Você está negativado. Saldo R$:" + this.getSaldo());
                }
                else if (this.getSaldo() >= 12){
                    System.out.println("\nMensalidade da sua conta corrente debitada. Saldo R$:" + this.getSaldo());
                }
            }
            else if ("CP".equals(getTipo())){
                setSaldo(this.getSaldo() - 20);
                if (this.getSaldo() < 20){
                    System.out.println("\nMensalidade da sua poupança debitada. Você está negativado. Saldo R$:" + this.getSaldo());
                }
                else if (this.getSaldo() >= 20){
                    System.out.println("\nMensalidade da sua poupança debitada. Saldo R$:" + this.getSaldo());
                }
            }
        }
    }
    
    public void geral(){
        System.out.println("\n-- Visão geral da conta --");
        System.out.println("Nome: " + this.getDono());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus() + "\n");
    }
    
}
