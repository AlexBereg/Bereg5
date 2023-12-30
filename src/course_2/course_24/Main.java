package course_2.course_24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String REG = "^[a-zA-Z0-9_]*$";

    public static void CheckingParameters(String login, String password, String confirmPassword) {
        if (login.length() <= 20) {
            if (!login.matches(REG)) {
                throw new WrongLoginException("B логине есть недопустимые символы!!");
            }
        } else throw new WrongLoginException("Длина логина превышена!!");

        if (password.length() <= 20) {
            if (!password.matches(REG)) {
                throw new WrongPasswordException("В пароле есть недопустимые символы!!");
            }
        } else throw new WrongPasswordException("Длина пароля превышена!!");

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите login:");
        String login = sc.nextLine();

        System.out.println("Введите password:");
        String password = sc.nextLine();

        System.out.println("Введите confirmPassword:");
        String confirmPassword = sc.nextLine();

        try {
            CheckingParameters(login, password, confirmPassword);
            System.out.println("Все ок!");

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
