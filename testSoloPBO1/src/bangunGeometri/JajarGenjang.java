
package bangunGeometri;

public class JajarGenjang extends AbstrakBangunGeometri {
    public double alas,tinggi,sisiMiring,keliling,luas;

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double hitungLuas() {
        luas = alas * tinggi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (alas + sisiMiring);
        return keliling;
    }
    
    public double hitungLuas(double alasBaru, double tinggiBaru) {
        luas = alasBaru * tinggiBaru;
        return luas;
    }
    
    public double hitungKeliling(double alasBaru,double sisiMiringBaru) {
        keliling = 2 * (alasBaru + sisiMiringBaru);
        return keliling;
    }

    @Override
    public String getNama() {
        nama = "Jajar Genjang";
        return nama;
    }
}
