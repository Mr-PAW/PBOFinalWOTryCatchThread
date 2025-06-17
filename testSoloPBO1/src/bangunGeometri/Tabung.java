
package bangunGeometri;

public class Tabung extends Lingkaran {
    private double tinggiTabung,volume,luasPermukaan;

    public Tabung(double jariJari, double tinggiTabung) {
        super(jariJari);
        this.tinggiTabung = tinggiTabung;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = luasAlas * tinggiTabung;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double kelilingLingkaran = super.hitungKeliling();
        double luasSelimut = kelilingLingkaran * tinggiTabung;
        luasPermukaan = luasSelimut + (2 * luasAlas);
        return luasPermukaan;
    }
    
    public double hitungVolume(double jariJariBaru, double tinggiTabungBaru) {
        double luasAlas = super.hitungLuas(jariJariBaru);
        volume = luasAlas * tinggiTabungBaru;
        return volume;
    }

    public double hitungLuasPermukaan(double jariJariBaru, double tinggiTabungBaru) {
        double luasAlas = super.hitungLuas(jariJariBaru);
        double kelilingLingkaran = super.hitungKeliling(jariJariBaru);
        double luasSelimut = kelilingLingkaran * tinggiTabungBaru;
        luasPermukaan = luasSelimut + (2 * luasAlas);
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Tabung";
        return nama ;
    }
}
