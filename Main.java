public class Main {
    public static void main(String[] args) {
       Karyawan Ridho = new Karyawan("Ridho", "12345");

       Ridho.getinfo();
       Ridho.absenPagi();
       Ridho.kerja();
       Ridho.absenPulang();

       Karyawan Melan = new Karyawan("Melan", "12346");

       Melan.getinfo();
       Melan.absenPagi();
       Melan.kerja();
       Melan.absenPulang();

       Dosen Andiani = new Dosen("23455", "Andiani", "332211");
       
       Andiani.getinfo();
       Andiani.absenPagi();
       Andiani.ngajar();
       Andiani.absenPulang();
       
       Dosen Ionia = new Dosen("23456", "Ionia", "332212");

       Ionia.getinfo();
       Ionia.absenPagi();
       Ionia.ngajar();
       Ionia.absenPulang();


    }
}