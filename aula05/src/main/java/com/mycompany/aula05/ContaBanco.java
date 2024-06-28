/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author jacks
 */
public class ContaBanco {
    //atributo
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //metodos personalzado
    public void estadoAtual(){
        System.out.println("Conta : "+ this.getNumConta());
        System.out.println("Dono : " + this.getDono());
        System.out.println("Tipo : "+ this.getTipo());
        System.out.println("saldo : "+ this.getSaldo()+" R$");
        System.out.println("Status : "+ this.getStatus());
    }
    public void abritConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        }else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com Sucesso");
        
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta nao pode ser fechada com saldo na conta");
        }else if(this.getSaldo()<0){
            System.out.println("Conta nao pode ser fechada pois tem debito");
        }else{
            this.setStatus(false);
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Desposito realizado com sucesso");
        }else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de  "+ this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v=0;
        if ("CC".equals(this.getTipo())) {
            v=12;
        } else if("CP".equals(this.getTipo())) {
            v=20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga com sucesso por "+ this.dono);
        }else{
            System.out.println("Impossivel pagar uma conta fechada");
        }       
    }
    
    //metodos especiais
    
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
