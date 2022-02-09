public class Application {
//   static boolean всёВерно = true;
//   static boolean всёЛожно = false;

//   static char скобкикончились = '*';

//   static String скобки = "(((()()()())))";

//   static int максимальнаяГлубинаСтека = 100;

//   static int вершинаСтека = 0;
//   static int дноСтека = 0;

//   static char[] стек = new char[максимальнаяГлубинаСтека];

//   static void добавитьВСтек(char x) {
//       стек[вершинаСтека] = x;
//       вершинаСтека++;
//   }

//   static char взятьСверху() {
//       if (вершинаСтека == 0 || дноСтека == вершинаСтека) {
//           return скобкикончились;
//       }
//       вершинаСтека = вершинаСтека - 1;
//       return стек[вершинаСтека];
//   }

//   static char взятьСнизу() {
//       if (дноСтека == вершинаСтека) {
//           return скобкикончились;
//       }

//       char элемент = стек[дноСтека];
//       дноСтека = дноСтека++;
//       return элемент;
//   }
    static boolean всёВерно = true;
    static boolean всёЛожно = false;

    static char стекзакончился = '*';

    static int глубинастека = 100;
    static String массив = ")(";

    static int вершинастека = 0;
    static int дноСтэкеа = 0;

    static char[] стек = new char[глубинастека];

    static void добавитьВСтек(char x) {
        стек[вершинастека] = x;
        вершинастека = вершинастека++;
    }

    static char взятьСверху() {
        if (вершинастека == 0 || дноСтэкеа == вершинастека) {
            return стекзакончился;
        }

        вершинастека = вершинастека - 1;
        return стек[вершинастека];
    }

    static char взятьСнизу() {
        if (дноСтэкеа == вершинастека) {
            return стекзакончился;
        }

        char элемент = стек[дноСтэкеа];
        дноСтэкеа = дноСтэкеа + 1;
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
        if (стек.length() % 2 != 0) {
            return всёЛожно;
        }

        for (int i = 0; i < стек.length(); i++) {
            добавитьВСтек(стек.(i)); // скобки[i]
        }

        int закрывающиеСкобки = 0;
        char текущаяПоследняяСкобка;

        while ((текущаяПоследняяСкобка = взятьСверху()) != стекзакончился) {
            if (текущаяПоследняяСкобка == ')') {
                закрывающиеСкобки = закрывающиеСкобки + 1;
            }
            if (текущаяПоследняяСкобка == '(') {
                if (закрывающиеСкобки > 0) {
                    закрывающиеСкобки = закрывающиеСкобки - 1;
                } else {
                    return всёЛожно;
                }
            }
        }

        if (закрывающиеСкобки != 0) {
            return всёЛожно;
        } else {
            return всёВерно;
        }
    }
}












