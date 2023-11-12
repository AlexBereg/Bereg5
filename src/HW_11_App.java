public class HW_11_App {
    public static void main(String[] args) {
        Author aut1 = new Author("Лев", "Толстой");
        Author aut2 = new Author("Евгений", "Водолазкин");
        Book book1 = new Book("Три медведя", aut1, 2023);
        Book book2 = new Book("Авиатор", aut1, 2020);
        System.out.println(book1.getYar());

book1.setYar(2022);
//book1.yar = 2020;   // про модификатор понял)
        System.out.println(book1.getYar());
    }
}

