package com.rus.VsakoRazno;

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
        // Убрать данные из стека Послежний добавденый стек!!!!!
        stack.pop();




    } // конец метода майн




} // конец класса

