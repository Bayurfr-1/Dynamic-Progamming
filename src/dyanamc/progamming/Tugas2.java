package dyanamc.progamming;

import java.util.Scanner;

public class Tugas2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======== BAYU RIZQI/ XRPL 5/ 07 ========");
        
         System.out.println("            ==== Assalamualaikum ====                     ");
     
       System.out.print("BERAPA BERAT BARANG YANG ANDA BAWA : ");
         int berat = scanner.nextInt();
         int barang [] = new int[] {7, 5, 4, 3, 2};
         String[] kilogram = new String [] {"Q", "W", "E", "R", "T"};
         int jumlah;
         
         for(int i=0; i < kilogram.length; i++);
       int i = 0;
       
         if(berat>=barang[i]) {
             jumlah = berat/barang[i];
             berat = berat%barang[i];
                   System.out.println(" Barang " +  barang  [i] + " Sebanyak " + jumlah + " Benda ");
         }
   }
}
    



