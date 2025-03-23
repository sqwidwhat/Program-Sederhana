import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Tugas1 tugas = new Tugas1();
        while (true) {
            String pilihan = JOptionPane.showInputDialog("Pilih nomor soal (1-10):");

            if (pilihan == null) {
                JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan program ini!");
                break;
            }

            try {
                switch (pilihan) {
                    case "1" -> tugas.nomor1();
                    case "2" -> tugas.nomor2();
                    case "3" -> tugas.nomor3();
                    case "4" -> tugas.nomor4();
                    case "5" -> tugas.nomor5();
                    case "6" -> tugas.nomor6();
                    case "7" -> tugas.nomor7();
                    case "8" -> tugas.nomor8();
                    case "9" -> tugas.nomor9();
                    case "10" -> tugas.nomor10();
                    default -> JOptionPane.showMessageDialog(null, "Nomor tidak valid! Silakan pilih lagi.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
            }
        }
    }
}

class Tugas1 {
    private final DecimalFormat format = new DecimalFormat("#,##0.00");

    // Metode nomor1: Menghitung total belanja setelah diskon
    public void nomor1() {
        try {
            double totalNilaiBelanja = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Total Belanja: "));
            double diskon = totalNilaiBelanja >= 150000 ? totalNilaiBelanja * 0.1 : 0;
            double totalBayar = totalNilaiBelanja - diskon;

            JOptionPane.showMessageDialog(null,
                    "Total Belanja  : Rp. " + format.format(totalNilaiBelanja) +
                            "\nTotal Diskon   : Rp. " + format.format(diskon) +
                            "\n|-----------------------------------------|" +
                            "\nTotal Bayar     : Rp. " + format.format(totalBayar));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
        }
    }

    // Metode nomor2: Mengecek bilangan ganjil/genap
    public void nomor2() {
        try {
            int bilangan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka Bilangan: "));
            JOptionPane.showMessageDialog(null, bilangan + " adalah bilangan " + (bilangan % 2 == 0 ? "genap" : "ganjil"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
        }
    }

    // Metode nomor3: Membandingkan 2 buah bilangan
    public void nomor3() {
        try {
            double bil1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan bilangan pertama"));
            double bil2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan bilangan kedua"));
            JOptionPane.showMessageDialog(null, (bil1 > bil2 ? bil1 + " lebih besar dari " + bil2 : bil2 + " lebih besar dari " + bil1));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
        }
    }

    // Metode nomor4: Menentukan gaji karyawan berdasarkan golongan
    public void nomor4() {
        String golongan = JOptionPane.showInputDialog("Masukkan golongan pegawai (A, B, C, D):").toUpperCase();
        int gaji;

        switch (golongan) {
            case "A" -> gaji = 2000000;
            case "B" -> gaji = 1500000;
            case "C" -> gaji = 1000000;
            case "D" -> gaji = 850000;
            default -> {
                JOptionPane.showMessageDialog(null, "Mohon input golongan dengan benar!");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Golongan " + golongan + "\nGaji anda sebesar Rp." + format.format(gaji));
    }

    // Metode nomor5: Grade nilai mahasiswa
    public void nomor5() {
        try {
            double nilai = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai anda: "));
            String grade;

            if (nilai >= 80 && nilai <= 100) {
                grade = "A";
            } else if (nilai >= 70) {
                grade = "B";
            } else if (nilai >= 60) {
                grade = "C";
            } else if (nilai >= 40) {
                grade = "D";
            } else if (nilai >= 0) {
                grade = "E";
            } else {
                JOptionPane.showMessageDialog(null, "Mohon input nilai dengan benar!");
                return;
            }

            JOptionPane.showMessageDialog(null, "Nilai Anda adalah " +
                    nilai + "\nGrade untuk nilai Anda adalah " + grade);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
        }
    }

    // Metode nomor6: Nilai terbesar dari 3 buah bilangan
    public void nomor6() {
        try {
            double bil1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan bilangan pertama"));
            double bil2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan bilangan kedua"));
            double bil3 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan bilangan ketiga"));
            double bilTerbesar = Math.max(bil1, Math.max(bil2, bil3));
            JOptionPane.showMessageDialog(null, "Bilangan terbesar adalah " + bilTerbesar);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
        }
    }

    // Metode nomor7: Upah
    public void nomor7() {
        String nama = JOptionPane.showInputDialog("Masukkan nama pegawai:");
        String golongan = JOptionPane.showInputDialog("Masukkan golongan pegawai (A, B, C, D):").toUpperCase();
        double jamKerja;

        try {
            jamKerja = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jumlah jam kerja:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
            return;
        }

        int upahPerJam;
        double jamKerjaNormal = 48;
        double lembur = 0;
        double gaji;

        switch (golongan) {
            case "A" -> upahPerJam = 4000;
            case "B" -> upahPerJam = 5000;
            case "C" -> upahPerJam = 6000;
            case "D" -> upahPerJam = 7500;
            default -> {
                JOptionPane.showMessageDialog(null, "Mohon input golongan dengan benar!");
                return;
            }
        }

        if (jamKerja > jamKerjaNormal) {
            lembur = (jamKerja - jamKerjaNormal) * 3000;
            jamKerja = jamKerjaNormal;
        }

        gaji = (upahPerJam * jamKerja) + lembur;

        JOptionPane.showMessageDialog(null, nama +
                "\nGolongan " + golongan +
                "\nUpah Lembur Rp." + format.format(lembur) +
                "\nGaji anda sebesar Rp." + format.format(gaji));
    }

    // Metode nomor8: Hitung Harga
    public void nomor8() {
        try {
            int banyak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan banyak pesanan:"));
            int lusin = banyak / 12;
            int sisa = banyak % 12;

            int hargaLusin = lusin * 15000;
            int hargaSatuan = sisa * 1500;
            int totalHarga = hargaLusin + hargaSatuan;

            double diskon = 0;
            if (lusin >= 10 && lusin <= 30) {
                diskon = 0.1;
            } else if (lusin > 30) {
                diskon = 0.2;
            }

            double hargaSetelahDiskon = totalHarga - (totalHarga * diskon);

            JOptionPane.showMessageDialog(null, "Total harga sebelum diskon Rp." + format.format(totalHarga) +
                    "\nDiskon Rp." + format.format(totalHarga * diskon) +
                    "\nTotal harga setelah diskon Rp." + format.format(hargaSetelahDiskon));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
        }
    }

    // Metode nomor9: Temperatur
    public void nomor9() {
        try {
            double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Masukkan temperatur dalam Fahrenheit: "));
            double celcius = (5.0 / 9.0) * (fahrenheit - 32);
            String suhu = celcius > 30 ? "Panas" : celcius < 25 ? "Dingin" : "Normal";

            JOptionPane.showMessageDialog(null, "Temp F: " + fahrenheit + "°F" +
                    "\nTemp C: " + String.format("%.2f", celcius) + "°C" +
                    "\nKondisi: " + suhu);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid! Silakan masukkan angka.");
        }
    }

    // Metode nomor10: Password
    public void nomor10() {
        String passwordBenar = "Andika";

        for (int i = 0; i < 3; i++) {
            String password = JOptionPane.showInputDialog("Masukkan password: ");
            if (password != null && password.equals(passwordBenar)) {
                JOptionPane.showMessageDialog(null, "Berhasil");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Gagal");
            }
        }

        JOptionPane.showMessageDialog(null, "Coba lain waktu");
    }
}