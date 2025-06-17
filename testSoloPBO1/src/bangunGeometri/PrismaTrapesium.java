
package bangunGeometri;

public class PrismaTrapesium extends Trapesium  {
    private double tinggiPrisma,volume,luasPermukaan;

    public PrismaTrapesium(double a, double b, double miring, double tinggiPrisma) {
        super(a,b,miring);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume() {
        double luasAlas = super.hitungLuas();
        volume = luasAlas * tinggiPrisma;
        return volume;
    }


    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double luasSelimut = super.hitungKeliling() * tinggiPrisma;
        luasPermukaan = 2 * luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
     public double hitungVolume(double aBaru, double bBaru, double miringBaru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(aBaru,bBaru,miringBaru);
        volume = luasAlas * tinggiPrismaBaru;
        return volume;
    }
     
    public double hitungLuasPermukaan(double aBaru, double bBaru, double miringBaru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(aBaru,bBaru,miringBaru);
        double luasSelimut = super.hitungKeliling(aBaru,bBaru,miringBaru) * tinggiPrismaBaru;
        luasPermukaan = 2 * luasAlas + luasSelimut;
        return luasPermukaan;
    }

    @Override
    public String getNama() {
        nama = "Prisma Trapesium";
        return nama ;
    }
}
