
package bangunGeometri;

public class Segitiga extends AbstrakBangunGeometri {
    public double alas, tinggi, luas, keliling;

    public Segitiga(double alas, double tinggi) {
        if (alas <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Nilai sisi tidak boleh nol atau negatif!");
        }
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        luas = (alas * tinggi) / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt((tinggi *tinggi) - ((alas/2) * (alas/2)));
        keliling = sisiMiring + sisiMiring + alas ;
        return keliling;  
    }
    
    public double hitungLuas(double alasBaru, double tinggiBaru) {
        luas = (alasBaru * tinggiBaru) / 2;
        return luas;
    }
    
    public double hitungKeliling(double alasBaru, double tinggiBaru) {
        double sisiMiring = Math.sqrt((tinggiBaru *tinggiBaru) - ((alasBaru/2) * (alasBaru/2)));
        keliling = sisiMiring + sisiMiring + alasBaru ;
        return keliling;  
    }

    @Override
    public String getNama() {
        nama = "Segitiga";
        return nama;
    }
}


