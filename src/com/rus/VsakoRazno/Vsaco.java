
package com.rus.VsakoRazno;

import java.util.Scanner;

/**
 * Created by User on 023 23.01.17.
 */
public class Vsaco {

    public static void main(String[] args) {

        podschetSrednegoZnachenia ();


    } //Конец метода майн

    public static void podschetSrednegoZnachenia (){
        System.out.println("Расчет зреднего значения!!");

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Введите первое значение и Нажмите ЕНТР");

       int znach1= scanner.nextInt();

       if (znach1 <= 0){
           System.out.println("Вы ввели некоректное значение!! Значение не должно = 0 или быть отрицательным!!");
           System.out.println("Введите  новое значение!!");
           znach1= scanner.nextInt();
       }

        System.out.println("Вы ввели "+ znach1);
        System.out.println("Теперь введите второе значение инажмите ЕНТР ");
        int znach2 =  scanner2.nextInt();

        if (znach2 <= 0){
            System.out.println("Вы ввели некоректное значение!! Значение не должно = 0 или быть отрицательным!!");
            System.out.println("Введите  новое значение!!");
            znach1= scanner.nextInt();
        }

        System.out.println("Вы ввели "+ znach1 + " И "+znach2);

        System.out.println("Производится расчет среднего значения..");

        for (int i = 10; i >= 0; i--){
            System.out.print(i+".");
        }


    }

}
