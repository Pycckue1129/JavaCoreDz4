package org.example.hw_1;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "login";
        String password = "password";
        String confirmPassword = "password";

        try {
            boolean flag = checkLoginPassword(login,password,confirmPassword);
            if (flag){
                System.out.println("Данные верны.");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка " + e.getMessage());
        }

    }

    public static boolean checkLoginPassword(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException {
        if(login.length() >= 20){
            throw new WrongLoginException("Длина логина должна быть меньше 20 символов.");
        }

        if(password.length() >= 20 && !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов и пароли должны совпадать.");
        }

        if(password.length() >= 20){
            throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать.");
        }
        return true;
    }
}
