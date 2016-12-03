package ru.Osnovi.RabotaSCollekciami;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 003 03.12.16.
 */

/**
 * Created by Администратор on 25.11.2016.
 */
public class RabotaS_Massivami {

    static int asd = 4 ;

    static int temp;

    public static String [] food = {" Привет ", " Пользователь ", " Наш" };

    public static String [] foode = {"Салат ", "акрошка ", "Лапша", "Пирог", "Чай ", "Выпей яду Адцки сaтана )))"};

    public static int [] massivInt = new int[asd];

    public String[] getFood() {
        return food;
    }

    public void setFood(String[] food) {
        this.food = food;
    }

    public static void vivodStringMassiva (String []str ){
        System.out.println("Вывод содержимого строкового массива!");

        for (String stroka : str){
            System.out.println(stroka);
        }
    }

    public static void vivodIntMassiva (int []str ){
        System.out.println("Вывод содержимого bynjdjuj массива!");

        for (int stroka : str){
            System.out.println(stroka);
        }
    }


    public static int[] menaemAdresa_v_Int (int a, int b, int [] objects){

        massivInt  = objects;

        for (int i = 0; i < massivInt.length;i++ ) {
            temp = massivInt[b];

            massivInt[b] = massivInt[a];
            massivInt[a] = temp;
            break;

        }

        System.out.println("Cработал обмен индексов*****");
        for (int j: massivInt )
            System.out.print(" " +j);

        return objects;
    }

    public static String[] menaemAdresa_v_Strinf (int a, int b, String [] objects){

        food = objects;

        for (int i = 0; i < food.length;i++ ){

            String  temp = food[b];

            food[b] = food[a];
            food[a] = temp;
            break;

        }
        System.out.println("Cработал обмен индексов*****");
        for (String strd: food )
            System.out.print(" " + strd );
        System.out.println(" ");
        return food;
    }


    public static int [] randomMassiva (int dlina){
        asd = dlina;
        System.out.println("Рандомное заполнение миссива");

        int [] znach = new int[dlina];

        Random random = new Random();

        for (int i  = 0; i < znach.length; i++ ){
            int temp =random.nextInt(1000);
            znach[i] = temp;
            massivInt[i] = temp;
        }
//
//        for (int chislo : znach){
//            System.out.println(chislo);
//        }
        return znach;
    }

    public static void poiskV_massiveString (Object [] objects) {

        System.out.println("введите данные на поиск");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        String[] str = new String[10];
        boolean proverka = true;
        boolean proverka1 = true;
        boolean proverka2 = true;

        // if (objects.equals(str)) {
        // Проверка на тип массива

        str = (String[]) objects;
        String stroka = scanner.nextLine();

        for (String probeg : str ){
            String asd = probeg.toLowerCase();
            //  System.out.println("приведение в регист "+ asd);

        }

        for (int d = 0 ; d < str.length ; d++){
            str[d] = str[d].toLowerCase();
        }


        for (String temp : str) {

            if (temp.startsWith(stroka)) {
                System.out.println("Поиск завершен " + temp);
                proverka1 = false;
                break;
            }
        }
        while (proverka1){
            System.out.println("Поиск не дал результатов. Измените поисковый запрос ");
            break;
        }
        // System.out.println("Поиск не дал результатов. Измените поисковый запрос ");

        System.out.println("Вывести все элементы массива?");
        System.out.println("Да(1) или Нет(0)");
        int tempVvod = scanner1.nextByte();

        while (proverka)
            if (tempVvod == 1) {

                for (String temp : str) {
                    System.out.println("Содержимое массива = " + temp);
                }

                System.out.println("Пограмма завершила свою работу");
                proverka = false;
            } else if (tempVvod == 0) {
                System.out.println("Пограмма завершила свою работу");
                proverka = false;
            } else {
                System.out.println("Ввеждены не коректные днанные");
            }



        while (proverka2){
            System.out.println("Вы можете привести все значения в регистре в Верхний или Нижний Регистр !!");

            System.out.println("Верхний регистр Нажмите 1 ");
            System.out.println("Верхний регистр Нажмите 2 ");
            System.out.println("Верхний регистр Нажмите 0 ");

            int znach =  scanner3.nextInt();

            switch (znach){

                case (1) :{
                    for (int d = 0 ; d < str.length ; d++){
                        str[d] = str[d].toLowerCase();
                    }
                    proverka2 = false;
                    break;
                }
                case  (2):
                    for (int d = 0 ; d < str.length ; d++){
                        str[d] = str[d].toUpperCase();
                    }
                    proverka2 = false;
                    break;
                case  (0):{
                    System.out.println("Выход из программы");
                    proverka2 = false;
                }

            } // конец свича

            for (String temp : str) {
                System.out.println("Содержимое массива = " + temp);
            }
            System.out.println("Выход из программы");
        } // конец вайла



    } //конец метода



    public  static void poiscIndekcaV_Sting (int a ,String stroka){
        System.out.println("Происходит Поиск по введеномому номеру(индексу) строки");
        String pustaia = " ";

        if (stroka.length() >= a) {

            if (pustaia != stroka) {

                int dlinaStroki = stroka.length();
                char temp;

                temp = stroka.charAt(a);
                System.out.println("Длина строки = " + dlinaStroki);
                System.out.println(temp);

            } //конец ифа2
        }//конец ифа2
        System.out.println("Условие поиска по индексу не верное. Измение его на более меньшое");
        System.out.println("Конец");

    }

    public static void poisc_PO_IndekcaV_Sting (String s ,String stroka){
        String etalon = " ";

        if (etalon != stroka){
            // проверка на пустоту строки

            int dlinaStroki = stroka.length();

            int jj = stroka.indexOf(s);

            char temp = (char) stroka.indexOf(s);
            System.out.println("Длина строки = "+dlinaStroki);
            System.out.println("Символ "+ s +"находится под индексом =  "+jj);

        } // конец ифа 1
        System.out.println("Конец");

    }

    public static void poisc_PO_IndekcaV_Sting (int znach ,String stroka){
        String etalon = " ";

        if (etalon != stroka){
            // проверка на пустоту строки

            int dlinaStroki = stroka.length();

            int jj = stroka.charAt(znach);

            char temp = (char) stroka.charAt(znach);
            System.out.println("Длина строки = "+dlinaStroki);
            System.out.println("Символ "+ temp +"находится под индексом =  "+temp);

        } // конец ифа 1
        System.out.println("Конец");

    }


} // Конец класса
