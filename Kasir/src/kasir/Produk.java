package kasir;

public class Produk {
    
    String barcode;
    String kategori;
    String nama_produk;
    double harga;

    public Produk(String barcode, String kategori, String nama_produk, double harga) {
        this.barcode = barcode;
        this.kategori = kategori;
        this.nama_produk = nama_produk;
        this.harga = harga;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

      
}
