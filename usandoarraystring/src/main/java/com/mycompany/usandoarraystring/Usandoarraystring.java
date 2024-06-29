/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usandoarraystring;

/**
 *
 * @author Devfic
 */
public class Usandoarraystring {

    public static void main(String[] args) {
        //declarando e atribundino string
        String nome= "jackson dos santos rocha"  ;
        System.out.println(nome.length());//imprime tudo
        System.out.println(nome.charAt(0));//imprime j
        System.out.println(nome.charAt(2));//imprime c
        System.out.println(nome.indexOf("d"));//imprime 8
        System.out.println(nome.indexOf("x"));//quando nao tem apresenta -1
        System.out.println(nome.substring(4,19));//imprime so 4 ao 19..
    }
}
