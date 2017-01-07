package ru.Osnovi.RabotaSCollekciami;

/**
 * Created by User on 003 03.01.17.
 */
public class Timyr {

    public static void main(String[] args) {

        Car_Test car1_proverka = new Car_Test("Запор", "Запорозец", 50.1);
        Car_Test car22_Proverka = new Car_Test("Зафывфпор","ывфвфывц",540.1);
        System.out.println("Вывод седержимого обьекта car1_Proverka : "+  " Имя обьекта "+ car1_proverka.getName() + " Модель " +car1_proverka.getMjdel()+ " Стоимость "+car1_proverka.getStoimost());

        Car_Test car2_Зoverka; //Создали переменную типа Car_Test (Для хранения ссылки на обьект)

        car2_Зoverka = car1_proverka; // Присвоили ссылочной переменной. Ссылку на другой обьект car1_Proverka
        // Вывод
        System.out.println("Вывод седержимого обьекта car2_Зoverka : "+  " Имя обьекта "+ car2_Зoverka.getName() + " Модель " +car2_Зoverka.getMjdel()+ " Стоимость "+car2_Зoverka.getStoimost());

       // car1_Proverka.setName(null); // Реализованна проверка на null
        System.out.println(car1_proverka.getName());
        //   car1_Proverka = null; // обнуление ссылки
      //  System.out.println("Вывод седержимого обьекта car1_Proverka : "+  " Имя обьекта "+ car1_Proverka.getName() + " Модель " +car1_Proverka.getMjdel()+ " Стоимость "+car1_Proverka.getStoimost());
        razdelitel();

        System.out.println(car1_proverka.toString());
        razdelitel();


        // Выводим содержимое обьекта с помощью переопределенного метода toЫекштп
        System.out.println("Выводим содержимое обьекта с помощью переопределенного метода toЫекштп");
        System.out.println(car1_proverka.toString());

        // Сравнение на равенство с помощью метода equals
        // Все ссылочные переменные Обязательно проверять с помщью метода equals !!
        // Метод equals Нужно ПЕРЕОПРЕДЕЛЯТЬ под себя!!!!!
        System.out.println("Сравнение на равенство с помощью метода equals");
        System.out.println( car1_proverka.equals(car2_Зoverka));
        sravnenieodject (car1_proverka, car2_Зoverka);
        sravnenieodject (car1_proverka, car22_Proverka );

        razdelitel();

        // Выводим содержимое обьекта с помощью переопределенного метода toЫекштп
        System.out.println("Выводим содержимое обьекта с помощью переопределенного метода toЫекштп");
        System.out.println(car1_proverka.toString());

        razdelitel();

        System.out.println("После преопределеия метода туСтринг при выводе обьекта. Атоматичемки срабатывает метод ту стринг");
        System.out.println(car1_proverka);

        razdelitel();

        System.out.println("Работаем с методом hashCode");
        int tempHesh = car22_Proverka.hashCode();
        System.out.println("У обьекта car22_Proverka  хеш код равен "+ tempHesh );
        System.out.println("У обьекта car1_proverka хеш код равен "+ car1_proverka.hashCode() );
        System.out.println("У обьекта car2_Зoverka хеш код равен  "+  car2_Зoverka.hashCode() );

    } // Конец метода майн

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
