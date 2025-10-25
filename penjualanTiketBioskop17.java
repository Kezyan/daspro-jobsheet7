import java.util.Scanner;

public class penjualanTiketBioskop17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int hargaTiket = 50000; 
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        String lanjut;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlah = input.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.");
                continue; 
            }

            double totalHarga = jumlah * hargaTiket;
            double diskon = 0;

            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.10;
            }

            totalHarga -= totalHarga * diskon;

            totalTiketTerjual += jumlah;
            totalPendapatan += totalHarga;

            System.out.println("Total harga untuk " + jumlah + " tiket: Rp " + totalHarga);

            System.out.print("Apakah ingin input lagi? (y/n): ");
            lanjut = input.next();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\n=== Rekapitulasi Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
    }
}
