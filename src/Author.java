import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String famAuthor;

    public Author(String nameAuthor, String famAuthor) {
        this.nameAuthor = nameAuthor;
        this.famAuthor = famAuthor;
    }
    public String getNameAuthor() {
        return nameAuthor;
    }
    public String getFamAuthor() {
        return famAuthor;
    }

    @Override
    public String toString() {
        return nameAuthor + " " + famAuthor ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(famAuthor, author.famAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, famAuthor);
    }
}
