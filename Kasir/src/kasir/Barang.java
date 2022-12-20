package kasir;

public class Barang extends Produk{

    public Barang(String barcode, String kategori, String nama_produk, double harga) {
        super(barcode, kategori, nama_produk, harga);
    }

    @Override
    public String getKategori() {
        return kategori;
    }

    @Override
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String getNama_produk() {
        return nama_produk;
    }

    @Override
    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String getBarcode() {
        return barcode;
    }

    @Override
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    
}
