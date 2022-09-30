/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import java.util.Scanner;



/**
 *
 * @author horyn
 */
public class SoucetSoucin {

    Scanner sc = new Scanner(System.in);
        System.out.println("Zadej prvni cislo: ");
        int prvni = sc.nextInt();
        
        System.out.println("Zadej druhe cislo: ");
        int druhe = sc.nextInt();
        
        int soucet = prvni+druhe;
        int soucin = prvni*druhe;
        
        System.out.println("Soucet: " + soucet);
        System.out.println("Soucin: " + soucin);
    }
}
