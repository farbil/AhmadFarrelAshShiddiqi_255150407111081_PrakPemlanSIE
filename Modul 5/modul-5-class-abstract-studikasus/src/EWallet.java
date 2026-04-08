public class EWallet extends MetodePembayaran {
    private String noHp;

    public EWallet(String namaMetode, String noHp) {
        super(namaMetode);
        this.noHp = noHp;
    }

    @Override
    public void prosesBayar(double nominal) {
        System.out.println("1. Mengecek validitas akun E-Wallet untuk nomor: " + this.noHp);
        System.out.println("2. Meminta input PIN dari user...");
        System.out.println("3. Saldo dipotong sebesar Rp" + nominal);
        System.out.println("Pembayaran Berhasil.\n");
    }
}