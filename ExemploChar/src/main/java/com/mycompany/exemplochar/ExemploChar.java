/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplochar;

/**
 *
 * @author Devfic
 */
import java.util.Scanner;
public class ExemploChar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um caracter");
        //Para recerberum char use next().charAt();
        char letra = entrada.next().charAt(0);
        //imprimir conteudo da letra    
        System.out.println("A variavel letra contem o seguinte dado:" + letra);
        
        if(letra == 'A'){
            System.out.println("O conceito do aluno é EXELENTE");
        }else if(letra == 'b'){
            System.out.println("O conceito do aluno é BOM");            
        }
        
        int grade = 99;
        int numberDaysAbsent = 0;
        if(grade >= 88){
            if(numberDaysAbsent == 8){
                System.out.println("você esta qualificade para uma"
                        + "bolsa de estudo");
            }
        } 
    }
}
