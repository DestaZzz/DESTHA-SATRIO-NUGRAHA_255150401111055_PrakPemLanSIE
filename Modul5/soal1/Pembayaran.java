abstract class Pembayaran {
    public abstract void bayar(double total);
}

class COD extends Pembayaran {
    public void bayar(double total) {
        System.out.println("Bayar " + total + " saat barang sampai (COD)");
    }
}

class ShopeePay extends Pembayaran {
    public void bayar(double total) {
        System.out.println("Bayar " + total + " menggunakan ShopeePay");
    }
}

class TransferBank extends Pembayaran {
    public void bayar(double total) {
        System.out.println("Bayar " + total + " melalui transfer bank");
    }
}