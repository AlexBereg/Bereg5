import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + author +
                ", yar=" + yar +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yar == book.yar && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yar);
    }
}
