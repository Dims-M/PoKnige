package ru.Osnovi.RabotaSCollekciami;

/**
 * Created by User on 003 03.01.17.
 */
public class Timyr {

    public static void main(String[] args) {

        Car_Test car1_Proverka = new Car_Test("Запор","Запорозец",50.1);
        Car_Test car22_Proverka = new Car_Test("Зафывфпор","ывфвфывц",540.1);
        System.out.println("Вывод седержимого обьекта car1_Proverka : "+  " Имя обьекта "+ car1_Proverka.getName() + " Модель " +car1_Proverka.getMjdel()+ " Стоимость "+car1_Proverka.getStoimost());

        Car_Test car2_Зoverka; //Создали переменную типа Car_Test (Для хранения ссылки на обьект)

        car2_Зoverka = car1_Proverka; // Присвоили ссылочной переменной. Ссылку на другой обьект car1_Proverka
        // Вывод
        System.out.println("Вывод седержимого обьекта car2_Зoverka : "+  " Имя обьекта "+ car2_Зoverka.getName() + " Модель " +car2_Зoverka.getMjdel()+ " Стоимость "+car2_Зoverka.getStoimost());

        car1_Proverka.setName(null); // Реализованна проверка на null
        System.out.println(car1_Proverka.getName());
        //   car1_Proverka = null; // обнуление ссылки
      //  System.out.println("Вывод седержимого обьекта car1_Proverka : "+  " Имя обьекта "+ car1_Proverka.getName() + " Модель " +car1_Proverka.getMjdel()+ " Стоимость "+car1_Proverka.getStoimost());
        razdelitel();

        System.out.println(car1_Proverka.toString());
        razdelitel();

        // Сравнение на равенство с помощью метода equals
        // Все ссылочные переменные Обязательно проверять с помщью метода equals !!
        // Метод equals Нужно ПЕРЕОПРЕДЕЛЯТЬ под себя!!!!!
        System.out.println("Сравнение на равенство с помощью метода equals");
        System.out.println( car1_Proverka.equals(car2_Зoverka));
        sravnenieodject (car1_Proverka, car2_Зoverka);
        sravnenieodject (car1_Proverka, car22_Proverka );

    }

    public static void razdelitel (){
        System.out.println("*************");
    }

    public static  void sravnenieodject (Object object1, Object object2){
        System.out.println("Метод для провреки обьектов на равенство!");
        boolean proverka = object1.equals(object2);
        if (proverka == true){
            System.out.println("Проверка прошла успешна!! Объекты равны!!");
        }
        else
            System.out.println("Обьекты не равны!!!");
    }
}
