package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Проверка завершена: " + active);
        System.out.println("Ошибок: " + status);
        System.out.println("Нажмите " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(false, 4, "Начать заново");
        Error error2 = new Error(true, 1, "Продолжить");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
    }
}
