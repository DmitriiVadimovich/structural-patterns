package homework_decorator;

public class UsersEncryptionDecorator extends EncryptionDecorator{

    public UsersEncryptionDecorator(IChatClient chatClient) {
        super(chatClient);
    }

    @Override
    public void sendMessage(Message message) {
        String author = encode(message.getAuthor());
        String address = encode(message.getAddress());
        message.setAuthor(author);
        message.setAddress(address);
        super.sendMessage(message);
    }

    @Override
    public void receiveMessage(Message message) {
        String author = decode(message.getAuthor());
        String address = decode(message.getAddress());
        message.setAuthor(author);
        message.setAddress(address);
        super.receiveMessage(message);
    }
}
