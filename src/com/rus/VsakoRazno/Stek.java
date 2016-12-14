package com.rus.VsakoRazno;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by User on 010 10.12.16.
 */
public class Stek {
    public static void main(String[] args) {

        // Создаем обьект стэк типа Стринг
        Stack<String> stack = new Stack<String>();
        //Метод пуш позволяет добавить что то в стек
        stack.push("Первонах");
        stack.push("Второй стек");
        stack.push("Третий стек");

        //****************
        System.out.println("***************");
        System.out.println("Текущий размер Стека равен = "+stack.size());
        System.out.println("***************");
        System.out.println("Содежимое Стека = "+stack.peek());
        stack.peek();

        // получение данных по индексу
        System.out.println(stack.get(0));
        System.out.println(stack.get(1));
        System.out.println(stack.get(2));

        // Вывод содержимого стека через метод
        printStekcs(stack);
        // Убрать данные из стека Послежний добавденый стек!!!!!
        stack.pop();
       // stack.pop();
       // stack.pop();

        printStekcs(stack);

    } // конец метода майн


    public static void printStekcs (Stack<String> stack){
        System.out.println("Выводим содержимое стека!!");

        if (stack.empty()){
            System.out.println("Стек пуст. Нет ни каких значений");
        }

        else {
            for (String string : stack) {
                System.out.println(string);
            }
            System.out.println("Длина стека = " + stack.size());
        }
        System.out.println("Вывод завершен");
    }


} // конец класса

