
package bangunGeometri;

public class CincinBola extends Bola {
    private double jariJariDalam,volume,luasPermukaan;

    public CincinBola(double jariJari, double jariJariDalam) {
        super(jariJari);
        this.jariJariDalam = jariJariDalam;
    }

    @Override
    public double hitungVolume() {
        double volumeLuar = super.hitungVolume(); 
        double volumeDalam = super.hitungVolume(jariJariDalam);
        volume = volumeLuar - volumeDalam;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasLuar = super.hitungLuasPermukaan();
        double luasDalam = 4 * Math.PI * Math.pow(jariJariDalam, 2);
        luasPermukaan = luasLuar + luasDalam;
        return luasPermukaan;
    }
    
    public double hitungVolume(double jariJariBaru, double jariJariDalamBaru) {
        double volumeLuar = super.hitungVolume(jariJariBaru);
        double volumeDalam = super.hitungVolume(jariJariDalamBaru);
        volume = volumeLuar - volumeDalam;
        return volume;
    }

    public double hitungLuasPermukaan(double jariJariBaru, double jariJariDalamBaru) {
        double luasLuar = 4 * Math.PI * Math.pow(jariJariBaru, 2);
        double luasDalam = 4 * Math.PI * Math.pow(jariJariDalamBaru, 2);
        luasPermukaan = luasLuar + luasDalam;
        return luasPermukaan;
    }

    @Override
    public String getNama(){
        nama = "Cincin Bola";
        return nama;
    }
}
