
package bangunGeometri;

public class TemberengBola extends Bola {
    private double sudut, volumeTembereng, luasPermukaanTembereng;
    
    public TemberengBola(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }
    
    @Override
    public double hitungVolume() {
        double volumeJuring = (sudut / 360.0) * (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        double tinggi = jariJari * (1 - Math.cos(Math.toRadians(sudut / 2)));
        volumeTembereng = volumeJuring - (Math.PI * Math.pow(tinggi, 2) * (3 * jariJari - tinggi)) / 3;
        return volumeTembereng;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasLingkaran = super.hitungLuas();
        luasPermukaanTembereng = (sudut / 360.0) * 4 * luasLingkaran;
        return luasPermukaanTembereng;
    }
    
    public double hitungVolume(double jariJariBaru, double sudutBaru) {
        double volumeJuring = (sudutBaru / 360.0) * (4.0 / 3.0) * Math.PI * Math.pow(jariJariBaru, 3);
        double tinggi = jariJariBaru * (1 - Math.cos(Math.toRadians(sudutBaru / 2)));
        volumeTembereng = volumeJuring - (Math.PI * Math.pow(tinggi, 2) * (3 * jariJariBaru - tinggi)) / 3;
        return volumeTembereng;
    }
    
    public double hitungLuasPermukaan(double jariJariBaru, double sudutBaru) {
        double luasLingkaran = super.hitungLuas(jariJariBaru);
        luasPermukaanTembereng = (sudutBaru / 360.0) * 4 * luasLingkaran;
        return luasPermukaanTembereng;
    }

    
    @Override
    public String getNama(){
        nama = "Tembereng Bola";
        return nama;
    }
}