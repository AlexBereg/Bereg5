public class HW_11_App {
    public static void main(String[] args) {
        Author aut1 = new Author("Лев", "Толстой");
        Author aut2 = new Author("Евгений", "Водолазкин");
        Book Book1 = new Book("Три медведя", aut1, 2023);
        Book Book2 = new Book("Авиатор", aut1, 2020);
        System.out.println(Book1.yar);
Book1.setYar(2022);
        System.out.println(Book1.yar);

    }
}

