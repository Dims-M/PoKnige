//package com.rus.VsakoRazno.ru.Game.Saper;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.util.Random;
//
///**
// * Created by User on 029 29.01.17.
// */
//public class GameMiners extends JFrame {
//
//    //Работаем с переменными
//
//    // Имя окна програмы
//    final String TITLE_OF_PROGRAMM = "Минёрр";
//    // Символ отображения тревоги.
//    final  String SING_OF_flag = "F";
//    //Размер блока в пикселях
//    final int BLOCK_SIZE = 30;
//    // Размер поля в квадратах
//    final int FIELD_SIZE = 9;
//    //координаты
//    final int FIELD_DX = 6;
//    final int FIELD_DY = 28;
//    // Нахождение курсора при начале игры/ от ВЕРХНЕГО ЛЕВОГО ОКНА
//    final int START_LOCATION = 200 ;
//    // Константы овечают(возращаею) при нажатии кнопки мыши. Обработчики событий
//    final int MOUSE_BUTTON_LEFT = 1;
//    final int MOUSE_BUTTON_RIGHT = 3;
//    // количество мин на поле
//    final int NUMBER_OF_MINE = 10;
//    final int [] COLOR_OF_NUMBERS = {0x0000FF, 0x008000, 0x800000,0x0 } ;
//
//    // ПЕРЕМЕННЫЕ
//    // отвечает за игровое поле
//    Cell[][] fielf = new Cell[FIELD_SIZE][FIELD_SIZE];
//
//    //для рандомного заполнения бомбами в игровом поле
//    Random random = new Random();
//
//    // для хранения открытых нами ячеек
//    int countOpendCells ;
//
//    // для оптределения победа или проигрышь. Выставляется труе
//    boolean youWin, bangMine ;
//
//   //  координаты взрыва
//     int bangX, getBangY ;
//
//
//    public static void main(String[] args) {
//
//
//    } // конец метода майн
//
//    //Конструктор класса
//    GameMiners () {
//        // Отрабатывают методы при создании экземпляра класса.
//        // Унаслдежованные от класса JFrame
//        setTitle(TITLE_OF_PROGRAMM); // имя окна
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Настройки по умолчанию. Для игрового окошка
//        setBounds(START_LOCATION, START_LOCATION, FIELD_SIZE * BLOCK_SIZE + FIELD_DX, FIELD_SIZE * BLOCK_SIZE + FIELD_DY); // начальное положение курсора и размер окна.
//        setVisible(true);
//
//        setResizable(false); // метод определяет возможность маштабирования окна
//       final Canvas canvas = new Canvas(); // панель канвасжд;
//        canvas.setBackground(Color.WHITE);
//        canvas.addMouseListener(new MouseAdapter() {
//                    @Override
//                    public void mouseReleased(MouseEvent e) {
//                        super.mouseReleased(e);
//                        int x = e.getX()/BLOCK_SIZE;
//                        int y = e.getY()/BLOCK_SIZE;
//                        if (!bangMine && !youWon) {
//                            if (e.getButton() == MOUSE_BUTTON_LEFT) // left button mouse
//                                 if (field[y][x].isNotOpen()) {
//                                    openCells(x, y);
//                                    youWon = countOpenedCells == FIELD_SIZE*FIELD_SIZE - NUMBER_OF_MINES; // winning check
//                                    if (bangMine) {
//                                        bangX = x;
//                                        bangY = y;
//                                    }
//                                }
//                            if (e.getButton() == MOUSE_BUTTON_RIGHT) field[y][x].inverseFlag(); // right button mouse
//                            if (bangMine || youWon) timeLabel.stopTimer(); // game over
//                            canvas.repaint();
//                        }
//                    }
//                });
//         // Обработчик нажатия на кнопку мыши
//
//    }
//
//    // для инициализации имени поля
//    void inifield (){
//
//    }
//
//    class Cell {
//
//    }
//
//  class Canvas extends  JPanel {
//
//  }
//
//} // конец класса GameMiners
//
