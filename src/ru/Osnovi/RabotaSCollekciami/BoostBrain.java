package ru.Osnovi.RabotaSCollekciami;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by User on 016 16.02.17.
 */
public class BoostBrain {

    public static void main(String[] args) {



    }

    public static void chenieFaila () throws IOException {

        FileInputStream stream = new FileInputStream("D:/123.tht");
        // создали обьект для открытия этого файла.

        // теперь его надо считать из файла
        // узнаем и сохраняем длину потока(считанного файла)
        int length = stream.available();


    }

}
