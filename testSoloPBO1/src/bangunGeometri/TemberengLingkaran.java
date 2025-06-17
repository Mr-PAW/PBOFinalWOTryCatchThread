
package bangunGeometri;

public class TemberengLingkaran extends Lingkaran {
    private double sudut,luas,keliling;

    public TemberengLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }

    @Override
    public double hitungLuas() {
        double luasLingkaran = super.hitungLuas();
        double luasJuring = (sudut / 360.0) * luasLingkaran;
        double luasSegitiga = 0.5 * jariJari * jariJari * Math.sin(Math.toRadians(sudut));
        luas = luasJuring - luasSegitiga;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double kelilingLingkaran = super.hitungKeliling();
        double panjangBusur = (sudut / 360.0) * kelilingLingkaran;
        keliling = panjangBusur + 2 * jariJari * Math.sin(Math.toRadians(sudut / 2));
        return keliling;
    }
    
    public double hitungLuas(double jariJariBaru, double sudutBaru) {
        double luasLingkaran = super.hitungLuas(jariJariBaru);
        double luasJuring = (sudutBaru / 360.0) * luasLingkaran;
        double luasSegitiga = 0.5 * jariJariBaru * jariJariBaru * Math.sin(Math.toRadians(sudutBaru));
        luas = luasJuring - luasSegitiga;
        return luas;
    }
    
    public double hitungKeliling(double jariJariBaru, double sudutBaru) {
        double kelilingLingkaran = super.hitungKeliling(jariJariBaru);
        double panjangBusur = (sudutBaru / 360.0) * kelilingLingkaran;
        keliling = panjangBusur + 2 * jariJariBaru * Math.sin(Math.toRadians(sudutBaru / 2));
        return keliling;
    }
    
    @Override
    public String getNama() {
        nama = "Tembereng Lingkaran";
        return nama ;
    }
}
