/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisaodeconta;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class Divisaodeconta {

    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        float conta, divisao, res;
        System.out.println("qual valor da conta ?");
        conta = leitor.nextFloat();
        System.out.println("Quaidade de pessoas");
        divisao = leitor.nextFloat();
        
        res = conta/divisao;
        
        System.out.printf("Valor para cada pessoa %.2f", res);
    }
}
