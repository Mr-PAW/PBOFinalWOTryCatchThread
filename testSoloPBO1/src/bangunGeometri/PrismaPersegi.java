
package bangunGeometri;

public class PrismaPersegi extends Persegi {
    private double tinggiPrisma,volume,luasPermukaan;

    public PrismaPersegi(double sisi,double tinggiPrisma) {
        super(sisi);
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
        luasPermukaan = (2 * luasAlas) + luasSelimut;
        return luasPermukaan;
    }
    
     public double hitungVolume(double sisiBaru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(sisiBaru);
        volume = luasAlas * tinggiPrismaBaru;
        return volume;
    }

    public double hitungLuasPermukaan(double sisiBaru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(sisiBaru);
        double luasSelimut = super.hitungKeliling(sisiBaru) * tinggiPrismaBaru;
        luasPermukaan = (2 * luasAlas) + luasSelimut;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Prisma Persegi";
        return nama ;
    }
}
