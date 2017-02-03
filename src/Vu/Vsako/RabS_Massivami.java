package Vu.Vsako;

import java.util.Random;

/**
 * Created by User on 003 03.02.17.
 */
public class RabS_Massivami {

    public static void main(String[] args) {

        infaOClasse();
       // sozdanieMassiva(10);
        int []  temmppM =  zapolnenieMassivaRandom(sozdanieMassiva(10));
       vividMassiva(temmppM);
       slojemieMassiva(temmppM);
        vividMassiva(temmppM);
    }

    public static void infaOClasse (){
        System.out.println("Работаем с массивами");
    }


    public static int [] sozdanieMassiva (int razmerMass){
        int [] massiv = new int[razmerMass];
        return massiv;

    }


    public static int[] zapolnenieMassivaRandom (int[] massiv){
        int tempZanach = 0;
        for (int i = 0; i < massiv.length; i++){
            Random random = new Random();
            tempZanach = random.nextInt(1000);
            massiv[i]=tempZanach;
        }
        return massiv;
    }

    public static void vividMassiva (int[] massivV){
        System.out.println("Содержимое массива:");

        for (int tempMass : massivV){
            System.out.println(tempMass);
        }
    }

    public static  int[] slojemieMassiva (int [] massiv){
        int tempInt = 0;
        for (int  i =0; i<massiv.length; i++){
            tempInt += massiv[i];
            massiv[i] = tempInt;
        }
              return  massiv;

    }


}
