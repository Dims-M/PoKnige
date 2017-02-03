package Vu.Vsako;

import java.io.*;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * Created by User on 003 03.02.17.
 */

    public class RaznieMetodi {

        private static String fileName = "C:\\sozdanieI_ZapisFaila.txt";
        private static String text  = "C:\\tempLogChetieFaila.txt";
        // private static String text  = "апппппп";

        public static void main(String[] args) throws FileNotFoundException {
            //zapisFaila ();
            // chenoeFailov ();
            //  zapisDateV_Fail ();
            sozdanieI_ZapisFaila(fileName,text);
        }  // конец майла


        public static void zapisFaila (){

            System.out.println("Запись данных из файла");

            Scanner scannerVvod = new Scanner(System.in);
            Scanner istok = new Scanner(System.in);

            System.out.println("Введите адрес файла");
            String istocnik = istok.nextLine();
            System.out.println("Напишите что вам нужно.");
            String vvodTexta =  scannerVvod.nextLine();

            Date currentDate = new Date();
            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("'Сегодняшная Дата: 'E dd.MM.yyyy'\nВремя: ' hh:mm:ss");

            //  Так, в конструктор редается либо путь к файлу в виде строки, либо объект File, который ссылается на конкретный текстовый файл.
            // Параметр append указывает, должны ли данные дозаписываться в конец файла (если параметр равен true),
            //либо файл должен перезаписываться.
            //  C:\\tempFlog.txt
            // try(FileWriter writer = new FileWriter("C:\\tempLog.txt", true))
            try(FileWriter writer = new FileWriter(istocnik, true))
            {
                // запись всей строки
                String text = vvodTexta;
                writer.write(text);
                // запись по символам
                writer.append('\n');
                // writer.append(currentDate.toString());
                //writer.append('\n');
                // ввод даты
                writer.append(dateFormat.format(currentDate));
                System.out.println("Данные записаны...");
                writer.append('\n');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }

        public static void  chenoeFailov (){
            System.out.println("Чтение данных из файла.");

            try(FileReader reader = new FileReader("C:\\tempLogChetieFaila.txt"))
            { // Используем для чтениея класс FileReader. В конструктор передаем адрес хранеия файла.
                // читаем посимвольно
                int c;
                while((c = reader.read())!=-1){

                    System.out.print((char)c);
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        } // конец метода чтения файла


        public static void zapisDateV_Fail () {
            System.out.println("Запись даты в измененный файл");

            System.out.println("Введите адрес файла в который требуется ввести изменения даты ");
            Scanner scanner = new Scanner(System.in);
            String adresFaila = scanner.nextLine();

            Date currentDate = new Date();
            // Создаем обьект для работы с Датой
            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("'Измененно: 'E dd.MM.yyyy'\nВремя: ' hh:mm:ss");
            // форматированная форма вывода.
            try(FileWriter writer = new FileWriter(adresFaila, true))
            {
                writer.append(dateFormat.format(currentDate));
                System.out.println("Данные записаны...");
                //writer.append('\n');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }


        public static void sozdanieI_ZapisFaila (String fileName, String text){
            // text =  ;
            // В качестве параметров указываем имя файла и сам текст
            System.out.println("Создание и запись файла");

            // Обьект для работы с датой.
            Date moiaData = new Date();
            SimpleDateFormat dateFormat =
                    new SimpleDateFormat("'Текущая Дата: 'E dd.MM.yyyy'\nВремя: ' hh:mm:ss");
            // Обьект для вывода форматированой даты

            // Создаем файл. В качестве параметров указываем строковый fileName
            File file = new File(fileName);
            //try(FileWriter writer = new FileWriter(istocnik, true)


            //  try  { PrintWriter out = new PrintWriter(text);
            try  { FileWriter out = new FileWriter(fileName, true);
                // Проверка исключительной ситуации
                //проверяем, что если файл не существует то создаем его
                if(!file.exists()){
                    file.createNewFile();
                }

                FileReader reader = new FileReader(text);

                // читаем посимвольно
                int c;
                while((c=reader.read())!=-1){

                    // System.out.print((char)c);
                }

                //PrintWriter обеспечит возможности записи в файл
                //  PrintWriter out = new PrintWriter(file.getAbsoluteFile());
                out.append('\n');
                out.write(text); // Передаем в строке адрес файла который нам нужно прочитать.
                // out.append(text);
                out.append('\n');
                out.append(dateFormat.format(moiaData));
                out.append(" ");
                //out.print(text);
                out.flush();
                out.close();


                // try {
                //Записываем текст у файл
                // out.print(text);
                //  } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                //   out.close();
                //  }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }




        } // конец метода sozdanieI_ZapisFaila




    }// конец класса



