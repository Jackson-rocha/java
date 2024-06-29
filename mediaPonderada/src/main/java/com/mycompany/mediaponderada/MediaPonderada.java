/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaponderada;

import java.util.Scanner;

/**
 *
 * @author Devfic
 */
public class MediaPonderada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double[] notas = new double[3];
        double[] pesos = new double[3];
        int i;
        
        for(i=0; i<3 ; i++){
            System.out.println("Digite a nota " + (i+1)+":");
            notas[i]= leitor.nextDouble();
            System.out.println("Digite o peso da nota " + (i+1)+":");
            pesos[i]= leitor.nextDouble();
            
    }
        
        double somaPonderada = 0;
        double somaPeso = 0;
        
        for (i = 0; i<3; i++){
            somaPonderada += notas[i]*pesos[i];
            somaPeso += pesos[i];
        }
        
        double mediaPonderada= somaPonderada/somaPeso;
        
        System.out.println("À media ponderada das notas é: %2\n " + mediaPonderada);
    }
}
