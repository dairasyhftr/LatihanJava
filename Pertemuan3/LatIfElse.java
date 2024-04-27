
package com.mycompany.latihan.java;

import java.util.Scanner;

/**
 *
 * @author DAIRA SYAHFITRI
 */
public class LatIfElse {
    public static void main(String[]args) {
    Scanner input = new Scanner (System.in);
    String keterangan,nama;
    int nilai;
    
    System.out.print("Masukan Nama Siswa : ");
    nama = input.nextLine();
    System.out.print("Masukan Nilai Akhir : ");
    nilai = input.nextInt();
        if(nilai > 70){
            // perintah jika kondisi true
            keterangan = "lulus";
        }else{
            // perintah jika kondisi false 
            keterangan = "gagal";
        }
      System.out.println("Hasil Akhir");
      System.out.println("=======================");
      System.out.println("Nama Siswa                    : "+nama);
      System.out.println("Nilai Akhir yang di dapat     : "+nilai);
      System.out.println("Keterangan                    : "+keterangan);
      System.out.println("=======================");
    }
}
