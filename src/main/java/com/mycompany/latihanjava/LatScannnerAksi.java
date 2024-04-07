/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAIRA SYAHFITRI
 */
public class LatScannnerAksi {
    public static void main(String[] args) {
        LatScanner scanner = new LatScanner();
        scanner.inputData();
        double rataRata = scanner.hitungRataRata();
        String grade = scanner.tentukanGrade(rataRata);
        scanner.tampilkanOutput(rataRata, grade);
    }
}

