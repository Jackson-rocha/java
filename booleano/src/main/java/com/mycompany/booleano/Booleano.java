/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.booleano;

/**
 *
 * @author Devfic
 */
public class Booleano {

    public static void main(String[] args){
        System.out.println("\n Operadores booleanos \n");
        boolean passed, largeVenus, grade;//variaveis boolianas
        
        passed = true;
        largeVenus = false;
        grade = passed;
        
        System.out.println(passed);
        System.out.println(largeVenus);
        System.out.println(grade);
        
        boolean res1 = 24 == 15;
        
        System.out.println("res1" + res1);
        int value1 = 15;
        int value2 = 24;
        boolean res2 = value1 == value2;
        System.out.println("res2" + res2);
        
        int a= 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(b >= a);
        System.out.println(b <= a);
        
        System.out.println("\n condiçoes if \n");
        
        int nota = 85;
        if(nota > 88){
            System.out.println("Voce formou com louvor");
        }else{
            System.out.println("voce passou");
        }
       
        String left = "museo";
        String straight = "ginástica";
        String right = "restaurante";
        
        if(left == "ginástica"){
            System.out.println("Virar a esquerda");            
        }
        if(straight == "ginástica"){
            System.out.println("Seguir em frente para Gisnástica");            
        }
        if(right == "ginástica"){
            System.out.println("Virar a direita");
        }
        
        System.out.println("\n valores primitivos \n");
        
        int d = 3;
        int e = 2;
        int f = d + e;
        
        boolean test = (f == 5);
        System.out.println(test);
        
        System.out.println("\n valores Strings\n");
        
        String x = "ora";
        String y = "clae";
        String z = x + y;
        
        boolean test1 = z.equals(x+y);
        // tbm temos um metodo semelhante: equalsignoreCase();
        System.out.println(test1);       
    }
}
