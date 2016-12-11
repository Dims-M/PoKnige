package ru.Osnovi.RabotaSCollekciami;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by User on 004 04.12.16.
 */
public class RabotaS_LinkedList {

    private static String u20A9;

    public static void main(String[] args) {

        String [] zveri ={"кот","пингвин","волк","ежигг","дракон"};
        String [] zveri1 ={"удав","волк","ЕжиК","Ниблнр"};
        String [] planet ={"Земля","Марс","Венера","Сатурн"};

        String [] kriminalChivo = {"Мия ","Джулс ","Винсенс ","Марселлас ","Бутч"};

        Character [] simvoli = {'П','Р','И','В','Е','Т',};

        Integer [] number = new Integer[10];
        int [] numberInt = new int[10];

        LinkedList linkedListSimvol = new LinkedList(Arrays.asList(simvoli));

        // ВНИМАНИЕ
        // Также можно передовать в Лист в качестве параметра Аррей лист
        LinkedList linkedList123 =  new LinkedList(Arrays.asList(kriminalChivo));
        LinkedList linkedListCon =  new LinkedList(Arrays.asList(kriminalChivo));
        LinkedList zveriList =  new LinkedList(Arrays.asList(zveri));
        LinkedList zveriList22 =  new LinkedList(Arrays.asList(zveri1));

        LinkedList<String>  planetList = new LinkedList( Arrays.asList(planet));
        ArrayList<String> planetList2 = new ArrayList<String>();
        planetList2.add("Уран");
        planetList2.add("Меркурий");
        planetList2.add("Юпитер");
        planetList2.add("Нептун");


        List<Character> pustoi = new LinkedList<>();
        List<Integer> chislo = Arrays.asList(number);

        // Дакже мы всегда можем добавить в лист новое значение в конец списка
        linkedList123.add("Кунц");

        // Дакже мы всегда можем добавить в лист новое значение в конец списка
        linkedList123.addFirst("Yfit pyfxtybt");

        // Конвертация списка обратно в Аррей лист
        kriminalChivo = (String[]) linkedList123.toArray(new String[linkedList123.size()]);
        // В переменную массива = приводим тип к листу. потом создаем стринговый массив с размером такойже как длина Листа

        // Заполнение списка напрямую
        Collections.fill(pustoi,'U');

        // линкин лист для хранения связанных списков
        LinkedList listZveri = new LinkedList<>();
        List<String> listZveri2 = new LinkedList<>();
        List<String> chivo = new LinkedList<>();
      //  List<String> pustoi = new LinkedList<>();

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

        // Метод disjoint сравнивает 2 списка и возращает истину если там нет одинаковых значений!!!

        //Метод frequency ищет в колекции нужное вам значение. Используется через
        // Collections.frequency(planetList2, "Уран");


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
       // vividЬффышa(kriminalChivo);
        vividRazdelitela();
        konxertationListV_Massiv(kriminalChivo,linkedList123);
      //  vividЬффышa(kriminalChivo);
        vividRazdelitela();
        vividSimvolov(linkedListSimvol);
        System.out.println( konxertationListV_MassivCharacter(simvoli,linkedListSimvol));
        vividSimvolov(linkedListSimvol);
        reversList(linkedListSimvol);
        vividRazdelitela();
        System.out.println("Выод листа с помощью метода входящего в Collections.reverse");
         Collections.reverse(linkedListSimvol);
        vividSimvolov(linkedListSimvol);
        Collections.reverse(linkedListSimvol);
        vividSimvolov(linkedListSimvol);
        vividRazdelitela();
        vividLista(listZveri);
        Collections.reverse(listZveri);
        System.out.println("********");
        vividLista(listZveri);
        System.out.print(listZveri.size());
        vividLista(zveriList22);
        System.out.print(zveriList22.size());
        System.out.println("********");
        System.out.println("Копирование одного масства в другой ");
        Collections.copy(zveriList,zveriList22);
        vividLista(zveriList);
        System.out.print(listZveri.size());
        System.out.println("********");
        vividLista(zveriList22);
        System.out.print(listZveri.size());
        vividRazdelitela();
        vividRazdelitela();
        vividSimvolovCHE(pustoi);
       vividSimvolov((LinkedList) pustoi);
       vividRazdelitela();
        vividLista(zveriList22);

        deleteMetod(zveriList22,1);
        vividLista(zveriList22);

        vividRazdelitela();
        randomIntod(number);
      //  vividINTA(number);
        vividRazdelitela();
        // Сортировка массива(int)
        Collections.sort(chislo);
       //vividINTA(number);

        vividRazdelitela();
        randomIntodINT(numberInt);
        vividINTA(numberInt);
        vividRazdelitela();
        sortirovkaInta(numberInt);
      // vividINTA(number);
        vividINTA(numberInt);
        vividRazdelitela();

        vividLista(planetList);
        vividRazdelitela();
        vividЬффышa(planetList2);
        vividRazdelitela();
        Collections.addAll(planetList2, planet);
        vividЬффышa(planetList2);
        vividRazdelitela();
        planetList2.add(0,"Уран");
        planetList2.add(1,"Уран");
        vividЬффышa(planetList2);

        Collections.replaceAll(planetList2,"Сатурн", "Уранов");
        vividЬффышa(planetList2);
      int tempPovtoreni =  Collections.frequency(planetList2, "Уран");
        System.out.println("Количество повронени слово 'Уран' = "+tempPovtoreni);
        vividRazdelitela();

        boolean chek =  Collections.disjoint(planetList, planetList2);
        System.out.println("Имеются ли уникальные элементы в 2 списках? = " + chek);
        vividLista(planetList);
        vividRazdelitela();
        vividЬффышa(planetList2);
        Collections.sort(planetList2);
        vividRazdelitela();
        vividЬффышa(planetList2);
        if (chek == false){
            System.out.println("Есть олинаковые элементы в двух списках");
        }
        else System.out.println("Повторений нет");
        vividRazdelitela();
        Collections.shuffle(planetList2);
        vividЬффышa(planetList2);




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

    //Вывод интового числа
    public static void vividINTA (int [] ints){
        for (int str: ints){
            System.out.println(str);
        }

    }

    public static void vividЬффышa (ArrayList<String> object){
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


    //Удаление данных из листа

    public static void deleteMetod(LinkedList list, int indexks){
        System.out.println("Удаляем явейку под индексом "+ indexks);

        if (list.contains("Ниблнр")){
            System.out.println("Список содержит слово Ниблнр");
        }

        for (int i = 0; i < list.size(); i++){
            if (i == indexks){
                System.out.println("Удаление ячейки завершено "+list.get(indexks));
                list.remove(i);
            }
        }

    }


    //Работа с символами
    public static void vividSimvolov(LinkedList list){
        System.out.println("Вданном листе содержится: ");
        for (Object ch : list){
            System.out.println(ch);
        }
    }

    public static void vividSimvolovCHE(List<Character> character){
        System.out.println("Вданном листе содержится: ");
       for (Character ch : character){
           System.out.println(ch);
       }
    }

    // Генератор интовых значений

    public static Integer [] randomIntod (Integer [] ints){
        System.out.println("Заполнение случайными интовыми значениями");
        Random random = new Random();

        for (int i = 0; i<ints.length; i++ ){
            int intTemp = random.nextInt(100) ;
            ints[i] = intTemp;
        }
        return ints;
    }

    public static int [] randomIntodINT (int [] ints){
        System.out.println("Заполнение случайными интовыми значениями");
        Random random = new Random();

        for (int i = 0; i<ints.length; i++ ){
            int intTemp = random.nextInt(100) ;
            ints[i] = intTemp;
        }
        return ints;
    }

    public static void sortirovkaInta(int [] ints) {
        for (int i = ints.length - 1; i>0 ;  i--) {
            for (int j = 0; j < i; j++) {

                if (ints[j] > ints[j + 1]) {

                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;

                }
            }

        }
    }



} // конец класса
