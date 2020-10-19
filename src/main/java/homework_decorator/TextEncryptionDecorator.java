package homework_decorator;

public class TextEncryptionDecorator extends EncryptionDecorator{

    public TextEncryptionDecorator(IChatClient chatClient) {
        super(chatClient);
    }

    @Override
    public void sendMessage(Message message) {
        String text = encode(message.getText());
        message.setText(text);
        super.sendMessage(message);
    }

    @Override
    public void receiveMessage(Message message) {
        String text = decode(message.getText());
        message.setText(text);
        super.receiveMessage(message);
    }
}
