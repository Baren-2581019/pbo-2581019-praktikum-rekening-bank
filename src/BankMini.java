import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        // Dikerjakan oleh: Baren Van Hoebel Marbun (NIM: 2581019)
        Rekening rekening = new Rekening("001", "Ani", 100000);

        /*
         * rekening.saldo = 1000000;
         * Error: saldo has private access in Rekening
         */

        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Menu: 1 setor 2 tarik 3 info 0 keluar");
            System.out.print("Pilih: ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.print("Jumlah setor: ");
                int setor = input.nextInt();
                if (rekening.setor(setor)) {
                    System.out.println("Setor berhasil.");
                } else {
                    System.out.println("Setor ditolak.");
                }
            } else if (menu == 2) {
                System.out.print("Jumlah tarik: ");
                int tarik = input.nextInt();
                if (rekening.tarik(tarik)) {
                    System.out.println("Tarik berhasil.");
                } else {
                    System.out.println("Tarik ditolak.");
                }
            } else if (menu == 3) {
                rekening.cetakInfo();
            } else if (menu != 0) {
                System.out.println("Menu tidak dikenal.");
            }
        } while (menu != 0);

        System.out.println("\n=== Saldo Akhir ===");
        rekening.cetakInfo();
    }
}