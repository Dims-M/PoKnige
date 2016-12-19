package com.rus.VsakoRazno;

import java.util.PriorityQueue;
import java.util.Queue;

public class Rabota_S_Queue {

    public static void main(String[] args) {

        System.out.println("Разбираем колекцию Очередь. Или Queue");

        //Создаем новый обьект типа PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        // Что бы добавить (Нужные данные) в очередь используем команду offer
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // Вывод на консоль с помощью форматирования текста
        System.out.printf("%s", queue);
        System.out.println("Размер текущей очереди = "+ queue.size());

        // Самый первый элемент который находится в очереди имеет высшию приорететность
        //вывод приоритета c помощью команты peek
        System.out.println("******");

        System.out.println("Тукущий приоритет = "+queue.peek());
        System.out.println("******");
        // после удаление приоритета следущий за ним тип данных становится приоритетом
        // Удаление приоритета
        queue.poll();
        System.out.printf("%s", queue);
        System.out.println("Размер текущей очереди после удаления приоритета = "+ queue.size());
        System.out.println("******");
        System.out.println("Тукущий приоритет = "+queue.peek());



    } // конец методв майн
}
