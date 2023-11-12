public class Book {
    private String nameBook;
    private Author author;
    private int yar;

    public Book(String nameBook, Author author, int yar) {
        this.nameBook = nameBook;
        this.author = author;
        this.yar = yar;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYar() {
        return yar;
    }

    public void setYar(int yar) {
        this.yar = yar;
    }
}
