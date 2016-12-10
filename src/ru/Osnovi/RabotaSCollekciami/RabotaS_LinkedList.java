package ru.Osnovi.RabotaSCollekciami;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by User on 004 04.12.16.
 */
public class RabotaS_LinkedList {

    public static void main(String[] args) {

        String [] zveri ={"кот","пингвин","волк","ежигг","дракон"};
        String [] zveri1 ={"удав","волк","ЕжиК","Ниблнр"};

        String [] kriminalChivo = {"Мия ","Джулс ","Винсенс ","Марселлас ","Бутч"};

        Character [] simvoli = {'П','Р','И','В','Е','Т',};

        LinkedList linkedListSimvol = new LinkedList(Arrays.asList(simvoli));

        // ВНИМАНИЕ
        // Также можно передовать в Лист в качестве параметра Аррей лист
        LinkedList linkedList123 =  new LinkedList(Arrays.asList(kriminalChivo));
        LinkedList linkedListCon =  new LinkedList(Arrays.asList(kriminalChivo));

        // Дакже мы всегда можем добавить в лист новое значение в конец списка
        linkedList123.add("Кунц");

        // Дакже мы всегда можем добавить в лист новое значение в конец списка
        linkedList123.addFirst("Yfit pyfxtybt");

        // Конвертация списка обратно в Аррей лист
        kriminalChivo = (String[]) linkedList123.toArray(new String[linkedList123.size()]);
        // В переменную массива = приводим тип к листу. потом создаем стринговый массив с размером такойже как длина Листа


        // линкин лист для хранения связанных списков
        LinkedList listZveri = new LinkedList<>();
        List<String> listZveri2 = new LinkedList<>();
        List<String> chivo = new LinkedList<>();

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
        vividRazdelitela();
        vividRazdelitela();
        vividRazdelitela();
        zapolnenieLista(kriminalChivo, (LinkedList) chivo);
        vividLista((LinkedList) chivo);
        vividRazdelitela();
        vividLista((LinkedList) linkedList123);
        vividRazdelitela();
        addZnach(linkedList123, "Кунц212");
        vividLista((LinkedList) linkedList123);
        vividRazdelitela();
        addZnachFerst(linkedList123,"Персонажи фильма 'Криминальное чтиво':");
        vividLista((LinkedList) linkedList123);
        vividRazdelitela();
        vividЬффышa(kriminalChivo);
        vividRazdelitela();
        konxertationListV_Massiv(kriminalChivo,linkedList123);
        vividЬффышa(kriminalChivo);
        vividRazdelitela();
        vividSimvolov(linkedListSimvol);
        System.out.println( konxertationListV_MassivCharacter(simvoli,linkedListSimvol));
        vividSimvolov(linkedListSimvol);
        reversList(linkedListSimvol);






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

    public static void vividЬффышa (Object [] object){
        for (Object str: object){
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
        String addWhat = "Я - ";
        while (iterator.hasPrevious()){
            // метод hasPrevious Проверяет есть ли у списка доступный следущий элемент
           // System.out.printf("%s ", iterator.previous() );
            System.out.println();
            System.out.println(addWhat+ iterator.previous());
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

//Конвертируем Список в массив"
    public static Object [] konxertationListV_Massiv (Object [] o, LinkedList list){
        System.out.println("Конвертируем Список в массив");
        o = list.toArray(new String[list.size()]);
        return o;


    }

    public static Object [] konxertationListV_MassivCharacter (Object [] o, LinkedList list){
        System.out.println("Конвертируем Список в массив");
        o = list.toArray(new Character[list.size()]);
        return o;


    }

    public static void addZnach(LinkedList list, Object ojekt){
        list.add(ojekt);
        System.out.println("Добавили новый объект "+ ojekt);
    }

    public static void addZnachFerst(LinkedList list, Object ojekt){
        list.addFirst(ojekt);
        System.out.println("Добавили новый объект в НАЧАЛО списка "+ ojekt);
    }


    //Работа с символами

    public static void vividSimvolov(LinkedList list){
        System.out.println("Вданном листе содержится: ");
        for (Object ch : list){
            System.out.println(ch);
        }
    }

} // конец класса
