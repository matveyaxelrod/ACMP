import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Java\\ACMP\\src\\main\\resources\\INPUT.TXT";
        String filePathAcmp = "INPUT.TXT";

        // Тестирование локально
//        File inputFile = new File(filePath);

        // Отправка в ACMP
        File inputFile = new File(filePathAcmp);

        Scanner scanner = new Scanner(inputFile);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a + b;

        FileWriter outputFile = new FileWriter("OUTPUT.TXT");
        outputFile.write(Integer.toString(result));
        outputFile.write("\n");
        outputFile.close();
    }
}
