/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenprojectsalario;

/**
 *
 * @author Devfic
 */

import java.util.Scanner;

public class Mavenprojectsalario {

    public static void main(String[] args) {
        double valorHora, qtdHorasTrabalhadas, salarioBruto, descontos, salarioLiquido;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-Iniciar Cálculo de Salário-");
        
        // Hora trabalhada
        System.out.print("Digite o valor da Hora trabalhada: ");
        valorHora = ler.nextDouble();

        // Quantidade de horas trabalhadas
        System.out.print("Digite a Quantidade de horas trabalhadas: ");
        qtdHorasTrabalhadas = ler.nextDouble();

        salarioBruto = valorHora * qtdHorasTrabalhadas;
        descontos = salarioBruto * 0.10;
        salarioLiquido = salarioBruto - descontos;
        
        System.out.println("Holerite");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Descontos: R$ " + descontos);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
        System.out.println("------------------------------------------------------------------------");
    }
}
