public class Karyawan {
    protected  String nama;
    protected  String kodeKaryawan;

    public Karyawan(String nama, String kodeKaryawan) {
           
        this.kodeKaryawan = kodeKaryawan;
        this.nama = nama;
    }
    
    public void absenPagi() {
        System.out.println(this.nama + ":absenPagi");
    }
    public void kerja() {
        System.out.println(this.nama + ":sedang bekerja");
    }
    public void absenPulang() {
        System.out.println(this.nama + ":absenPulang");
    }
    public void getinfo() {
        System.out.println("Kode Karyawab: " + this.kodeKaryawan);
        System.out.println("Nama : " + this.nama);
    }
}
