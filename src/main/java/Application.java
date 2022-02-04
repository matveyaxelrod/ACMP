import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
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
        long days = time / 1000 / 60 / 60 / 24;


        System.out.println(hours + " : " + minutes);
        System.out.println();
    }

/*

4) // (Сделать через for)
* * *
* *
*
///
*/
}

