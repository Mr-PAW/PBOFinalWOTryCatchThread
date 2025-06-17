
package bangunGeometri;

public class PrismaLayangLayang extends LayangLayang {
    private double tinggiPrisma,volume,luasPermukaan;

    public PrismaLayangLayang(double d1, double d2, double miring1, double miring2, double tinggiPrisma) {
        super(d1,d2,miring1,miring2);
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
    
     public double hitungVolume(double d1Baru, double d2Baru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(d1Baru,d2Baru);
        volume = luasAlas * tinggiPrismaBaru;
        return volume;
    }

    public double hitungLuasPermukaan(double d1Baru, double d2Baru, double miring1Baru, double miring2Baru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(d1Baru,d2Baru);
        double luasSelimut = super.hitungKeliling(miring1Baru,miring2Baru) * tinggiPrismaBaru;
        luasPermukaan = 2 * luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Prisma Layang Layang";
        return nama ;
    }
}
