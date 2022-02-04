import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        // Открытие файла ввода и вывода
        String filePath = "INPUT.TXT";
        File inputFile = new File(filePath);
        FileWriter output = new FileWriter("OUTPUT.TXT");
        Scanner input = new Scanner(inputFile);

        // Начало решения
        Integer a = input.nextInt();
        Integer b = input.nextInt();


        //// Конец решения

        // Закрытие выходного файла
        output.close();
    }

    static Integer garry(Integer a) {
        return 10 - a;
    }

    static Integer larry(Integer b) {
        return 10 - b;
    }

}

