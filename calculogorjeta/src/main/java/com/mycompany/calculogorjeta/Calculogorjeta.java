/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculogorjeta;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class Calculogorjeta {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float conta,gorjeta;
        int porcentagem;
        System.out.println("Qual o valor da conta");
        conta = leitor.nextFloat();
        System.out.println("Qual valor da porcentagem : ");
        porcentagem = leitor.nextInt();
        
        gorjeta = (porcentagem * conta)/100;
        
        System.out.println("O valor da gorjeta é" +gorjeta);
    }
}
