/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectomodulo;
import java.util.*;
/**
 *
 * @author manol
 */
public class ProyectoModulo {
    
    public static int ProyectoModulo(int n1, int n2){
        return n1 % n2;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        int resultado = ProyectoModulo (numero1, numero2);
        System.out.println("El resultado del módulo es" + resultado);
    }
}
