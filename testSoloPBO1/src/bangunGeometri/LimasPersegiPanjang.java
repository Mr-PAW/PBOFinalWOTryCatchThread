
package bangunGeometri;

public class LimasPersegiPanjang extends PersegiPanjang  {
    private double tinggiLimas,volume,luasPermukaan;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggiLimas) {
        super(panjang, lebar);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double tinggiSisiTegak1 = Math.sqrt(tinggiLimas + (panjang/2));
        double tinggiSisiTegak2 = Math.sqrt(tinggiLimas + (lebar/2));
        double selimut1 = (1.0/2.0) * panjang * tinggiSisiTegak1;
        double selimut2 = (1.0/2.0) * lebar * tinggiSisiTegak2;
        double luasSelimut = 2 * selimut1 + 2 * selimut2;
        luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    public double hitungVolume(double panjangBaru, double lebarBaru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(panjangBaru, lebarBaru);
        volume = (1.0 / 3.0) * luasAlas * tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double panjangBaru, double lebarBaru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(panjangBaru, lebarBaru);
        double tinggiSisiTegak1 = Math.sqrt(tinggiLimasBaru + (panjangBaru/2));
        double tinggiSisiTegak2 = Math.sqrt(tinggiLimasBaru + (lebarBaru/2));
        double selimut1 = (1.0/2.0) * panjangBaru * tinggiSisiTegak1;
        double selimut2 = (1.0/2.0) * lebarBaru * tinggiSisiTegak2;
        double luasSelimut = 2 * selimut1 + 2 * selimut2;
        luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Limas Persegi Panjang";
        return nama ;
    }
}

