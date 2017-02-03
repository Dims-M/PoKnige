package Vu.Vsako;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 003 03.02.17.
 */
public class RabS_Massivami {

    public static void main(String[] args) {

        infaOClasse();
       // sozdanieMassiva(10);
        int []  temmppM =  zapolnenieMassivaRandom(sozdanieMassiva(10));
     //  vividMassiva(temmppM);
       slojemieMassiva(temmppM);
      //  vividMassiva(temmppM);

        kopirovanieMaasbvaPrimitiv(temmppM);
        vividMassiva( kopirovanieMaasbvaArreis(temmppM, temmppM.length));


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
        //Сложенние данных в массиве
        int tempInt = 0;
        for (int  i =0; i<massiv.length; i++){
            tempInt += massiv[i];
            massiv[i] = tempInt;
        }
              return  massiv;
    }


    public static void kopirovanieMaasbvaPrimitiv (int massiv []){
        // копирование массива с помощью циклов
        int [] saveMassiv = new int[massiv.length];
        int count = 0;
        for (int i = 0; i <massiv.length; i++){
            System.out.print("*");
            saveMassiv[i] = massiv[i];
            count++;
        }

        for (int tempMasiv1:massiv){
            count = 0;
            System.out.println(tempMasiv1);
        }
        System.out.println("После копирования");
        for (int saveMassivi : saveMassiv ){
            System.out.print("*");
            System.out.println(saveMassivi);

            count++;
        }
    }

    public static int[] kopirovanieMaasbvaArreis (int[] massiv, int chiloSave){
        // копирование массивов с помощью класса Arrays.copyOf
        int [] saveMass;
        saveMass = sozdanieMassiva (chiloSave);
        saveMass = Arrays.copyOf(massiv , massiv.length);
        return saveMass;
    }

} // конец класса
