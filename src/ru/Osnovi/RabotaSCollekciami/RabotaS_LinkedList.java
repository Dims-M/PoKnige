package ru.Osnovi.RabotaSCollekciami;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 004 04.12.16.
 */
public class RabotaS_LinkedList {

    public static void main(String[] args) {

        String [] zveri ={"кот","пингвин","волк","ежигг","дракон"};
        String [] zveri1 ={"удав","волк","ЕжиК","Ниблнр"};

        // линкин лист для хранения связанных списков
        LinkedList listZveri = new LinkedList<>();
        List<String> listZveri2 = new LinkedList<>();

        zapolnenieLista(zveri, (LinkedList) listZveri);
        vividRazdelitela();
        zapolnenieLista(zveri1, (LinkedList) listZveri2);
        vividLista((LinkedList) listZveri);
        System.out.println("Длинна Листа = "+ counntlist((LinkedList) listZveri));
        vividRazdelitela();
        vividLista((LinkedList)listZveri2);
        System.out.println("Длинна Листа = "+ counntlist((LinkedList) listZveri2));
        soedinenie(listZveri, (LinkedList) listZveri2);
        vividRazdelitela();
        vividLista(listZveri);
        System.out.println("Длинна Листа = "+ counntlist ((LinkedList) listZveri));





    } // конец майна

    public  static LinkedList zapolnenieLista(String [] str , LinkedList list){
        System.out.println("Вывод содержимого ");
        int count =0;
        for (String stroki : str){
            list.add(stroki);
        }

            return list;

    }

    public static void vividLista (LinkedList list){
        for (Object str: list){
            System.out.println(str);
        }
    }

    public static LinkedList soedinenie (LinkedList list, LinkedList list2){

        list.addAll(list2);

        return list;

    }

    public static int counntlist (LinkedList list){
        return list.size();
    }

    public static void vividRazdelitela(){
        System.out.println("*******************");
    }

} // конец класса
