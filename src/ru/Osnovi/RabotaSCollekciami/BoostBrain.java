package ru.Osnovi.RabotaSCollekciami;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by User on 016 16.02.17.
 */
public class BoostBrain {

  static   String strokaIstochnika = "D:/123.txt";
  static   String strokaIstochnika1 = "D:/moscow-buildings.CSV";

    public static void main(String[] args) throws IOException {

        chenieFaila (strokaIstochnika);
        chenieFaila (strokaIstochnika1);

    }

    public static void chenieFaila (String istochnik) throws IOException {

        FileInputStream stream = new FileInputStream(istochnik);
        // создали обьект для открытия этого файла.

        // теперь его надо считать из файла
        // узнаем и сохраняем длину потока(считанного файла)
        int length = stream.available();

        // маччив дл хрвнения битовых значенй
        byte [] data = new byte[length];
        stream.read(data);

        String text = new String(data);

        System.out.println(text);


    }

}
