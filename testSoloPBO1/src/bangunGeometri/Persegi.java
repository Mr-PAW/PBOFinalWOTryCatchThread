
package bangunGeometri;

public class Persegi extends AbstrakBangunGeometri {
    public double sisi,keliling,luas;
    

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }
    
    public double hitungLuas(double sisiBaru) {
        luas = sisiBaru * sisiBaru;
        return luas;
    }
    
    public double hitungKeliling(double sisiBaru) {
        keliling = 4 * sisiBaru;
        return keliling;
    }

    @Override
    public String getNama() {
        nama = "Persegi";
        return nama; 
    }
}

