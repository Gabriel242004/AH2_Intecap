package com.mycompany.ah2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio_IF_4 {
    public static void main(String[] args){
        Scanner sp = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int n1 = sp.nextInt();
        System.out.println("Ingrese otro numero");
        int n2 = sp.nextInt();
        System.out.println("Ingrese un tercer numero");
        int n3 = sp.nextInt();
        
        int mayor, medio, menor;
        if(n1>n2 && n1>n3){
            mayor = n1;
            if(n2>n3){
                medio = n2;
                menor = n3;   
            }else{
                medio = n3;
                menor = n2;
            }
            
        }else if(n2>n1 && n2>n3){
            mayor = n2;
            if(n1>n3){
                medio = n1;
                menor = n3;
            }else{
                medio = n3;
                menor = n1;
            }
        }else{
            mayor = n3;
            if(n1>n2){
                medio = n1;
                menor = n2;
            }
            else{
                medio = n2;
                menor = n1;
            }
        }
        
        System.out.println(mayor + "," + medio + "," + menor);
    }
}
