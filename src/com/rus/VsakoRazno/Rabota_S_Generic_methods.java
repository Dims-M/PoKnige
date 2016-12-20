package com.rus.VsakoRazno;

/**
 * Created by User on 019 19.12.16.
 */
public class Rabota_S_Generic_methods {


    public static void main(String[] args) {

        //масссив для экпериментов
        Integer [] iArray = {1,2,3,4,5,6,7,8,9,10};
        String  [] iString = {"Эйвентура ","Стенли ","Брюс "," Карл"," Хрен с горы"," Пес смердячий",};

        // Вывод содержиния массива на консоль
        printArrays(iArray);
        printArrays(iString);



    }// конец метода майн

    String infaO_Classe = "Общие методы или Generic methods - Это методы Очень похожи на перегруженные метоы. " +
            "Используеттся тогда когда вы не хотите заботится о типах данных передоваемых в этот метод";

    public static void  printArrays(Integer [] arr){
        System.out.println("СОдержимое массива = ");

        for (Integer temp : arr){
            System.out.print(temp);
        }
        System.out.println();
    }

    public static void  printArrays(String [] arr){
        System.out.println("СОдержимое массива = ");

        for (String temp : arr){
            System.out.print(temp);
        }
        System.out.println();
    }


} // Конец класса
