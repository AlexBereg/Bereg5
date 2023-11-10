public class Book {
    private String nameBook;
    private Author author;
    int yar;

    public Book(String nameBook, Author author, int yar) {
        this.nameBook = nameBook;
        this.author = author;
        this.yar = yar;
    }

    public void setYar(int yar) {
        this.yar = yar;
    }
}
