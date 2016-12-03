package ru.Osnovi.RabotaSCollekciami;

import java.util.*;
/**
 * Created by User on 003 03.12.16.
 */

//для работы с колекциями необходима стандартная библиотека java.util.*;
/**
 * Created by Администратор on 25.11.2016.
 */
public class RabotaS_ArrayListom {


    public static void main(String[] args) {

        rabotaS_ArreiListom();

        VsakoRazno vsakoRazno = new VsakoRazno();
       // vsakoRazno.vsakoRaznot ();

        //*************
       // Создали Список типа Аррейй Лист
        List<String> list = new ArrayList<>();
        // Создаем для проверки дубликатов
        List<String> list1 = new ArrayList<>();

        addList(antiHeros , list); // добавление массивов в Листы
        addList(moreAntiHeros , list1); // добавление массивов в Листы

       // VividList(list);
      //  VividList(list1);

      //  tempStr2 (list , list1); // проверка на дубликаты

       // VividList(list);
       /// VividList(list1);


    }

   public static String[] antiHeros = {"Jocer ", "Grinch", "Plankton ", "Mistique"};
   public static String[] moreAntiHeros = {"Jocer ", "Mistique"};

    final static String info = "Данный класс работает с колексией ArrayLis " +
            "Аррей лист содержит массив примитивных переменных или сслыки на объекты" +
            " РАЗМЕР массива является Динамическим!! (Т Е увеличевается сам при необходимости)" +
            "************************* " +
            "К базовой колекции JAVA существет 2 основных направления ЭТО " +
            "Колекция  содержит набор обьектов или элементов" +
            "и" +
            "МАР содержит Ключ - значение" +
            "**************" +
            "Аррей лист представляет собой неупорядочную колекцию в которой допустимы дулирующие значения" +
            "И значения такой колеции пронумерована(индексы) от 0 " +
            "****************" +
            "Для работы с колекциями необходима стандартная библиотека java.util.*;" +
            "";


//////////////////////////////////********************************
//  Методы

    public static void rabotaS_ArreiListom() {

        String reg = "Уиня ";

        //Создали массив для добавление а Аррей лист
        String[] antiHeros = {"Jocer ", "Grinch", "Plankton ", "Mistique"};
        String[] moreAntiHeros = {"Jocer ", "Mistique"};

        // Создали Список типа Аррейй Лист
        List<String> list = new ArrayList<>();
        // Создаем для проверки дубликатов
        List<String> list1 = new ArrayList<>();

        // Добавляем в лист с помощь метода фор
        for (String str : antiHeros) {
            //list.add(str);
            list.add(str);
        }

        // Выводим с помощью методв фор
        for (String str1 : antiHeros) {
            System.out.println(str1);
        }
        System.out.println("************");
        // C помощью метода list.add(1, reg) добавляем нужный элемент в нужный индекс
        list.add(1, reg);

        // Выводим с помощью методв фор
        for (String str1 : list) {
            System.out.println(str1);
        }

        // Проверяем на дубликаты в ареей листке
        //list1.add (moreAntiHeros);
        addList (moreAntiHeros,list1);
      //  addList (antiHeros,list);
        VividList(list1);
        tempStr2(list, list1);
       // VividList(list);
        VividList(list1);


    } // конец метода


    public static void tempStr2 (Collection<String> lst1, Collection<String> lst2 ){
        // удаление дубликатов из Листов
        System.out.println("");
        System.out.println("Начало работы  \n");

        // Используем специальный метод Iterator он перебирает листы от начало и до конца
        Iterator<String> iterator1 = lst1.iterator();

        while (iterator1.hasNext()) {
            // метод hasNext - проходит весь список. От начало и до конца. Как дайдет до конца = фолсом

            if (lst2.contains(iterator1.next())){
                //очищаем индекс с дубликатом
                iterator1.remove();
                System.out.println("КУУВВВУВВ");
            }

        }

int kg =0;
        for (String  tempProverka : lst1){

            for (String tempStr2 :lst2 )
            if (tempProverka.contains(tempStr2)){
                System.out.println("Обноружен дубликат");
                System.out.println("В первом Листе значение "+ tempProverka+ " = "+ "Значению второго Листа "+ tempStr2);
            }
            kg++;
        }

        System.out.println("Проверка завершина"+kg);

    } // конец метода


    ///****************
    public static void addList (String [] strings, List list){
        // Метод для автоматического заполненич
        for ( Object str : list ){
            list.add(str);
        }
        System.out.println("Лист заполнен");
        VividList (list);
    }

    public static void VividList ( List list){
        // Метод для Вывода на экран
        for ( Object str : list ){
            System.out.println(str);
        }

    }

} // коней класса
