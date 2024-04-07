
package com.mycompany.latihan.java;
import java.util.Scanner;

/**
 *
 * @author DAIRA SYAHFITRI
 */
public class IfElseClass {
    public String nama,ket;
    public int nilAkhir;
    Scanner input = new Scanner(System.in);
    
    public void setInputData(){
    System.out.print("Masukan Nama Siswa : ");
    nama = input.nextLine();
    System.out.print("Masukan Nilai Akhir : ");
    nilAkhir = input.nextInt();
  }
        public String getKeterangan(){
    if(nilAkhir > 70){
        // perintah jika kondisi true
        ket = "lulus";
      }else{
        // perintah jika kondisi false
        ket = "Gagal";
       }
    return ket;
 }
    
}
