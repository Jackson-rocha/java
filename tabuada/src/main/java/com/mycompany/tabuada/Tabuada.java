/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, tabuada;
        System.out.println("Didite um numero:");
        numero = leitor.nextInt();
        for(tabuada=1; tabuada<=10;tabuada++){
            int res= tabuada * numero;
            System.out.println(res);
            
        }
    }
}
