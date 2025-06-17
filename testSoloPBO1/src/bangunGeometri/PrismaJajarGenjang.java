
package bangunGeometri;

public class PrismaJajarGenjang extends JajarGenjang {
    private double tinggiPrisma,volume,luasPermukaan;

    public PrismaJajarGenjang(double alas, double tinggi, double sisiMiring, double tinggiPrisma) {
        super(alas, tinggi, sisiMiring);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume =  luasAlas * tinggiPrisma;
        return volume;
    }
    

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double luasSelimut = super.hitungKeliling() * tinggiPrisma;
        luasPermukaan = 2 * luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    public double hitungVolume(double alasBaru, double tinggiBaru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(alasBaru, tinggiBaru);
        volume =  luasAlas * tinggiPrismaBaru;
        return volume;
    }
    
    public double hitungLuasPermukaan(double alasBaru, double tinggiBaru, double sisiMiringBaru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(alasBaru, tinggiBaru);
        double luasSelimut = super.hitungKeliling(alasBaru, sisiMiringBaru) * tinggiPrismaBaru;
        luasPermukaan = 2 * luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Prisma Jajar Genjang";
        return nama ;
    }
}
