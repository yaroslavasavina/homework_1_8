import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int year = 2000;
        printIsLeapYear(year);
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        selectClientOS(clientOS, currentYear);
        int deliveryDistance = 95;
        printDeliveryDistance(deliveryDistance);
    }

    public static void printIsLeapYear(int year) {
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void selectClientOS(int clientOS, int currentYear) {
        if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && currentYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && currentYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("К сожалению, Ваше устройство не поддерживает данное приложение.");
        }
    }

    public static int printDeliveryDistance(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день, чтобы доставить Вашу карту.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня, чтобы доставить Вашу карту.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня, чтобы доставить Вашу карту.");
        } else {
            System.out.println("Доставка не осуществляется.");
        }
        return deliveryDistance;
    }
}