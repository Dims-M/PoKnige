package ru.Osnovi.RabotaSCollekciami;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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

       // udaleniechastimassiva(listZveri, 3);
        udaleniePoindexuSnachaloI_doKinca(listZveri, 0, 3);
        vividLista(listZveri);
        System.out.println("Длинна Листа = "+ counntlist ((LinkedList) listZveri));
        //System.out.println(udaleniePoindexuSnachaloI_doKinca(listZveri, 0, 3));

        vividRazdelitela();
        reversList(listZveri);
        vividLista(listZveri);




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

    public static LinkedList udaleniechastimassiva (LinkedList list, int indexs){

        System.out.println("удаление части лмста по индексу");

        list.remove(indexs);

        return list;

    }

    //удаление из списка нужных элементов
    public static LinkedList udaleniePoindexuSnachaloI_doKinca (LinkedList list, int indexNachalo, int indexKones){
        System.out.println("Происходит удалени...по индексу..С начало "+indexNachalo + " по "+indexKones);
        list.subList(indexNachalo,indexKones).clear();

        return list;

    }

    public static LinkedList reversList(LinkedList list){
        System.out.println("перестановка элементов с конца на начало");

        //с помощью итераторов проходим по списку в качестве параметра указали размерлиста
        ListIterator iterator = (ListIterator) list.listIterator(list.size());
        String addWhat ="Я - ";
        while (iterator.hasPrevious()){
            // метод hasPrevious Проверяет есть ли у списка доступный следущий элемент
            System.out.printf("%s ", iterator.previous() );
           // list.add(iterator.previous());
           // list.set(iterator.nextIndex(),addWhat + iterator.next());
        }

        for (Object str: list){
        //    list.add(str);
        }

        for (int i=0; i<list.size();i++){
           // list.add()
        }


        return list;
    }


} // конец класса
