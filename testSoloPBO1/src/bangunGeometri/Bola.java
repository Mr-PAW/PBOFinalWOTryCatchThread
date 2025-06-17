
package bangunGeometri;

public class Bola extends Lingkaran {
    public double volume,luasPermukaan;

    public Bola(double jariJari) {
        super(jariJari);
    }
    
    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (4.0 / 3.0) * luasAlas * jariJari;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        luasPermukaan = 4 * luasAlas;
        return luasPermukaan;
    }
    
    public double hitungVolume(double jariJariBaru) {
        double luasAlas = super.hitungLuas(jariJariBaru);
        volume = (4.0 / 3.0) * luasAlas * jariJariBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double jariJariBaru) {
        double luasAlas = super.hitungLuas(jariJariBaru);
        luasPermukaan = 4 * luasAlas;
        return luasPermukaan;
    }
    
    @Override
    public String getNama(){
        nama = "Bola";
        return nama;
    }
}

