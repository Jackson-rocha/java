/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jurossimples;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class JurosSimples {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double capital;
        double taxa;
        int tempo;
        double juros;
        double montante;
        double rendimento;
        
        System.out.println("Qual valor do capital inicial ?");
        capital = leitor.nextDouble();        
        System.out.println("Valor da taxa ?");      
        taxa= leitor.nextDouble();       
        juros = taxa/100;
        System.out.println("Quanto tempo ?");
        tempo = leitor.nextInt();
        
        rendimento = capital * juros * tempo;
     
        montante = capital + rendimento;
             
                
        System.out.println("O Valor final é :" + montante);
    }
}
