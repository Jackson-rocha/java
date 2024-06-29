/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayinserir;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class Arrayinserir {

    public static void main(String[] args) {
        int []valores=new int[7];//vetor com 7 posiçoes de armazenamento
        int c;
        Scanner leitor= new Scanner(System.in);
        //numeros para cada posiçao do vetor  
        for(c=0;c<7;c++){
            System.out.println("Digite um valor para o array");
            valores[c] = leitor.nextInt();
        }
        
        for(c = 0 ; c < 7 ; c++){
        System.out.println(valores[c]);
        
        }
        
    }
}
