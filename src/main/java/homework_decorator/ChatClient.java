package homework_decorator;

public class ChatClient implements IChatClient{

    @Override
    public void sendMessage(Message message) {
        if (!(message == null)) {
            System.out.println("Отправлено:\n" + message);
        } else {
            throw new RuntimeException("Введите сообщение!");
        }
    }

    @Override
    public void receiveMessage(Message message) {
        if (!(message == null)) {
            System.out.println("Получено:\n" + message);
        } else {
            throw new RuntimeException("Введите сообщение!");
        }
    }
}
