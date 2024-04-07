
package com.mycompany.latihan.java;

import java.util.Scanner;

/**
 *
 * @author DAIRA SYAHFITRI
 */
public class IfClassAksi {
   public static void main(String[] args)
    {
    double tot_beli;
    Scanner input = new Scanner(System.in);
    IfClass fungsiif = new IfClass();
        
    System.out.println("Besarmya Potongan Rp. "+ fungsiif.getPotongan());
    System.out.println("Jumlah yang harus dibayarkan Rp. " +fungsiif.JumlahBayar());
    }
}
