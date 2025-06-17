
package testsolopbo1;

import bangunGeometri.*;

public class MainIndex {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        persegi.hitungLuas();
        System.out.println("Persegi:");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());
        
        PrismaPersegi prisma = new PrismaPersegi(4, 10);
        System.out.println("Prisma Persegi - Volume: " + prisma.hitungVolume() + ", Luas Permukaan: " + prisma.hitungLuasPermukaan());

        Tabung tabung = new Tabung(3, 7);
        System.out.println("Tabung - Volume: " + tabung.hitungVolume() + ", Luas Permukaan: " + tabung.hitungLuasPermukaan());

        KerucutTerpancung kt = new KerucutTerpancung(5, 3, 6);
        System.out.println("Kerucut Terpancung - Volume: " + kt.hitungVolume() + ", Luas Permukaan: " + kt.hitungLuasPermukaan());
        
        BelahKetupat bk = new BelahKetupat(6, 8);
        System.out.println("Luas Belah Ketupat: " + bk.hitungLuas());
        System.out.println("Keliling Belah Ketupat: " + bk.hitungKeliling());

        JajarGenjang jjg = new JajarGenjang(5, 7, 6);
        System.out.println("Luas Jajar Genjang: " + jjg.hitungLuas());
        System.out.println("Keliling Jajar Genjang: " + jjg.hitungKeliling());

        JuringLingkaran jl = new JuringLingkaran(10, 90);
        System.out.println("Luas Juring Lingkaran: " + jl.hitungLuas());
        System.out.println("Keliling Juring Lingkaran: " + jl.hitungKeliling());

        LayangLayang ll = new LayangLayang(8, 6, 5, 7);
        System.out.println("Luas Layang-Layang: " + ll.hitungLuas());
        System.out.println("Keliling Layang-Layang: " + ll.hitungKeliling());

        Lingkaran l = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + l.hitungLuas());
        System.out.println("Keliling Lingkaran: " + l.hitungKeliling());

        TemberengLingkaran tl = new TemberengLingkaran(10, 60);
        System.out.println("Luas Tembereng Lingkaran: " + tl.hitungLuas());
        System.out.println("Keliling Tembereng Lingkaran: " + tl.hitungKeliling());

        JuringBola jb = new JuringBola(10, 90);
        System.out.println("Volume Juring Bola: " + jb.hitungVolume());
        System.out.println("Luas Permukaan Juring Bola: " + jb.hitungLuasPermukaan());

        Kerucut kr = new Kerucut(7, 12);
        System.out.println("Volume Kerucut: " + kr.hitungVolume());
        System.out.println("Luas Permukaan Kerucut: " + kr.hitungLuasPermukaan());

        LimasBelahKetupat lbk = new LimasBelahKetupat(6, 8, 10);
        System.out.println("Volume Limas Belah Ketupat: " + lbk.hitungVolume());
        System.out.println("Luas Permukaan Limas Belah Ketupat: " + lbk.hitungLuasPermukaan());

        LimasLayangLayang lll = new LimasLayangLayang(8, 6, 10, 6 , 8);
        System.out.println("Volume Limas Layang-Layang: " + lll.hitungVolume());
        System.out.println("Luas Permukaan Limas Layang-Layang: " + lll.hitungLuasPermukaan());

        PrismaJajarGenjang pjjg = new PrismaJajarGenjang(5, 7, 6, 10);
        System.out.println("Volume Prisma Jajar Genjang: " + pjjg.hitungVolume());
        System.out.println("Luas Permukaan Prisma Jajar Genjang: " + pjjg.hitungLuasPermukaan());

        TemberengBola tb = new TemberengBola(10, 60);
        System.out.println("Volume Tembereng Bola: " + tb.hitungVolume());
        System.out.println("Luas Permukaan Tembereng Bola: " + tb.hitungLuasPermukaan());
        
        Segitiga sg2 = new Segitiga(10,13);
        System.out.println("Luas adalah " + sg2.hitungLuas());
        System.out.println("Keliling adalah " + sg2.hitungKeliling());
        System.out.println(sg2.getNama());
        
        System.out.println("\n\n COBA LIMAS SEGITIGA");
        Persegi k99 = new Persegi(6);
        System.out.println("Volume adalah = " + k99.hitungLuas());
        
        System.out.println("\n\n MULTITHREAD \n\n");
        
        KalkulasiBangunThread threadLimas = new KalkulasiBangunThread("Thread-Limas-1", lbk);
        threadLimas.start();

        KalkulasiBangunThread threadBola = new KalkulasiBangunThread("Thread-Bola-1", bk);
        threadBola.start();
        
        KalkulasiBangunThread threadSegitiga = new KalkulasiBangunThread("Thread-Segitiga-1", sg2);
        threadSegitiga.start();
    }
}
