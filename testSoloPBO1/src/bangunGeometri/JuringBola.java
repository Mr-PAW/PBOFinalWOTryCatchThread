
package bangunGeometri;

public class JuringBola extends Bola {
    private double sudut,volume,luasPermukaan;
    
    public JuringBola(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }

    @Override
    public double hitungVolume() {
        volume = (Math.toRadians(sudut)/3) * Math.pow(jariJari, 3); 
        return volume;

    }
     
    @Override
    public double hitungLuasPermukaan() {
        double luasLingkaran = super.hitungLuas();
        luasPermukaan = (jariJari * jariJari * Math.toRadians(sudut)) + (luasLingkaran); 
        return luasPermukaan;
        
    }
    
    public double hitungVolume(double jariJariBaru, double sudutBaru) {
        volume = (Math.toRadians(sudutBaru)/3) * Math.pow(jariJariBaru, 3); 
        return volume;
    }
    
    public double hitungLuasPermukaan(double jariJariBaru, double sudutBaru) {
        double luasLingkaran = super.hitungLuas(jariJariBaru);
        luasPermukaan = (jariJariBaru * jariJariBaru * Math.toRadians(sudutBaru)) + (luasLingkaran); 
        return luasPermukaan;    
    }
    
    @Override
    public String getNama(){
        nama = "Juring Bola";
        return nama;
    }
}