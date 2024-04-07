package com.mycompany.latihan.java;

import java.io.*;
/**
 *
 * @author DAIRA SYAHFITRI
 */
public class LatBuffered {
    public static void main(String args[])throws Exception
{
//membuat objek baru
InputStreamReader keyreader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader (keyreader);
//deklarasi variabel
String kata1, kata2;

System.out.print("Masukan Kata Pertama : ");
kata1 = input.readLine();
System.out.print("Masukan Kata Kedua : ");
kata2 = input.readLine();
System.out.println("\nHasil Input String"+kata1+" "+kata2);

}
    
}
