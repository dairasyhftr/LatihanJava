
import java.util.Scanner;

/**
 *
 * @author DAIRA SYAHFITRI
 */
public class LatScanner {
    private String nim;
    private String nama;
    private double nilaiAbsen;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM NILAI MAHASISWA");
        System.out.println("-------------------------------------------");
        System.out.print("NIM : ");
        nim = scanner.nextLine();
        System.out.print("Nama Mahasiswa : ");
        nama = scanner.nextLine();
        System.out.print("Nilai Absen : ");
        nilaiAbsen = scanner.nextDouble();
        System.out.print("Nilai Tugas : ");
        nilaiTugas = scanner.nextDouble();
        System.out.print("Nilai UTS : ");
        nilaiUTS = scanner.nextDouble();
        System.out.print("Nilai UAS : ");
        nilaiUAS = scanner.nextDouble();
    }

    public double hitungRataRata() {
        return (0.1 * nilaiAbsen) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public String tentukanGrade(double rataRata) {
        if (rataRata >= 90) {
            return "A";
        } else if (rataRata >= 80) {
            return "B";
        } else if (rataRata >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    public void tampilkanOutput(double rataRata, String grade) {
        System.out.println("-------------------------------------------");
        System.out.println("Rata-Rata : " + rataRata);
        System.out.println("Grade : " + grade);
        System.out.println("-------------------------------------------");
    }
}

