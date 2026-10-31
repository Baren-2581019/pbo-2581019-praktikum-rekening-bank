public class Rekening {
    // Field private
    private String nomor;
    private String pemilik;
    private int saldo;

    // Constructor menggunakan parameter bernama sama dengan field
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    // Method setor menolak jumlah <= 0
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        this.saldo += jumlah;
        return true;
    }

    // Method tarik menolak jumlah <= 0 dan jumlah yang melebihi saldo
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > this.saldo) {
            return false;
        }
        this.saldo -= jumlah;
        return true;
    }

    // Helper private untuk memformat tampilan Rupiah
    private String formatRupiah(int nominal) {
        return String.format("Rp%,d", nominal).replace(',', '.');
    }

    // Method cetakInfo
    public void cetakInfo() {
        System.out.println(this.nomor + " | " + this.pemilik + " | " + formatRupiah(this.saldo));
    }
}