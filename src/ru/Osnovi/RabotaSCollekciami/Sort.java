package ru.Osnovi.RabotaSCollekciami;

/**
 * Created by User on 003 03.12.16.
 */

        import java.util.Random;

/**
 * Created by Администратор on 18.11.2016.
 */
public class Sort {
    String oiasanie = "Класс отвечает за сортировку массивов";


    public static void sorttMassiv (){

        // создали масив в 10 элементами
        int [] nums = new int[10];
        int countRandom = 0;
        int temp = 0;
        // метод рандом для заполнения массива

        Random random = new Random();

        for (int strTemp : nums) {
            System.out.println("Текущие состояние массива = " + strTemp);
        }
        // заполняем случайным значение от 0 до 100
        for (int i = 0; i <nums.length; i++){
            countRandom = random.nextInt(100);
            nums[i] = countRandom;
            // заполняем случайным значение от 0 до 100
        }
        System.out.println();
        for (int strTemp2 : nums) {
            System.out.println("Текущие состояние массива = " + strTemp2);
        }

        for (int i = nums.length -1 ; i >0 ; i--) {
            // нешний цикл сокрощает при каздой итерации количесвто проходов(проверок)
            // Если i --
            for (int j = 0; j < i; j++) {

                // ПРОВЕРКА если первый элемент в индексе nums[i] меньше следущего за ним  < nums[i+1]
                if (  nums[j] > nums[j + 1]) {

                    temp = nums[j]; // Если значение верное(в первом индексе значение меньше чем во втром) То записываем во временную переменную

                    nums[j] = nums[j + 1];

                    nums[j + 1] = temp;
                }

            } // Внутр цикл
        } // Внешний цикл

        System.out.println("1*////");

        for (int strTemp3 : nums) {
            System.out.println("Текущие состояние Отсаортированного массива = " + strTemp3);
        }



    }


    public static void  bolsort (int[] num ){ // аргумент массив

        // создали масcив в 10 элементами
        int [] nums = num;
        // получили массив в качестве параметра
        int temp = 0;
        // временная переменная для хранения копируемы данных массива

        for (int strTemp : nums) {
            System.out.println("Текущие состояние массива = " + strTemp);
        }

        for (int i = nums.length -1 ; i  > 0 ; i--) {
            // нешний цикл сокрощает при каздой итерации количесвто проходов(проверок)
            // Если i -- то уменьшается на каждой итерации
            for (int j = 0; j < i; j++) {
                // 10 . 8 .15.8.5.1
                // ПРОВЕРКА если первый элемент в индексе nums[i] меньше следущего за ним  < nums[i+1]
                if (nums[j] > nums[j + 1]) {
                    // 10      // 8
                    temp = nums[j]; // Если значение верное(в первом индексе значение меньше чем во втром) То записываем во временную переменную
                    // 10
                    nums[j] = nums[j + 1];
                    // 8
                    nums[j + 1] = temp;
                    // 10
                    // Так выявляется самое большое число в массиве!! И при кажой итерации самые большие числа идут в коней
                    /// Самые малые иду с начала!!
                }
            }

        } // Внутр цикл


        System.out.println("************ОТСОРТИРОВАННО по убыванию************");

        for (int strTemp3 : nums) {
            System.out.println("Текущие состояние Отсаортированного массива = " + strTemp3);
        }

        for (int i = nums.length -1 ; i >0 ; i--) {
            // нешний цикл сокрощает при каздой итерации количесвто проходов(проверок)
            // Если i --
            for (int j = 0; j < i; j++) {

                // ПРОВЕРКА если первый элемент в индексе nums[i] меньше следущего за ним  < nums[i+1]
                if (nums[j] < nums[j + 1]) {

                    temp = nums[j]; // Если значение верное(в первом индексе значение меньше чем во втром) То записываем во временную переменную

                    nums[j] = nums[j + 1];

                    nums[j + 1] = temp;
                }
            }

        } // Внутр цикл

        System.out.println("************ОТСОРТИРОВАННО Возрастанию************");

        for (int strTemp3 : nums) {
            System.out.println("Текущие состояние Отсаортированного массива = " + strTemp3);
        }

    } // Внешний цикл


} //Конец класса
