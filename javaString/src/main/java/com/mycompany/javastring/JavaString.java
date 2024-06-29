/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javastring;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class JavaString {

    public static void main(String[] args) {
        Scanner leitor =new Scanner(System.in);
        
        String mensagem ="Programando em Java";
        System.out.println(mensagem);
        
        String nome;
        System.out.println("Digite seu nome :");
        nome = leitor.nextLine();
        
        System.out.println(nome);
         
        System.out.println(nome + " está " + mensagem);
        
        String frase;
        System.out.println("Digite uma frase :");
        frase = leitor.nextLine();
        System.out.println(frase);
        
        String palavra;
        System.out.println("Digite uma palavra :");
        palavra = leitor.next();
        System.out.println(palavra);
        
        leitor.nextLine();
        
        char letra;
        System.out.println("Digite um caracter :");
        letra = leitor.nextLine().charAt(0);
        System.out.println("O caracter digitando foi:" + letra);
        
    }
}
