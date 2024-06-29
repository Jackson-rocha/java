/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Devfic
 */
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        // Declarando váriaveis.
        int valor1, valor2, soma;
        
        // Instanciando scanner para entrada de dados.
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Iniciar Cálculo");
        System.out.println("Digite o valor 1");
        valor1 = ler.nextInt();
        
        System.out.println("Digite o valor 2");
        valor2 = ler.nextInt();
        
        // Soma dos valores digitados.
        soma = valor1 + valor2;
        
        System.out.println("Soma dos valores: " + valor1 +" + "+ valor2 +  " = " + soma);
    }
}
