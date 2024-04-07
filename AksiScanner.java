package com.mycompany.latihan.java;
import java.util.Scanner;
/**
 *
 * @author DAIRA SYAHFITRI
 */
public class AksiScanner {
    public static void main(String args[])
            
{
// membuat objek baru
ClassScanner scan=new ClassScanner();

scan.inputScanner();
System.out.println("\nNama Anda ; "+ scan.getnama());
System.out.println("Nilai Anda : "+ scan.rata());

}
    
}
