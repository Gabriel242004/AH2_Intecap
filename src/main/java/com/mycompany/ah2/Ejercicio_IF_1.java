package com.mycompany.ah2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Ejercicio_IF_1 {
    public static void main(String[] args){
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese un no.");
        int n1 = sp.nextInt();
        System.out.println("Ingrese otro no.");
        int n2 = sp.nextInt();
        
        if (n1 == n2){
            System.out.println("Los numeros ingresados son iguales");
        }
        else{
            System.out.println("Los numeros ingresados no son iguales.");
        }
    }
}
