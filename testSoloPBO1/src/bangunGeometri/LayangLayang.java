
package bangunGeometri;

public class LayangLayang extends AbstrakBangunGeometri {
    public double d1, d2, miring1, miring2,luas,keliling;

    public LayangLayang(double d1, double d2, double miring1, double miring2) {
        this.d1 = d1;
        this.d2 = d2;
        this.miring1 = miring1;
        this.miring2 = miring2;
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * d1 * d2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (miring1 + miring2);
        return keliling;
    }
    
    public double hitungLuas(double d1Baru, double d2Baru) {
        luas = 0.5 * d1Baru * d2Baru;
        return luas;
    }
    
    public double hitungKeliling(double miring1Baru, double miring2Baru) {
        keliling = 2 * (miring1Baru + miring2Baru);
        return keliling;
    }

    @Override
    public String getNama() {
        nama = "Layang Layang";
        return nama;
    }
}
