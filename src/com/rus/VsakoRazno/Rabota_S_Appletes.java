package com.rus.VsakoRazno;

import  java.awt.*;
import  javax.swing.*;
/**
 * Created by User on 020 20.12.16.
 */
// указываем чта наш класс наследуется от extends JApplet
public class Rabota_S_Appletes extends JApplet {

    // создали класс для вывода(Рисования) графического окна
    public void paint (Graphics g){
        // вызываем метод paint из ролдителького класса с помощью команды super с параметром g
        super.paint(g);
        g.drawString("Это мой первый Аплет",300,400);

}

   //public static void main(String[] args) {
        String infa =  "Аплеты используют работу java в вашем интернет браузере";

  //  } // конец метода майн


} // конец класса
