
package bangunGeometri;

public class BelahKetupat extends AbstrakBangunGeometri {
    public double d1, d2, keliling, luas;

    public BelahKetupat(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * d1 * d2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 4 * (Math.sqrt((d1 / 2) * (d1 / 2) + (d2 / 2) * (d2 / 2)));
        return keliling;
    }
    
    public double hitungLuas(double d1Baru, double d2Baru){
        luas = 0.5 * d1Baru * d2Baru;
        return luas;
    }
    
    public double hitungKeliling(double d1Baru, double d2Baru) {
        keliling = 4 * (Math.sqrt((d1Baru / 2) * (d1Baru / 2) + (d2Baru / 2) * (d2Baru / 2)));
        return keliling;
    }

    @Override
    public String getNama() {
        nama = "Belah Ketupat";
        return nama;
    }
}

