
package bangunGeometri;

public abstract class AbstrakBangunGeometri implements BangunGeometri{
    public String nama;
    
    @Override
    public abstract double hitungLuas();
    
    @Override
    public abstract double hitungKeliling();
    
    public String getNama(){
        return nama;
    }
}
