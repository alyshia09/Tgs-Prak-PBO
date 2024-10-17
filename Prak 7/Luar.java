public class Luar {
    String namaLuar = "Luar";

    public class Dalam {
        String namaDalam = "Dalam";

        public void bicara() {
            System.out.println("variabelLuar");
            System.out.println("variabelDalam");
            System.out.println(" ");
        }
    }


public static void main(String[] args) {
    Luar luar = new Luar();
    Dalam dalam = luar.new Dalam();

    dalam.bicara();
}
}
