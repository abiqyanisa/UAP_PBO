package kasir;

public class Penjualan implements ProductCounter{
    
    int id_penjualan;
    int kuantitas;
    int harga;
    double diskon;
    int total;

    public Penjualan(int id_penjualan, int kuantitas, int harga, double diskon, int total) {
        this.id_penjualan = id_penjualan;
        this.kuantitas = kuantitas;
        this.harga = harga;
        this.diskon = diskon;
        this.total = total;
    }

    public int getId_penjualan() {
        return id_penjualan;
    }

    public void setId_penjualan(int id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    @Override
    public double hitungJumlahProduk() {
        return 0;
    }
    
    @Override
    public double hitungHargaTotal() {
        return 0;
    }
    
}
