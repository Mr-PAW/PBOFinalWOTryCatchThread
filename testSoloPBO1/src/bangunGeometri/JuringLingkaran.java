
package bangunGeometri;

public class JuringLingkaran extends Lingkaran {
    private double sudut,kelilingJuring,luasJuring;

    public JuringLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }

    @Override
    public double hitungLuas() {
        double luasLingkaran = super.hitungLuas();
        luasJuring = (sudut / 360.0) * luasLingkaran;
        return luasJuring;
    }

    @Override
    public double hitungKeliling() {
        double kelilingLingkaran = super.hitungKeliling();
        double diameter = 2 * jariJari;
        kelilingJuring = ((sudut / 360.0) *  kelilingLingkaran) + diameter;
        return kelilingJuring;
    }
    
    public double hitungLuas(double jariJariBaru, double sudutBaru) {
        double luasLingkaran = super.hitungLuas(jariJariBaru);
        luasJuring = (sudutBaru / 360.0) * luasLingkaran;
        return luasJuring;
    }
    
    public double hitungKeliling(double jariJariBaru, double sudutBaru) {
        double kelilingLingkaran = super.hitungKeliling(jariJariBaru);
        double diameter = 2 * jariJariBaru;
        kelilingJuring = ((sudut / 360.0) *  kelilingLingkaran) + diameter;
        return kelilingJuring;
    }
    
    @Override
    public String getNama() {
        nama = "Juring Lingkaran";
        return nama ;
    }
}
