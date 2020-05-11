/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otros;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class DiasDeVida {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad, dias;
        //pedir la edad
        System.out.println("Introduce tu edad: ");
        edad = lector.nextInt();
        //calcular dias de vida
        dias = edad * 360;
        System.out.println("No diré a nadie que tienes " + dias + "  dias!");
    }
}
