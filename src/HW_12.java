public class HW_12 {
    public static void main(String[] args) {
        Author aut1 = new Author("Лев", "Толстой");
        Author aut2 = new Author("Евгений", "Водолазкин");
        Book book1 = new Book("Три медведя", aut1, 2023);
        Book book2 = new Book("Авиатор", aut1, 2020);
        System.out.println(book1.getYar());

        book1.setYar(2022);
        System.out.println(book1.getYar());
        System.out.println();

        Author aut3 = new Author("Лев", "Толстой");
        Book book3 = new Book("Кавказский пленник", aut3, 1974);

        System.out.println("Сравним авторов aut1 =" + aut1 + " и aut3 =" + aut3);
        System.out.println(aut1.hashCode());
        System.out.println(aut3.hashCode());
        System.out.println(aut3.equals(aut1));
        System.out.println();

        System.out.println(book3.toString());

        Book book4 = new Book("Три медведя", aut1, 2000);
        if (book4.equals(book1)) {
            System.out.println("book1 и book4 - одинаковые книги");
        } else
        System.out.println("book1 и book4 - разные книги");

    }
}
