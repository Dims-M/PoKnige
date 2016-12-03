package ru.Osnovi.RabotaSCollekciami;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by User on 003 03.12.16.
 */

/**
 * Created by Администратор on 12.11.2016.
 */
public class Zapisi_I_zametki {

    int probniy ;

    public int getProbniy() {
        return probniy;
    }

    public void setProbniy(int probniy) {
        this.probniy = probniy;
    }

    public static String getMassiv() {
        return massiv;
    }

    public static void setMassiv(String massiv) {
        Zapisi_I_zametki.massiv = massiv;
    }

    public static String getColekcionOpredelenie() {
        return colekcionOpredelenie;
    }

    public static void setColekcionOpredelenie(String colekcionOpredelenie) {
        Zapisi_I_zametki.colekcionOpredelenie = colekcionOpredelenie;
    }

    public static String getColekcionKlassifikator() {
        return colekcionKlassifikator;
    }

    public static void setColekcionKlassifikator(String colekcionKlassifikator) {
        Zapisi_I_zametki.colekcionKlassifikator = colekcionKlassifikator;
    }

    public static String getColekcionNahozdenieFaile() {
        return colekcionNahozdenieFaile;
    }

    public static void setColekcionNahozdenieFaile(String colekcionNahozdenieFaile) {
        Zapisi_I_zametki.colekcionNahozdenieFaile = colekcionNahozdenieFaile;
    }

    public  static  String massiv =  "Это обьект или множество обьектов соеджащий однотипные объекты количество которых изместно зарание ";

    public  static  String colekcionOpredelenie =  "Коллекциями/контейнерами в Java принято называть классы, основная цель которых – хранить набор других элементов. \n" +
            "Колекция это - итерационные обьекты \n Т есть это объекты " +
            "которые в нутри себя содержат другие объекты \n" +
            "Колекции хранят в себе однотипные обьекты количество которых не 'Неограниченно' \n" +
            "В колекции хранится илипимитывные данные или ссылки на объекты!!! ";

    public  static  String colekcionKlassifikator =  " Класификатор колекций \n" +
            "List" +
            "Map" +
            "***" +
            "Колекция лист бывает нескольких видов.... List, SET" +
            "List хранит в себе не уникальное значение  "+
            "Set хранит в себе только уникальное значение  " +
            "и так далее \n" +
            "Подробней http://spec-zone.ru/RU/Java/Docs/7/api/java/util/package-summary.html И http://developer.alexanderklimov.ru/android/java/collections.php" +
            "" +
            "Существует 'главный Интерфейс или колекция '  ПРИМЕР = Collection <VsakoRazno>  collection = new ArrayList();" +
            "";

    public  static  String colekcionNahozdenieFaile =  "Все классы/интерфейсы и т.д. которые описывают функциональность по работе с коллекциями" +
            " в стандартной библиотеки языка java" +
            " находятся в пакете java.utils.*";

    public static String spisok_LIST_ = " ";








}
