package pertemuan2;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    private String nim, nama;
    private float uts, uas;
    private double nilaiAkhir;

    // Konstruktor (Opsional)
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.uts = 0;
        this.uas = 0;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getUts() {
        return uts;
    }

    public void setUts(float uts) {
        this.uts = uts;
    }

    public float getUas() {
        return uas;
    }

    public void setUas(float uas) {
        this.uas = uas;
    }

    // Metode untuk menghitung nilai akhir
    public double getNilaiAkhir() {
        nilaiAkhir = (uts + uas) / 2;
        return nilaiAkhir;
    }

    // Metode untuk menentukan grade berdasarkan nilai akhir
    public String getGrade() {
        double nilai = getNilaiAkhir(); // Pastikan nilai akhir dihitung dulu
        String grade;
        
        if (nilai < 50) {
            grade = "E";
        } else if (nilai < 60) {
            grade = "D";
        } else if (nilai < 70) {
            grade = "C";
        } else if (nilai < 80) {
            grade = "B";
        } else {
            grade = "A";
        }
        
        return grade;
    }
}
