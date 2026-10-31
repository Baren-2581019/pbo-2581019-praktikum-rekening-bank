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