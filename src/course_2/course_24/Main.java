package course_2.course_24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите login:");
        String login = sc.nextLine();

        System.out.println("Введите password:");
        String password = sc.nextLine();

        System.out.println("Введите confirmPassword:");
        String confirmPassword = sc.nextLine();

        try {
            Validator.checkingParameters(login, password, confirmPassword);
            System.out.println("Все ок!");

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
