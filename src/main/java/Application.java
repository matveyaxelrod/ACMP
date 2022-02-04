import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    static long yearInMillis = 365 * 24 * 60 * 60 * 1000;
    static long dayInMillis = 24 * 60 * 60 * 1000;

    public static void main(String[] args) throws IOException {
        long time = System.currentTimeMillis(); // Количество миллисекунд с 00:00:00 01.01.1970 c GMT +0;
        // 17:16
        // 04.02.2022
        // Время считается по времени в Лондоне.
        // Поэтому добавляем 6 часов ко времени, чтобы получить наше время.
        int timezone = 6;
        long millis = time % 1000;
        long seconds = time / 1000 % 60;
        long minutes = time / 1000 / 60 % 60;
        long hours = time / 1000 / 60 / 60 % 24;

        long years = time / dayInMillis / 365;

        System.out.println(years);
        long highyears = years / 4;
        long simpleyears = years - highyears;
        long simpledays = simpleyears * 365;
        long highdays = highyears * 366;
        long dateyear = 1970 + years;

        System.out.println(hours + " : " + minutes);

//        long year = time / yearInMillis

        boolean isHighYear = dateyear % 4 == 0;

        System.out.println("\n\n" + highdays + "\n\n");

        long months = (time / dayInMillis - highdays) / 365 % 12;
        long day = (time / dayInMillis - highyears) % 365 - dayInMonth(months, isHighYear);

        System.out.println(day + "." + months + "." + dateyear);

    }

    static int dayInMonth(long month, boolean isHighYear) {
        if (month == 1) {
            return 31;
        }
        if (month == 2) {
            if (isHighYear) {
                return 29;
            } else {
                return 28;
            }
        }
        if (month == 3) {
            return 30;
        }
        if (month == 4) {
            return 31;
        }
        if (month == 5) {
            return 30;
        }
        if (month == 6) {
            return 31;
        }
        if (month == 7) {
            return 30;
        }
        if (month == 8) {
            return 31;
        }
        if (month == 9) {
            return 30;
        }
        if (month == 10) {
            return 31;
        }
        if (month == 11) {
            return 30;
        }
        if (month == 12) {
            return 31;
        }
        return 0;
    }

/*

4) // (Сделать через for)
* * *
* *
*
///
*/
}

