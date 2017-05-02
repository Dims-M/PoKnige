package ChatRoom;

import com.sun.deploy.panel.JSmartTextArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by User on 023 23.04.17.
 */
public class Server extends JFrame {

    //Страка для хранения и отправки введеного текста
    private JTextField userImputText;

    //В данной области окна будет появлятся и хранится инвормацио кто о чем написал.
    private JTextArea chatWindow;

    //Переменные для сетевых потоков.
    //Создаются потоки для передачи инвы. По портам компютера
    private ObjectOutputStream  tOutputStream;
    private ObjectInputStream InputStream;

    //сервер. Переменная будет шлушать входящие подключения
    private ServerSocket serverSocket;

    //Отвечает за Сокет. Socket = Это айпи адрес + порт
    private Socket connection;

    /// Конструктор
    public Server (){
        // Переопределяем метод
        super("Серверная часть.");

        // Инициализируем текстовое поле. Где пользователь вводит свое сообщение.
        userImputText = new JTextField();
        //Делаем поле до соедеинение сервера и клиента НЕактивным
        userImputText.setEnabled(false);
        //Прошлушиватель события ддля текстового поля.
        // Срабатывает когда пользователь вводит текст
        userImputText.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sendMessage(e.getActionCommand());
                        userImputText.setText("");
                    }
                }
        );
        add(userImputText, BorderLayout.NORTH);

        // расположение
        chatWindow = new JSmartTextArea();
        //прокручивание
        add(new JScrollPane(chatWindow));
        // размер
        setSize(300,600);
        //Видимость
        setVisible(true);

    }

    // Настройка и запуск серверной части программы

    public void startServer (){
// настроиваем порт для сообщений
        try {
            serverSocket = new ServerSocket(7777, 100);
            while (true){
                try {
                    //Сжед соединения
                    waitForConnection();

                    //отвечает за потоки ввода ввывода
                    setupStreams();

                    // срабатывае тогда когда образуется связь с друг другом
                    whileChatting();

                }
                catch (EOFException eof){
                    showMessage("\nCервер оборвалГ соединение!!!");
                } finally {
                    closeConnection();
                }
            }
        }
        catch (IOException ioExceptione){
            ioExceptione.printStackTrace();
        }

    }

    //ожидаем соединение  и отображение инфы о подключении
    // throws IOException выбрасывает исключения
    private void waitForConnection () throws IOException{
        showMessage("Ожидание подключения Собеседников.... \n");

        // метод срабатывает когда есть подключение
        connection = serverSocket.accept();
        // Показывает собщение + показывает иайпи собеседника в текстовом варианте
        showMessage("Соеденение с  \n"+connection.getInetAddress().getHostAddress());
    }

    // настройка поток для отправки и получнеия данных
    // Потоки нужны для фильтрации исходящего и входящего трафика
    // Поток это инстркция для выполненияконретной задачи внутри проыесса исполнения програмы
  private  void   setupStreams() throws IOException {
        // Поток ввода
      InputStream = new ObjectInputStream(connection.getInputStream());

      // Поток ввывода
      tOutputStream = new ObjectOutputStream(connection.getOutputStream());
      tOutputStream.flush(); // Доотправляем все клиенту
      showMessage("\n Поток запущен \n");

    }

    // Обработка данных во время общения
    private  void  whileChatting () throws IOException{
    String message = "Вы подключены";
    sendMessage(message);
    // Делает истиным метод userImputText.setEnabled(false);
    readyToType (true);

    do {
        try {
            // в строковый переменную сохраняем данные из внешнего хводящего потока, считываем ходящий обьект
           message = (String) InputStream.readObject();
            showMessage("\n"+message);
        }
catch (ClassNotFoundException classNotFoundException){
        showMessage(" \nНе пойму что за хрень отправил этот пользователь!!!");
}
    } //цИКЛ БУДЕТ РАБОТАТЬ ПОКА КЛИЕНТ НЕ ОТРПАВИТ
        while (!message.equals("КЛИЕНТ - *"));
    }

    //Закрываем скеты и потоки, когда поьзователь начатился ))
    private void  closeConnection(){
        showMessage("\n Закрытие соединения");
        readyToType (false);

        // Закраваемм потоки.
        try {
            tOutputStream.close();
            InputStream.close();

          // Закраваемм сокеты.
            connection.close();
        }
        catch (IOException ioException){
            // выводит сообщение о ошбке
                ioException.printStackTrace();
        }
    }

    // отправляем сообщение клиенту(пользователю)

    private void sendMessage(String message){

        try {
          tOutputStream.writeObject("СЕРВЕР - "+message);
          tOutputStream.flush();
            showMessage("\n СЕРВЕР - "+message);
        }

        catch (IOException ioe){
            chatWindow.append("/n ОШИБКАААААААААА");
        }

    }
}
