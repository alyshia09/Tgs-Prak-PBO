public class Library {
    static {
        System.out.println("Library system initialized.");
    }
    public static String convertToUpperCase(String str){
        System.out.println("HELLOO");
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Library.convertToUpperCase("HELLO");
    }
}
