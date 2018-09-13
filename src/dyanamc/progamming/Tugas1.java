/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dyanamc.progamming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author win 7
 */
public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========BAYU RIZQI/ XRPL 5/ 07========");
         System.out.println("          ====Assalamualaikum====                     ");
        System.out.print("SILAHKAN MASUKKAN UANG ANDA : ");
         int uang = scanner.nextInt();
        int pecahan [] = new int []{5000, 2000, 1000, 500};
        int jumlah;
        
        for (int i = 0; i < pecahan.length; i++){
            if(uang >= pecahan[i]){
                jumlah= uang/pecahan[i];
                uang = uang%pecahan[i];
                System.out.println(" Pecahan " +  pecahan [i] + " Sebanyak " + jumlah + " Keping ");
                
             
                
            }
        }
    }
}
    
   
        
    
        



