public abstract class MetodePembayaran {
    protected String namaMetode;

    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    public void tampilkanMetode() {
        System.out.println("Memproses pembayaran dengan: " + this.namaMetode);
    }

    public abstract void prosesBayar(double nominal);
}