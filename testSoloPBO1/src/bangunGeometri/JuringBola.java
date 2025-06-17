
package bangunGeometri;

public class JuringBola extends Bola {
    private double sudut,volumeJuring,luasPermukaanJuring;
    
    public JuringBola(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }

    @Override
    public double hitungVolume() {
        volumeJuring = (Math.toRadians(sudut)/3) * Math.pow(jariJari, 3); 
        return volumeJuring;

    }
     
    @Override
    public double hitungLuasPermukaan() {
        double luasLingkaran = super.hitungLuas();
        luasPermukaanJuring = (jariJari * jariJari * Math.toRadians(sudut)) + (luasLingkaran); 
        return luasPermukaanJuring;
        
    }
    
    public double hitungVolume(double jariJariBaru, double sudutBaru) {
        volumeJuring = (Math.toRadians(sudutBaru)/3) * Math.pow(jariJariBaru, 3); 
        return volumeJuring;
    }
    
    public double hitungLuasPermukaan(double jariJariBaru, double sudutBaru) {
        double luasLingkaran = super.hitungLuas(jariJariBaru);
        luasPermukaanJuring = (jariJariBaru * jariJariBaru * Math.toRadians(sudutBaru)) + (luasLingkaran); 
        return luasPermukaanJuring;    
    }
    
    @Override
    public String getNama(){
        nama = "Juring Bola";
        return nama;
    }
}