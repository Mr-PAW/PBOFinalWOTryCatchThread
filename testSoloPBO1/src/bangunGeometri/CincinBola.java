
package bangunGeometri;

public class CincinBola extends Bola {
    private double jariJariDalam,volumeCincin,luasPermukaanCincin;

    public CincinBola(double jariJari, double jariJariDalam) {
        super(jariJari);
        this.jariJariDalam = jariJariDalam;
    }

    @Override
    public double hitungVolume() {
        double volumeLuar = super.hitungVolume(); 
        double volumeDalam = super.hitungVolume(jariJariDalam);
        volumeCincin = volumeLuar - volumeDalam;
        return volumeCincin;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasLuar = super.hitungLuasPermukaan();
        double luasDalam = 4 * Math.PI * Math.pow(jariJariDalam, 2);
        luasPermukaanCincin = luasLuar + luasDalam;
        return luasPermukaanCincin;
    }
    
    public double hitungVolume(double jariJariBaru, double jariJariDalamBaru) {
        double volumeLuar = super.hitungVolume(jariJariBaru);
        double volumeDalam = super.hitungVolume(jariJariDalamBaru);
        volumeCincin = volumeLuar - volumeDalam;
        return volumeCincin;
    }

    public double hitungLuasPermukaan(double jariJariBaru, double jariJariDalamBaru) {
        double luasLuar = 4 * Math.PI * Math.pow(jariJariBaru, 2);
        double luasDalam = 4 * Math.PI * Math.pow(jariJariDalamBaru, 2);
        luasPermukaanCincin = luasLuar + luasDalam;
        return luasPermukaanCincin;
    }

    @Override
    public String getNama(){
        nama = "Cincin Bola";
        return nama;
    }
}
