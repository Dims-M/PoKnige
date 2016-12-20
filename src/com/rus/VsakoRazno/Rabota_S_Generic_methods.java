package com.rus.VsakoRazno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 019 19.12.16.
 */
public class Rabota_S_Generic_methods {


    public static void main(String[] args) {

        //масссив для экпериментов
        Integer [] iArray = {1,2,3,4,5,6,7,8,9,10};
        String  [] iString = {"Эйвентура ","Стенли ","Брюс "," Карл"," Хрен с горы"," Пес смердячий",};
        Character [] iChar = {'П','Р','И','В','Т','!'};

        List<Integer> chislo = Arrays.asList(iArray);

        // Вывод содержиния массива на консоль
        printArrays(iArray);
        printArrays(iString);
        printArrays(iChar);

        printMe(iArray);
        printMe(iString);
       // printMe(chislo);

        razdelitel();
        System.out.printf("Минимальное число из введеных параметров " + min (10,5,50 ));
        razdelitel();
        System.out.printf("Vfrcbvfkmyjt число из введеных параметров " + max (10,5,50));

        razdelitel();
        System.out.printf("Минимальное число из введеных параметров " + min ("што","b", "a"));
        System.out.printf("Минимальное число из введеных параметров " + max ("што","а", "a"));


    }// конец метода майн


    // Общие методы Generic
// Параметр <T> Указываем как бы свой(или любой) тип аргументов который попадет в метод. JAVA сама их обработает
    public static <T> void printMe (T[] znach){
        System.out.println("Метод Generic");
        System.out.println("Содержимое массива = ");

        for (T temp : znach){
          //  System.out.print(temp);
           // System.out.println();
            System.out.printf("%s-",temp);
        }
        System.out.println();
        razdelitel();

   //     System.out.printf("Минимальное число из введеных параметров " + min (10,5,50));

    }


    // перегруженные методы
    private static void printArrays(Character[] iChar) {
        System.out.println("СОдержимое массива = ");

        for (Character temp : iChar){
            System.out.print(temp);
        }
        System.out.println();
        razdelitel();
    }

    String infaO_Classe = "Общие методы или Generic methods - Это методы Очень похожи на перегруженные метоы. " +
            "Используеттся тогда когда вы не хотите заботится о типах данных передоваемых в этот метод";

    public static void  printArrays(Integer [] arr){
        System.out.println("СОдержимое массива = ");

        for (Integer temp : arr){
            System.out.print(temp);
        }
        System.out.println();
        razdelitel();
    }

    public static void  printArrays(String [] arr){
        System.out.println("СОдержимое массива = ");

        for (String temp : arr){
            System.out.print(temp);
        }
        System.out.println();
        razdelitel();
    }

    private static void razdelitel (){
        System.out.println();
        System.out.println("*************");
    }

    //Задача поиск в дженерике минимальное значение из 3 заданых параметров

    // создали метод с параметром <T extends Comparable <T>>. возращать этот метод будет также тип Т
    public static <T extends Comparable <T>> T min(T a, T b, T c){
        // Создали переменную м типа Т и присвоили туда первый параметр для сравнения

        T m = a;
        // Условие проверки

        // Если  переменная b меньше а (если да то вернет -1, если равны то вернет 0 или если больше то вернет 1)
        if ( b.compareTo(a) < 0 ){
            m = b;
        }

        if (c.compareTo(m) < 0 ){
            m = c;
        }
        return  m;
    }

    public static <T extends Comparable <T>> T max(T a, T b, T c){
        // Создали переменную м типа Т и присвоили туда первый параметр для сравнения

        T m = a;
        // Условие проверки

        // Если  переменная b меньше а (если да то вернет -1, если равны то вернет 0 или если больше то вернет 1)
        if ( b.compareTo(a) > 0 ){
            m = b;
        }

        if (c.compareTo(m) > 0 ){
            m = c;
        }
        return  m;
    }


} // Конец класса
