import java.util.Arrays;

public class Runner5 {
    public static void main(String[] args) {

        //Задание 5
        //- Дана строка со словами, разделенными одним пробелом.
        //- Строку разбить на массив слов
        //- Определить количество палиндромов
        //- Вывести отдельно все палиндромы и количество символов в них
        //- Найти самый длинный палиндром

        String str1 = "Казак зашел в кабак и достал наган";
        System.out.println("Исходная строка: " + str1);

        System.out.println("=============================");
        String[] str2 = str1.split(" ");
        System.out.println("Массив слов");
        System.out.println(Arrays.toString(str2));
    }
}
