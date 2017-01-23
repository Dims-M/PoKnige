
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

        boolean prov = true;
        int kolichestvo=0;
        int couter = 0;
        int znach1, znach2 = 0;

        double sredniaSumma = 0;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("вВведите количество учеников в классе");

        while (prov) {
            kolichestvo = scanner3.nextInt();
            if (kolichestvo < 0) {
                System.out.println("Вы ввели некоректное значение!! Количество не должно быть отрицательным!!");
                System.out.println("Введите  новое значение!!");
                znach2 = scanner.nextInt();
            }
             if (kolichestvo == 0) {
                prov = false;
                 System.out.println("Количество ученiков = 0. Расчитывать некого...");
                break;
            }

            while (couter < kolichestvo){
                // для расчета количества учасников
                couter++;


            System.out.println("Введите оценку " + couter+ " ученика и Нажмите ЕНТР");

            znach1 = scanner.nextInt();

            if (znach1 < 0) {
                System.out.println("Вы ввели некоректное значение!! Значение не должно  быть отрицательным!!");
                System.out.println("Введите  новое значение!!");
                znach1 = scanner.nextInt();
            }

            sredniaSumma +=  znach1;
//            System.out.println("Вы ввели " + znach1);
//            System.out.println("Теперь введите второе значение инажмите ЕНТР ");
//            znach2 = scanner2.nextInt();
//
//            if (znach2 < 0) {
//                System.out.println("Вы ввели некоректное значение!! Значение не должно  быть отрицательным!!");
//                System.out.println("Введите  новое значение!!");
//                znach2 = scanner.nextInt();
//            }
//
//            System.out.println("Вы ввели " + znach1 + " И " + znach2);

            }

            System.out.println("Производится расчет среднего значения учашихся..\n");
            for (int i = 10; i >= 0; i--) {
                System.out.print(i + ".");
            }
            System.out.println();
            System.out.println("Средние значение суммы оценок учеников = "+ sredniaSumma);
            prov = false;
        }

        System.out.println("Завершение работы....");

    }

}
