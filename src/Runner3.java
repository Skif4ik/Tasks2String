import java.util.Arrays;

public class Runner3 {
    public static void main(String[] args) {
        //Задание 3
        //- Дана строка: « Привет. Как дела? »
        //- Очистить в строке пробелы вначале и в конце.
        //- Разбить строку по пробелам на массив.
        //- Вывести массив.

        String str1 = " Привет. Как дела? ";
        System.out.println("дана строка");
        System.out.println(str1);

        //1
        str1 = str1.trim();
        System.out.println("строка без пробелов вначале и в конце");
        System.out.println(str1);

        //2-3
        System.out.println("Массив из строки");
        String[] str2 = str1.split(" ");
        System.out.println(Arrays.toString(str2));
    }
}
