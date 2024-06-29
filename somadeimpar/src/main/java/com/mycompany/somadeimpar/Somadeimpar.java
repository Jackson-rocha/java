/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somadeimpar;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class Somadeimpar {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i, numero,soma=0,resto=0;
        
        System.out.println("Digite um numero!");
        numero = leitor.nextInt();
        
        for(i=0 ; i < numero ; i++){
            resto = (i+1) % 2;
            if(resto != 0){
                soma = soma+(i+1);
            }     
        }
        System.out.println(soma);
    }
}
