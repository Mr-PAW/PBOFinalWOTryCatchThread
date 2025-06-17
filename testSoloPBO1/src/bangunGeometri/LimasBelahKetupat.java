
package bangunGeometri;

public class LimasBelahKetupat extends BelahKetupat {
    private double tinggiLimas,volume,luasPermukaan;

    public LimasBelahKetupat(double d1, double d2, double tinggiLimas) {
        super(d1,d2);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double sisiAlas = Math.sqrt(Math.pow(d1 / 2.0, 2) + Math.pow(d2 / 2.0, 2));
        double jarakPusatKeSisi = luasAlas / (2 * sisiAlas);
        double tinggiSisiTegak = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(jarakPusatKeSisi, 2));
        double luasSelimut = (1.0/2.0) * sisiAlas * tinggiSisiTegak;
        luasPermukaan = luasAlas + 4 * luasSelimut;
        return luasPermukaan;
    }
    
    public double hitungVolume(double d1Baru, double d2Baru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(d1Baru, d2Baru);
        volume = (1.0 / 3.0) * luasAlas * tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double d1Baru, double d2Baru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(d1Baru, d2Baru);
        double sisiAlas = Math.sqrt(Math.pow(d1Baru / 2.0, 2) + Math.pow(d2Baru / 2.0, 2));
        double jarakPusatKeSisi = luasAlas / (2 * sisiAlas);
        double tinggiSisiTegak = Math.sqrt(Math.pow(tinggiLimasBaru, 2) + Math.pow(jarakPusatKeSisi, 2));
        double luasSelimut = (1.0/2.0) * sisiAlas * tinggiSisiTegak;
        luasPermukaan = luasAlas + 4 * luasSelimut;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Limas Belah Ketupat";
        return nama ;
    }
    
}
