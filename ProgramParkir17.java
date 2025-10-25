import java.util.Scanner;

public class ProgramParkir17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jenis, durasi, total = 0;
        
        do {
            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
            jenis = scanner.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir (jam):");
                durasi = scanner.nextInt();
                
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
            }
            
        } while (jenis != 0);
        
        System.out.println("Total pembayaran: Rp " + total);
        
        scanner.close();
    }
}