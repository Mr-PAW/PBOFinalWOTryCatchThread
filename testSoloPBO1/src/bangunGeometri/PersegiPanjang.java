
package bangunGeometri;

public class PersegiPanjang extends AbstrakBangunGeometri {
    public double panjang,lebar,keliling,luas;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
    
    public double hitungLuas(double panjangBaru, double lebarBaru) {
        luas = panjangBaru * lebarBaru;
        return luas;
    }
    
    public double hitungKeliling(double panjangBaru, double lebarBaru) {
        keliling = 2 * (panjangBaru + lebarBaru);
        return keliling;
    }

    @Override
    public String getNama() {
        nama = "Persegi Panjang";
        return nama;
    }
}

