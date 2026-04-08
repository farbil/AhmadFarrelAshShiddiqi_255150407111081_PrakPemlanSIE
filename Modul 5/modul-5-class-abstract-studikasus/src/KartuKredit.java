public class KartuKredit extends MetodePembayaran {
    private String nomorKartu;

    public KartuKredit(String namaMetode, String nomorKartu) {
        super(namaMetode);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesBayar(double nominal) {
        System.out.println("1. Menghubungi server Bank untuk nomor kartu: " + this.nomorKartu);
        System.out.println("2. Memvalidasi kode CVV dan limit kartu kredit...");
        System.out.println("3. Tagihan diteruskan ke Bank sebesar Rp" + nominal);
        System.out.println("Pembayaran Berhasil.\n");
    }
}