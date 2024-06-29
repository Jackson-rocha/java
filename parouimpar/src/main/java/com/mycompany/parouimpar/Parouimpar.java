/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parouimpar;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class Parouimpar {

    public static void main(String[] args) {
        int numero, restoDivisao;
        Scanner leitor = new Scanner(System.in); 
        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();
        restoDivisao = numero % 2 ;
        
        if(restoDivisao == 1){
            System.out.println("impar");
        }else{
            System.out.println("par");
    }
  }
}
