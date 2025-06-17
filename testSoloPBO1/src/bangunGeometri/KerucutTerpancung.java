
package bangunGeometri;

public class KerucutTerpancung extends Kerucut {
    private double r2,volumeKerucutTerpancung,luasPermukaanKerucutTerpancung;

    public KerucutTerpancung(double jariJari, double r2, double tinggi) {
        super(jariJari,tinggi);
        this.r2 = r2;
    }

    @Override
    public double hitungVolume() {
        double r1 = jariJari;
        double h = tinggi;
        this.volumeKerucutTerpancung = (1.0 / 3.0) * Math.PI * h * (Math.pow(r1, 2) + (r1 * r2) + Math.pow(r2, 2));
        return volumeKerucutTerpancung;
    }

    @Override
    public double hitungLuasPermukaan() {
        double r1 = jariJari;
        double h = tinggi;
        double luasAlasBawah = Math.PI * Math.pow(r1, 2);
        double luasAlasAtas = Math.PI * Math.pow(r2, 2);
        double garisPelukis = Math.sqrt(Math.pow(h, 2) + Math.pow(r1 - r2, 2));
        double luasSelimut = Math.PI * (r1 + r2) * garisPelukis;
        luasPermukaanKerucutTerpancung = luasAlasBawah + luasAlasAtas + luasSelimut;
        return luasPermukaanKerucutTerpancung;
    }
    
    public double hitungVolume(double jariJariBaru, double r2Baru, double tinggiBaru) {
        double r1 = jariJariBaru;
        double h = tinggiBaru;
        volumeKerucutTerpancung = (1.0 / 3.0) * Math.PI * h * (Math.pow(r1, 2) + (r1 * r2Baru) + Math.pow(r2Baru, 2));
        return volumeKerucutTerpancung;
    }
    
    public double hitungLuasPermukaan(double jariJariBaru, double r2Baru, double tinggiBaru) {
        double r1 = jariJariBaru;
        double h = tinggiBaru;
        double luasAlasBawah = Math.PI * Math.pow(r1, 2);
        double luasAlasAtas = Math.PI * Math.pow(r2Baru, 2);
        double garisPelukis = Math.sqrt(Math.pow(h, 2) + Math.pow(r1 - r2Baru, 2));
        double luasSelimut = Math.PI * (r1 + r2Baru) * garisPelukis;
        luasPermukaanKerucutTerpancung = luasAlasBawah + luasAlasAtas + luasSelimut;
        return luasPermukaanKerucutTerpancung;
    }
    
    @Override
    public String getNama() {
        nama = "Kerucut Terpancung";
        return nama ;
    }
}

