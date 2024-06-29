/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notasalunos;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class Notasalunos {
    public static void main(String[] args) {
        float nota1,nota2, nota3, total;
        
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("Digite sua primeiira nota ");
        nota1 = leitor.nextFloat();
        System.out.println("Digite sua segunda nota ");
        nota2 = leitor.nextFloat();
        System.out.println("Digite terceira nota ");
        nota3 = leitor.nextFloat();
            
            
        total = nota1 + nota2 + nota3;
        System.out.println(total/3);
    }
}
