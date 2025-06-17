
package bangunGeometri;

public class LimasJajarGenjang extends JajarGenjang {
    private double tinggiLimas,volume,luasPermukaan;
    
    public LimasJajarGenjang(double alas, double tinggi, double sisiMiring, double tinggiLimas) {
        super(alas, tinggi, sisiMiring);
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = (1.0 / 3.0) * luasAlas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double tinggiSisiTegak1 = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(tinggi / 2.0, 2));
        double tinggiAlasKedua = alas * tinggi / sisiMiring;
        double tinggiSisiTegak2 = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(tinggiAlasKedua / 2.0, 2));
        double luasSelimut1 = (1.0/2.0) * alas * tinggiSisiTegak1;
        double luasSelimut2 = (1.0/2.0) * sisiMiring * tinggiSisiTegak2;
        luasPermukaan = luasAlas + 2 * luasSelimut1 + 2 * luasSelimut2;
        return luasPermukaan;
    }
    
    public double hitungVolume(double alasBaru, double tinggiBaru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(alasBaru, tinggiBaru);
        volume = (1.0 / 3.0) * luasAlas * tinggiLimasBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double alasBaru, double tinggiBaru, double sisiMiringBaru, double tinggiLimasBaru) {
        double luasAlas = super.hitungLuas(alasBaru, tinggiBaru);
        double tinggiSisiTegak1 = Math.sqrt(Math.pow(tinggiLimasBaru, 2) + Math.pow(tinggiBaru / 2.0, 2));
        double tinggiAlasKedua = alasBaru * tinggiBaru / sisiMiringBaru;
        double tinggiSisiTegak2 = Math.sqrt(Math.pow(tinggiLimasBaru, 2) + Math.pow(tinggiAlasKedua / 2.0, 2));
        double luasSelimut1 = (1.0/2.0) * alasBaru * tinggiSisiTegak1;
        double luasSelimut2 = (1.0/2.0) * sisiMiringBaru * tinggiSisiTegak2;
        luasPermukaan = luasAlas + 2 * luasSelimut1 + 2 * luasSelimut2;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Limas Jajar Genjang";
        return nama ;
    }
    
}