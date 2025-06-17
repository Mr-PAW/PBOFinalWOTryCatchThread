package bangunGeometri;

// Kelas ini adalah "tugas" yang bisa dijalankan oleh sebuah thread.
// Ia mengimplementasikan interface Runnable, yang berarti ia punya method run().
public class KalkulasiBangunThread implements Runnable {
    private Thread t;
    private String namaThread;
    private BangunGeometri bangun; // Bisa menampung Segitiga, Bola, Limas, dll.

    // Constructor untuk menerima objek bangun geometri dan nama thread
    public KalkulasiBangunThread(String nama, BangunGeometri bangun) {
        this.namaThread = nama;
        this.bangun = bangun;
        System.out.println("Menciptakan thread: " + namaThread);
    }

    // Ini adalah method utama yang akan dieksekusi ketika thread dimulai
    @Override
    public void run() {
        System.out.println("Menjalankan thread: " + namaThread);
        try {
            // Gunakan 'instanceof' untuk mengecek tipe objek asli
            if (bangun instanceof Bola) {
                Bola bola = (Bola) bangun;
                System.out.println("--> Hasil " + namaThread + ": Volume Bola = " + bola.hitungVolume());
                System.out.println("--> Hasil " + namaThread + ": Luas Permukaan Bola = " + bola.hitungLuasPermukaan());
            } else if (bangun instanceof LimasSegitiga) {
                LimasSegitiga limas = (LimasSegitiga) bangun;
                System.out.println("--> Hasil " + namaThread + ": Volume Limas = " + limas.hitungVolume());
                System.out.println("--> Hasil " + namaThread + ": Luas Permukaan Limas = " + limas.hitungLuasPermukaan());
            } else if (bangun instanceof Lingkaran) {
                System.out.println("--> Hasil " + namaThread + ": Luas Lingkaran = " + bangun.hitungLuas());
                System.out.println("--> Hasil " + namaThread + ": Keliling Lingkaran = " + bangun.hitungKeliling());
            } else if (bangun instanceof Segitiga) {
                System.out.println("--> Hasil " + namaThread + ": Luas Segitiga = " + bangun.hitungLuas());
                System.out.println("--> Hasil " + namaThread + ": Keliling Segitiga = " + bangun.hitungKeliling());
            }
            
            // Memberi jeda sejenak untuk simulasi proses yang panjang
            Thread.sleep(50); 
            
        } catch (InterruptedException e) {
            System.out.println("Thread " + namaThread + " terinterupsi.");
        }
        System.out.println("Thread " + namaThread + " selesai.");
    }

    // Method untuk memulai eksekusi thread
    public void start() {
        System.out.println("Memulai thread: " + namaThread);
        if (t == null) {
            t = new Thread(this, namaThread);
            t.start(); // Ini yang akan memanggil method run() secara internal
        }
    }
}