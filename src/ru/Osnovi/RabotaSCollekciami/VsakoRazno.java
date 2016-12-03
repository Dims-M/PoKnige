package ru.Osnovi.RabotaSCollekciami;

/**
 * Created by User on 003 03.12.16.
 */

import java.util.ArrayList;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

/**
 * Created by Администратор on 12.11.2016.
 */
public class VsakoRazno {


//    VsakoRazno () {
//       // String[] mas = new String[3];
//        ArrayList<String[]> arrayList = new ArrayList();
//        arrayList.add(mas);
//    }


    ArrayList<String[]> arrayList = new ArrayList();

    public static ArrayList<int[]> arrayListInt = new ArrayList();



    // Создали строковой массив и заполнили его значениями
    public static String[] mas = {"aaa ", "bbb ", "ccc "};

    public static void vsakoRaznot (){

      abs:  for (int i = 0; i< 10; i++ ){
            for ( int j = 0; j <10; j++){
                if ( j>i){
                    System.out.printf("**********************55555555555555");
                    continue abs;
                }
                System.out.println("Первый цикл фор " + (i*j));
            }
        }

    }

    public void vividMassivaForeach() {
// вывод значений массива с помощью цикла foreach
        for (String srt : mas) {
            System.out.printf("Содержание массива = " + srt + "\n");

        }

        arrayList.add(mas);
        //добавили в колекцию аррейЛист массив
        razdelitel();
        for (String str : mas) {
            // вывод разделителя
            System.out.println("Вывод жанных которые содержатся в  ArrayList " + str);

        }

        System.out.println("Вывод данных из колекции с помощью цикла for");
        int asd = arrayList.size();
        for (int a = 0; a  < asd; a++ ){

            System.out.println( arrayList.get(a));

        }

    } // конец метода


    public static void listA () {
        razdelitel();
        List<Zapisi_I_zametki> list = new ArrayList<>();

        Zapisi_I_zametki zapisi = new Zapisi_I_zametki();
        Zapisi_I_zametki zapis2 = new Zapisi_I_zametki();
        Zapisi_I_zametki zapis3 = new Zapisi_I_zametki();

        zapisi.setProbniy(1000);

        list.add(zapisi);
        list.add(zapis2);
        list.add(zapis3);


        System.out.println(list);
        System.out.println(list.get(0));

        for (Zapisi_I_zametki z : list) {
            System.out.println("Получаем ссылки на объект");
            System.out.println(z);
        }

        for (Zapisi_I_zametki z : list) {
            boolean bol = false;
            if (bol == z.equals(1)) {
                System.out.println("Значение хранимое в Листе равно 0");
            } else {
                System.out.println(z.getProbniy());
            }
            System.out.println(z.getProbniy());
        }
    }


    public static void rabotaS_LIST(){
        razdelitel();
        System.out.println("Работаем с колекцтей лист(LIST");
        int aswecf=  arrayListInt.size();
        System.out.println(aswecf);

        // String [] antiHeroes = new String[];
        // Или
        String [] antiHeroes = {"Joker", "Grinch","Plankton","mistique"};
        // создали строковый масив
        List<String > listHeroes = new ArrayList<>();
        System.out.println(" Текущая длина в элементах листа = " +listHeroes.size());

        // добавляем элементы(ссылки на область памяти) массива(индексы) в коллекцию Лист
        for (String str: antiHeroes){
            listHeroes.add(str);
            System.out.println("Содержимое Листп = " + str);
        }
        System.out.println(" Текущая длина элементах листа = " +listHeroes.size());

    }


    public static void razdelitel (){
        System.out.println("**************************");
    }


    public static int [] randomMetodMassiv(int i) {

        int massiv[] = new int[i];
        int a;
        int tempM = 0;
        Random random = new Random();

        for (a = 0; a < massiv.length; a++) {
            tempM = random.nextInt(100);
            massiv[a] = tempM;
        }

        for (int as: massiv) {
            //  System.out.println(as);
        }
        return  massiv;
    }


    // вычисляем Факториал с ПОМОЩЬЮ РЕкурсии

    public static long moyFactorial (long n) {

        //Проверка введеного результата. Факториал не должен Буть меньше 1 го
        if (n > 0) {
            if (n <= 1) {
                System.out.println("Использовано факториал по умолчанию");
                return 1;  // Если значения будут меньше 1 то сработотает литерал ретерн
            }// конец проверочного Ифа
            else {

            }
        }

        else {
            System.out.println("Вы ввели отрицательное значение факториала");
        }

        return n * moyFactorial(n - 1);
        //Возращает расчитаныйс помощью рекурсии Факториал.
        // 1*2*3*4*5 = Это факориал 5
    }

    public  static  long moyAlterFactorial (long n){
        long temp = 1;
        for (int i = 1; i < n; i++){
            temp  =  temp * i;
            // Вычисляем факториал
            System.out.println(temp);
        }
        System.out.println("Итоговое значение Факториала = " + temp  );
        return temp;
    }

}
// коонец класса
