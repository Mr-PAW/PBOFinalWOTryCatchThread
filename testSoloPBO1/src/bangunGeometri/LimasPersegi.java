
package bangunGeometri;

public class LimasPersegi extends Persegi{
    private double tinggiLimas,volume,luasPermukaan;

    public LimasPersegi(double sisi,double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double tinggiSisiTegak = Math.sqrt(tinggiLimas + (sisi/2));        
        double luasSelimut = (1.0/2.0) * super.hitungKeliling() * tinggiSisiTegak;
        luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    public double hitungVolume(double sisiBaru,double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(sisiBaru);
        volume = (1.0 / 3.0) * luasAlas * tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double sisiBaru,double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(sisiBaru);
        double tinggiSisiTegak = Math.sqrt(tinggiLimasBaru + (sisiBaru/2));        
        double luasSelimut = (1.0/2.0) * super.hitungKeliling(sisiBaru) * tinggiSisiTegak;
        luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Limas Persegi";
        return nama ;
    }
}
