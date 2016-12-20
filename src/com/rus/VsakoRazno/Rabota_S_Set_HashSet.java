package com.rus.VsakoRazno;

import javafx.beans.property.SetProperty;

import java.util.*;

public class Rabota_S_Set_HashSet {

    public static void main(String[] args) {



   final String infaOClasse = "Set - Это почти тоже что и список(List) НО он не может содержить одиноковые значения(Дубликатов)(типы, или переменные с одиноковым именем...) ";

   // Создаем строковый  массив
   String [] stringsBrend = new String[] {"Intel ","Dell ","Aplle ","IBM ","LG ","Intel ","Aplle "};

   //Передаем массив в List
    List<String>list =  Arrays.asList(stringsBrend);

    // Вывод листа
        VivodLista(list);
        System.out.println();
        System.out.println("************");

        Set<String> setArr = new HashSet<String>(list) ;

        // Вывод Set
        VivodSeta(setArr);
        System.out.println("Количество элементов = "+ setArr.size());
        System.out.println();
        System.out.printf("%s", setArr);
        System.out.println("Количество элементов = "+ setArr.size());
        System.out.println("************");
        System.out.println();


        setArr.add("intel ");
        setArr.add("dell ");
        setArr.add("Dell ");
        setArr.add("Aplle ");
        setArr.add("Google ");

        System.out.println("После добавлнеия в сет с помощью команды add");
        VivodSeta(setArr);
        System.out.println("Количество элементов = "+ setArr.size());
        System.out.println();
        System.out.printf("%s", setArr);
        System.out.println("Количество элементов = "+ setArr.size());
        System.out.println("************");
        System.out.println();







    } // Конец класса майн

    private static void VivodLista (List list){
        for (Object str : list){
            // System.out.println(str);
            System.out.printf("%s",str);

        }
    }

    private static void VivodSeta (Set set){
        for (Object str : set){
            // System.out.println(str);
            System.out.printf("%s",str);

        }
    }

}

