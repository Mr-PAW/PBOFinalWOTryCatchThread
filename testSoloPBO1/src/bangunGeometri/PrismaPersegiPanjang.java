
package bangunGeometri;

public class PrismaPersegiPanjang extends PersegiPanjang {
    private double tinggiPrisma,volume,luasPermukaan;


    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiPrisma) {
        super(panjang, lebar);
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
    
     public double hitungVolume(double panjangBaru, double lebarBaru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(panjangBaru, lebarBaru);
        volume = luasAlas * tinggiPrismaBaru;
        return volume;
    }

    public double hitungLuasPermukaan(double panjangBaru, double lebarBaru, double tinggiPrismaBaru) {
        double luasAlas = super.hitungLuas(panjangBaru, lebarBaru);
        double luasSelimut = super.hitungKeliling(panjangBaru, lebarBaru) * tinggiPrismaBaru;
        luasPermukaan = 2 * luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        nama = "Prisma Persegi Panjang";
        return nama ;
    }
}

