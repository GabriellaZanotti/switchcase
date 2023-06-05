/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Velocidade. \nEscolha: 1=Fraco, 2=Moderada, 3=Forte: ");
        int velocidade=0;
        Scanner input = new Scanner (System.in);
        velocidade=input.nextInt();
        
        switch(velocidade){
            case 1:
                System.out.println("Velocidade fraca");
                break;
            case 2:
                System.out.println("Velocidade moderada");
                break;
            case 3:
                System.out.println("Velocidade maxima");
                break;  
            default:
                System.out.println("Velociade inválida.");
                break;
        }
    }  
}
