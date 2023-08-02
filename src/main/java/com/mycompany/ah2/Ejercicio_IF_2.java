package com.mycompany.ah2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio_IF_2 {
     public static void main(String[] args){
         Scanner sp = new Scanner(System.in);
         System.out.println("Ingrese un no. negativo o positivo.");
         int n1 = sp.nextInt();
         
         if(n1 >= 0){
             System.out.println("El no. ingresado es positivo.");
         }else {
             System.out.println("El no. ingresado es negativo");
             
         }
         
     }
}
