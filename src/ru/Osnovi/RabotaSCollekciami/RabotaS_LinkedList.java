package ru.Osnovi.RabotaSCollekciami;

import java.util.List;

/**
 * Created by User on 004 04.12.16.
 */
public class RabotaS_LinkedList {

    public static void main(String[] args) {



    } // конец майна

    public  static void zapolnenieLista(List list){
        System.out.println("Вывод содержимого ");

        for (Object str : list){
            list.add(str);
        }
    }

    public static void vividLista (List list){
        for (Object str: list){
            System.out.println(str);
        }
    }


} // конец класса
