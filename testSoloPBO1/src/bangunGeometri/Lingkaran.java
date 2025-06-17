
package bangunGeometri;

public class Lingkaran extends AbstrakBangunGeometri {
    public double jariJari, luas, keliling;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        luas = Math.PI * jariJari * jariJari;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * Math.PI * jariJari; 
        return keliling;
    }
    
    public double hitungLuas(double jariJariBaru) {
        luas = Math.PI * jariJariBaru * jariJariBaru;
        return luas;
    }
    
    public double hitungKeliling(double jariJariBaru) {
        keliling = 2 * Math.PI * jariJariBaru; 
        return keliling;
    }

    @Override
    public String getNama() {
        nama = "Lingkaran";
        return nama;
    }
}
