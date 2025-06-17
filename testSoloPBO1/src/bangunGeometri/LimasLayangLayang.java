
package bangunGeometri;

public class LimasLayangLayang extends LayangLayang {
    private double tinggiLimas,volume, luasPermukaan;

    public LimasLayangLayang(double d1, double d2, double miring1, double miring2, double tinggiLimas) {
        super(d1,d2,miring1,miring2);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double h1 = Math.sqrt(Math.pow(miring1, 2) - Math.pow(d2 / 2.0, 2));
        double h2 = Math.sqrt(Math.pow(miring2, 2) - Math.pow(d2 / 2.0, 2));
        double jarakPusatKeSisi1 = (h1 * (d2 / 2.0)) / miring1;
        double jarakPusatKeSisi2 = (h2 * (d2 / 2.0)) / miring2;
        double tinggiSisiTegak1 = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(jarakPusatKeSisi1, 2));
        double tinggiSisiTegak2 = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(jarakPusatKeSisi2, 2));
        double luasSelimut1 = 0.5 * miring1 * tinggiSisiTegak1;
        double luasSelimut2 = 0.5 * miring2 * tinggiSisiTegak2;
        luasPermukaan = luasAlas + (2 * luasSelimut1) + (2 * luasSelimut2);
        return luasPermukaan;
    }
    
    public double hitungVolume(double d1Baru, double d2Baru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(d1Baru, d2Baru);
        volume = (1.0 / 3.0) * luasAlas * tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double d1Baru, double d2Baru, double miring1Baru, double miring2Baru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(d1Baru, d2Baru);
        double h1 = Math.sqrt(Math.pow(miring1Baru, 2) - Math.pow(d2Baru / 2.0, 2));
        double h2 = Math.sqrt(Math.pow(miring2Baru, 2) - Math.pow(d2Baru / 2.0, 2));
        double jarakPusatKeSisi1 = (h1 * (d2Baru / 2.0)) / miring1Baru;
        double jarakPusatKeSisi2 = (h2 * (d2Baru / 2.0)) / miring2Baru;
        double tinggiSisiTegak1 = Math.sqrt(Math.pow(tinggiLimasBaru, 2) + Math.pow(jarakPusatKeSisi1, 2));
        double tinggiSisiTegak2 = Math.sqrt(Math.pow(tinggiLimasBaru, 2) + Math.pow(jarakPusatKeSisi2, 2));
        double luasSelimut1 = 0.5 * miring1Baru * tinggiSisiTegak1;
        double luasSelimut2 = 0.5 * miring2Baru * tinggiSisiTegak2;
        luasPermukaan = luasAlas + (2 * luasSelimut1) + (2 * luasSelimut2);
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Limas Layang Layang";
        return nama ;
    }
}
