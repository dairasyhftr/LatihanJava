
package com.mycompany.latihan.java;
import java.util.*;
/**
 *
 * @author DAIRA SYAHFITRI
 */
public class LatSwitchCase {
    public static void main(String[]args)
    {
        int kd;
        String nb ="";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kode Barang[1..3]:");
        kd=input.nextInt();
        
        switch(kd)
        {
            case 1:
                nb="Alat Olah Raga";
                break;
            case 2:
                nb="Alat Elektronik";
                break;
            case 3:
                nb="Alat Alat Masak";
                break;    
            default:
                nb="Anda Salah Kode !!!";
                break;
        }
    System.out.println("\nNama Barang: "+nb);
    }
}
