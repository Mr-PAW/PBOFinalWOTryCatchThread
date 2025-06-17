
package bangunGeometri;

public class JuringLingkaran extends Lingkaran {
    private double sudut,keliling,luas;

    public JuringLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }

    @Override
    public double hitungLuas() {
        double luasLingkaran = super.hitungLuas();
        luas = (sudut / 360.0) * luasLingkaran;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double kelilingLingkaran = super.hitungKeliling();
        double diameter = 2 * jariJari;
        keliling = ((sudut / 360.0) *  kelilingLingkaran) + diameter;
        return keliling;
    }
    
    public double hitungLuas(double jariJariBaru, double sudutBaru) {
        double luasLingkaran = super.hitungLuas(jariJariBaru);
        luas = (sudutBaru / 360.0) * luasLingkaran;
        return luas;
    }
    
    public double hitungKeliling(double jariJariBaru, double sudutBaru) {
        double kelilingLingkaran = super.hitungKeliling(jariJariBaru);
        double diameter = 2 * jariJariBaru;
        keliling = ((sudut / 360.0) *  kelilingLingkaran) + diameter;
        return keliling;
    }
    
    @Override
    public String getNama() {
        nama = "Juring Lingkaran";
        return nama ;
    }
}
