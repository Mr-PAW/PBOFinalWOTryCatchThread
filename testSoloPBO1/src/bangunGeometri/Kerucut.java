
package bangunGeometri;

public class Kerucut extends Lingkaran {
    public double tinggi,volume,luasPermukaan;
    
    public Kerucut(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (1.0 / 3.0) * luasAlas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double garisPelukis = Math.sqrt(Math.pow(jariJari, 2) + Math.pow(tinggi, 2));
        double luasSelimut = Math.PI * jariJari * garisPelukis;
        luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan ;
    }
    
    public double hitungVolume(double jariJariBaru, double tinggiBaru) {
        double luasAlas = super.hitungLuas(jariJariBaru);
        volume = (1.0 / 3.0) * luasAlas * tinggiBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double jariJariBaru, double tinggiBaru) {
        double luasAlas = super.hitungLuas(jariJariBaru);
        double garisPelukis = Math.sqrt(Math.pow(jariJariBaru, 2) + Math.pow(tinggiBaru, 2));
        double luasSelimut = Math.PI * jariJariBaru * garisPelukis;
        luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan ;
    }
    
    @Override
    public String getNama() {
        nama = "Kerucut";
        return nama ;
    }
}

