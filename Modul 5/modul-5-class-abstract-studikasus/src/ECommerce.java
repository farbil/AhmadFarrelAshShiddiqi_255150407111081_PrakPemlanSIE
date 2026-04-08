public class ECommerce {
    public static void main(String[] args) {
        double tagihanBelanja = 150000;

        MetodePembayaran bayarPakeOpo = new EWallet("Opo", "081234567890");
        MetodePembayaran bayarPakeCC = new KartuKredit("Kartu Kredit BNI", "4512-3456-7890-1234");

        System.out.println("--- Skenario Checkout 1 ---");
        bayarPakeOpo.tampilkanMetode();
        bayarPakeOpo.prosesBayar(tagihanBelanja);

        System.out.println("--- Skenario Checkout 2 ---");
        bayarPakeCC.tampilkanMetode();
        bayarPakeCC.prosesBayar(tagihanBelanja);
    }
}