public class Application {
    static boolean всёВерно = true;
    static boolean всёЛожно = false;
    int открытаяскобка = 0;
    int закрытаяскобка = 0;

    static char скобкикончились = '*';

    static String скобки = ")(";

    static int максимальнаяГлубинаСтека = 100;

    static int вершинаСтека = 0;
    static int дноСтека = 0;

    static char[] стек = new char[максимальнаяГлубинаСтека];

    static void добавитьВСтек(char x) {
        стек[вершинаСтека] = x;
        вершинаСтека = вершинаСтека++;
    }

    static char взятьСверху() {
        if (вершинаСтека == 0 || дноСтека == вершинаСтека) {
            return скобкикончились;
        }
        вершинаСтека = вершинаСтека - 1;
        return стек[вершинаСтека];
    }

    static char взятьСнизу() {
        if (дноСтека == вершинаСтека) {
            return скобкикончились;
        }

        char элемент = стек[дноСтека];
        дноСтека = дноСтека++;
        return элемент;
    }


    public static void main(String[] args) {
        if (последовательностьПравильная()) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
        }
    }

    static boolean последовательностьПравильная() {
        if (скобки.length() % 2 != 0) {
            return всёЛожно;
        }
        return всёВерно;
    }

    



}













