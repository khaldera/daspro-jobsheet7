import java.util.Scanner;

public class Bioskop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalHargaPenjualan = 0;
        int jumlahTiket;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan kembali.");
                continue;
            }

            double hargaTotal = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
               diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = hargaTotal - (hargaTotal * diskon);

            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += totalBayar;

            System.out.println("Total bayar transaksi ini: Rp " + totalBayar);

            } while (true);

            System.out.println("\n--- REKAP PENJUALAN HARI INI ---");
            System.out.println("Total tiket terjual: " + totalTiketTerjual);
            System.out.println("Total pendapatan: Rp " + totalHargaPenjualan);

            sc.close();
        }
    }
