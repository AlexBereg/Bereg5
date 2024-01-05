package course_2.course_24;

public class Validator {
    public static final String REG = "^[a-zA-Z0-9_]{1,20}";

    public static void checkingParameters(String login, String password, String confirmPassword) {

        if (login.length() <= 20) {
            if (!login.matches(REG)) {
                throw new WrongLoginException("B логине есть недопустимые символы!!");
            }
        } else throw new WrongLoginException("Длина логина превышена!!");

        if (!login.matches(REG)){
            throw new WrongLoginException("B логине есть недопустимые символы!!");
        }


        if (password.length() <= 20) {
            if (!password.matches(REG)) {
                throw new WrongPasswordException("В пароле есть недопустимые символы!!");
            }
        } else throw new WrongPasswordException("Длина пароля превышена!!");

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
}

