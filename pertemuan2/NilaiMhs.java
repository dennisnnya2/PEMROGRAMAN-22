package pertemuan2;

import java.util.Scanner;

public class NilaiMhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim, nama, grade;
        double uts, uas, rata2;
        
        // Input data
        System.out.println("Masukkan Data Mahasiswa:");
        System.out.print("NIM: "); 
        nim = input.next();
        input.nextLine(); // Membersihkan buffer setelah next()
        
        System.out.print("Nama: "); 
        nama = input.nextLine(); // Menggunakan nextLine agar bisa input nama lengkap
        
        System.out.print("Nilai UTS: "); 
        uts = input.nextDouble();
        
        System.out.print("Nilai UAS: "); 
        uas = input.nextDouble();
        
        // Menghitung rata-rata
        rata2 = (uts + uas) / 2;
        
        // Menentukan grade
        if (rata2 < 50) {
            grade = "E";
        } else if (rata2 < 60) {
            grade = "D";
        } else if (rata2 < 70) {
            grade = "C";
        } else if (rata2 < 80) {
            grade = "B";
        } else {
            grade = "A";
        }
        
        // Menampilkan hasil
        System.out.println("\n===============================================");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s\n", "NIM", "Nama", "UTS", "UAS", "rata2", "Grade");
        System.out.println("===============================================");
        System.out.printf("%-10s %-15s %-10.2f %-10.2f %-10.2f %-10s\n", nim, nama, uts, uas, rata2,  grade);
        System.out.println("===============================================");
        
        input.close(); // Menutup scanner
    }
}