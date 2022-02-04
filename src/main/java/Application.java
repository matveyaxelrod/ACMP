import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static int main(String[] args) throws IOException {
        // Открытие файла ввода и вывода
        String filePath = "INPUT.TXT";
        File inputFile = new File(filePath);
        FileWriter output = new FileWriter("OUTPUT.TXT");
        Scanner input = new Scanner(inputFile);

        // Начало решения
        Integer a = input.nextInt();
        Integer b = input.nextInt();
<<<<<<< HEAD


=======
        Integer c = input.nextInt();
        int площадь;() {
            return 2 * a * b * c;
        }
        output.write(a.toString());
>>>>>>> parent of 6c94beb (0195)
        //// Конец решения

        // Закрытие выходного файла
        output.close();
    }
<<<<<<< HEAD

    static Integer garry(Integer a) {
        return 10 - a;
    }

    static Integer larry(Integer b) {
        return 10 - b;
    }

=======
>>>>>>> parent of 6c94beb (0195)
}

