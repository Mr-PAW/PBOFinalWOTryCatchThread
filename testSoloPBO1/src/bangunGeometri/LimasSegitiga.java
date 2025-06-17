
package bangunGeometri;

public class LimasSegitiga extends Segitiga{
    private double tinggiLimas,volume,luasPermukaan;

    
    public LimasSegitiga(double alas, double tinggi, double tinggiLimas) {
        super(alas, tinggi);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = (Math.pow(alas, 2) * Math.sqrt(3)) / 4.0;
        double apotema = (alas * Math.sqrt(3)) / 6.0;
        double tinggiSisiTegak = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(apotema, 2));
        double luasSatuSisiTegak = 0.5 * alas * tinggiSisiTegak;
        double luasSelimut = 3 * luasSatuSisiTegak;
        luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    public double hitungVolume(double alasBaru, double tinggiBaru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(alasBaru, tinggiBaru);
        volume = (1.0 / 3.0) * luasAlas * tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double alasBaru, double tinggiBaru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(alasBaru, tinggiBaru);
        double apotema = (alasBaru * Math.sqrt(3)) / 6.0;
        double tinggiSisiTegak = Math.sqrt(Math.pow(tinggiLimasBaru, 2) + Math.pow(apotema, 2));
        double luasSatuSisiTegak = 0.5 * alasBaru * tinggiSisiTegak;
        double luasSelimut = 3 * luasSatuSisiTegak;
        luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Limas Segitiga";
        return nama ;
    }
}
