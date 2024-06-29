/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase;

/**
 *
 * @author Devfic
 */
public class SwitchCase {

    public static void main(String[] args) {
        char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;
        
        switch(option){
            case 'A' : aCount ++;
                       System.out.println("Count of A " + aCount);
                       break;
            case 'B' : bCount ++;
                       System.out.println("Count of B" + aCount);
                       break;
            case 'C' : cCount ++;
                       System.out.println("Count of C" + aCount);
                       break;
        }
    }
}
