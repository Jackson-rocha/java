/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conceitoarray;

/**
 *
 * @author Devfic
 */
public class Conceitoarray {

    public static void main(String[] args) {
        //declarando e instanciando um vetor
        int []valores=new int[7];//vetor com 7 posiçoes de armazenamento
        int c;
        //numeros para cada posiçao do vetor   
        valores[0] = 7 ; 
        valores[1] = 10; 
        valores[2] = 99; 
        valores[3] = 34; 
        valores[4] = 77; 
        valores[5] = 21; 
        valores[6] = 15 ;
        for(c = 0;c<7;c++){
        System.out.println(valores[c]);
        
        }
    }
}
