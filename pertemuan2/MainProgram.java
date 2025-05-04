package pertemuan2; // Tambahkan ini di baris pertama

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        // Input data
        System.out.print("Masukkan NIM: ");
        mhs.setNim(input.nextLine());

        System.out.print("Masukkan Nama: ");
        mhs.setNama(input.nextLine());

        System.out.print("Masukkan Nilai UTS: ");
        mhs.setUts(input.nextFloat());

        System.out.print("Masukkan Nilai UAS: ");
        mhs.setUas(input.nextFloat());

        // Output hasil
        System.out.println("\n=============================");
        System.out.println("NIM        : " + mhs.getNim());
        System.out.println("Nama       : " + mhs.getNama());
        System.out.println("Nilai Akhir: " + mhs.getNilaiAkhir());
        System.out.println("Grade      : " + mhs.getGrade());
        System.out.println("=============================");

        input.close();
    }
}
