package ru.Osnovi.RabotaSCollekciami;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by User on 016 16.02.17.
 */
public class BoostBrain {

  static   String strokaIstochnika = "D:/123.txt";
  static   String strokaIstochnika1 = "D:/moscow-buildings.CSV";

    public static void main(String[] args) throws IOException {

        chenieFaila (strokaIstochnika);
       // chenieFaila (strokaIstochnika1);

    }

    public static void chenieFaila (String istochnik) throws IOException {

        FileInputStream stream = new FileInputStream(istochnik);
        // создали обьект для открытия этого файла.

        // теперь его надо считать из файла
        // узнаем и сохраняем длину потока(считанного файла)
        int length = stream.available();

        // маччив дл хрвнения битовых значенй
        byte [] data = new byte[length];
        // с помощью метода реад записываем данные
        stream.read(data);


        String text = new String(data);

        String [] lines  = text.split("\n");
       // String [] lines1  = text.split(" ", 2);

        // Вывод данных
       //System.out.println(text);
        System.out.println(Arrays.toString(lines));
      //  System.out.println(Arrays.toString(lines1));


    }

}
