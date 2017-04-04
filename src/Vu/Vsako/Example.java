package Vu.Vsako;

import java.util.Scanner;

/**
 * Created by User on 006 06.02.17.
 */
public class Example {

    public static void main(String[] args) {
        srednieZnachenie ();
    }

    public static void srednieZnachenie (){
        Scanner vklad_S = new Scanner(System.in);
        Scanner vrema_S = new Scanner(System.in);
        Scanner prosent_S = new Scanner(System.in);

        System.out.println("Программа для подсчета процентов по вкладу!");
        System.out.println("*******************************************");

        System.out.println("Введите сумму вклада и нажмите Ентр");
        double tempVklad = vklad_S.nextDouble();
        System.out.println("Введите срок вашего влада. В полных месяцах");
        int tempVrema = vrema_S.nextInt();
        System.out.println("Введите процентную ставку");
        double tempProsent = prosent_S.nextDouble();

       // tempVrema *= 30;
        double itogPoVkladu = 0;
        for (int i = 1;i<=tempVrema;i++){
             itogPoVkladu += tempVklad*tempProsent;
        }

       // itogPoVkladu = (tempVklad * tempProsent) + tempVrema;

       // double itogPoProsentu = (tempVklad *tempProsent * (tempVrema / 360)) /100;
        double itogPoProsentu = tempProsent * tempVrema;
        // double itogPoProsentu = tempVklad * (1  + tempProsent*30/365/100) 6 - tempVklad ;

        System.out.println("Производится расчет......\n");
        System.out.println("------------------------------");
        System.out.println("Ваш вклад = "+tempVklad +"\n"+
                           "Ваши процентная ставка = "+ tempProsent+"\n"+
                           "Ваше время вклада = "+tempVrema + " \n");

        System.out.println("Ваши насчитанные проценты по вкладу = "+ itogPoProsentu);
        System.out.println("Ваша общая сумма по вкладу = "+ itogPoVkladu);


    }

}
