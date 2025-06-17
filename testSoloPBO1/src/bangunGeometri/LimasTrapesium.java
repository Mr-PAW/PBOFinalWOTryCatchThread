
package bangunGeometri;

public class LimasTrapesium extends Trapesium {
    private double tinggiLimas,volume,luasPermukaan;
    
    public  LimasTrapesium(double a, double b, double miring, double tinggiLimas) {
        super(a,b,miring);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double tinggiTrapesium = Math.sqrt((miring * miring) - (((a-b)/2)*((a-b)/2)));
        double apotemaAlasSejajar = tinggiTrapesium / 2.0;
        double tinggiSisiTegakSejajar = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(apotemaAlasSejajar, 2));
        double luasSelimutSisiSejajar = 0.5 * (a + b) * tinggiSisiTegakSejajar;
        double apotemaAlasMiring = (tinggiTrapesium * (a + b)) / (4 * miring);
        double tinggiSisiTegakMiring = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(apotemaAlasMiring, 2));
        double luasSelimutSisiMiring = 2 * (0.5 * miring * tinggiSisiTegakMiring);
        luasPermukaan = luasAlas + luasSelimutSisiSejajar + luasSelimutSisiMiring;
        return luasPermukaan;
    }
    
    public double hitungVolume(double aBaru, double bBaru, double miringBaru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(aBaru, bBaru, miringBaru);
        volume = (1.0 / 3.0) * luasAlas * tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double aBaru, double bBaru, double miringBaru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(aBaru, bBaru,miringBaru);
        double tinggiTrapesium = Math.sqrt((miringBaru * miringBaru) - (((aBaru-bBaru)/2)*((aBaru-bBaru)/2)));
        double apotemaAlasSejajar = tinggiTrapesium / 2.0;
        double tinggiSisiTegakSejajar = Math.sqrt(Math.pow(tinggiLimasBaru, 2) + Math.pow(apotemaAlasSejajar, 2));
        double luasSelimutSisiSejajar = 0.5 * (aBaru + bBaru) * tinggiSisiTegakSejajar;
        double apotemaAlasMiring = (tinggiTrapesium * (aBaru + bBaru)) / (4 * miringBaru);
        double tinggiSisiTegakMiring = Math.sqrt(Math.pow(tinggiLimasBaru, 2) + Math.pow(apotemaAlasMiring, 2));
        double luasSelimutSisiMiring = 2 * (0.5 * miringBaru * tinggiSisiTegakMiring);
        luasPermukaan = luasAlas + luasSelimutSisiSejajar + luasSelimutSisiMiring;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Limas Trapesium";
        return nama ;
    }
}
