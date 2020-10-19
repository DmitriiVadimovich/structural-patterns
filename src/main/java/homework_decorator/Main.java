package homework_decorator;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("d.zubarev", "Ilya_Sukhachev", "Привет! Посмотри, пожалуйста, мою реализацию чат клиента");

        EncryptionDecorator chatClient = new UsersEncryptionDecorator(new TextEncryptionDecorator(new ChatClient()));

        chatClient.sendMessage(message);

        System.out.println(message);

        chatClient.receiveMessage(message);
    }
}
