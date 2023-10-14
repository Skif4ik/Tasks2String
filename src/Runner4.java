import java.util.Arrays;
import java.util.Locale;

public class Runner4 {
    public static void main(String[] args) {
        //Задание 4
        //- Разбить строку на массив по пробелам: «Василий съел мороженое и
        //поправился на 20 грамм».
        //- Вывести общее количество символов в строке
        //- Элементы массива на нечетных местах привести в верхнему регистру.

        String str1 = "Василий съел мороженое и поправился на 20 грамм";
        System.out.println("Строка: " + str1);
        System.out.println("Исходное количество символов: " +str1.length());
        System.out.println("=====================");

        String[] str2 = str1.split(" ");
        System.out.println("Массив из строки");
        System.out.println(Arrays.toString(str2));

        System.out.println("=====================");

        for (int i =0; i< str2.length; i++) {
            if(i % 2 != 0){
                str2[i] = str2[i].toUpperCase();
            }
        }
        System.out.println("Измененный массив");
        System.out.println(Arrays.toString(str2));
    }
}
