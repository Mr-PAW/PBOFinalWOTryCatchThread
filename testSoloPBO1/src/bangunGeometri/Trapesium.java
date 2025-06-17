
package bangunGeometri;

public class Trapesium extends AbstrakBangunGeometri {
    public double a, b, miring, keliling, luas;
    
    //samakaki
    public Trapesium(double a, double b, double miring) {
        this.a = a;
        this.b = b;
        this.miring = miring;
    }

    @Override
    public double hitungLuas() {
        double tinggi = Math.sqrt((miring * miring) - (((a-b)/2)*((a-b)/2)));
        luas =  0.5 * (a + b) * tinggi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = a + b + (miring * 2);
        return keliling;
    }
    
    public double hitungLuas(double aBaru, double bBaru, double miringBaru) {
        double tinggi = Math.sqrt((miringBaru * miringBaru) - (((aBaru-bBaru)/2)*((aBaru-bBaru)/2)));
        luas =  0.5 * (aBaru + bBaru) * tinggi;
        return luas;
    }
    public double hitungKeliling(double aBaru, double bBaru, double miringBaru) {
        keliling = aBaru + bBaru + (miringBaru * 2);
        return keliling;
    }

    @Override
    public String getNama() {
        nama = "Trapesium";
        return nama ;
    }
}
