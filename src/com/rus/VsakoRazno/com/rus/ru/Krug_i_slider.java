package com.rus.VsakoRazno.com.rus.ru;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 021 21.12.16.
 */
public class Krug_i_slider  extends JPanel{
    // класс отвечает за работу круга и слайдера

    // Значения по умолчанию. Этот диаметр мы увидим при запуске круга
    private int diametr = 10;

    public void  paintComponent(Graphics g){
        // Метод будет отвечать за прорисовку круга
        // вызываем родительский класс из класса JPanel
        super.paintComponent(g);
        // указываем методу прорисовать круг. Первые 2 знач координаты. Втровые 2 значения размер
        g.fillOval(10, 10, diametr,diametr);
    }

    public  void setDiametr (int newDiametr){
        // метод отвечает за размер(изменения) диаметра
    }


}
