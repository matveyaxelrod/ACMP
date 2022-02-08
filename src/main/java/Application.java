import java.io.IOException;

public class Application {
    static int размер = 3;
    static int[][] матрица = new int[размер][размер];

    public static void main(String[] args) {
        заполняемМатрицу();
        выводимСодержимоеМатрицы();
    }

    static void заполняемМатрицу() {
        for (int строка = 0; строка < размер; строка++) {

            for (int столбец = 0; столбец < размер; столбец++) {
                матрица[строка][столбец] = строка * столбец;
            }
        }
    }

    static void выводимСодержимоеМатрицы() {
        for (int строка = 0; строка < размер; строка++) {
            System.out.println();
            for (int столбец = 0; столбец < размер; столбец++) {
                System.out.println(матрица[строка][столбец]);
            }
        }
    }
}
