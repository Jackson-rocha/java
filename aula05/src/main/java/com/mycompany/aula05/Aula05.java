/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05;

/**
 *
 * @author jackson
 */
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("jubileu");
        p1.abritConta("CC");
        p1.estadoAtual();
        p1.depositar(200);
        p1.sacar(43);
        p1.fecharConta();
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("creusa");
        p2.abritConta("CP");
        p2.estadoAtual();        
        p2.fecharConta();        
        p2.depositar(500);
        p2.sacar(129);
        
        
        
        
    }
}
