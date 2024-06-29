/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoimpostosimples;

import java.util.Scanner;

/**
 *
 * @author Jackson
 * Calcular o imposto a ser pago de um valor fornecido pelo usuario
 * considerando um aliquota de 15%
 */
public class Calculoimpostosimples {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double valor, imposto;     
                
        System.out.println("Digite o valor do produto?");
        valor = entrada.nextDouble();
        
        imposto = valor * 0.15;
        System.out.println("O valor do imposto é de: " + imposto);
    }
}
