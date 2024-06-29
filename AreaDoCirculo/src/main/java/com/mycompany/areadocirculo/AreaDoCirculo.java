/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areadocirculo;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class AreaDoCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o raio");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("A area do circulo é:" + area);
    }
}
