public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalbooks = 3;
    public Book(String title, String author,String isbn ) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalbooks++;
    }
    public static void displaytotalbooks() {
        System.out.println("Total books: " + totalbooks);
    }

    public static void main(String[] args) {
        Book.displaytotalbooks();
    }
}