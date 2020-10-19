package homework_decorator;

import java.util.Base64;

public abstract class EncryptionDecorator implements IChatClient{
    private IChatClient chatClient;

    public EncryptionDecorator(IChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public void sendMessage(Message message) {
        chatClient.sendMessage(message);
    }

    @Override
    public void receiveMessage(Message message) {
        chatClient.receiveMessage(message);
    }

    public IChatClient getChatClient() {
        return chatClient;
    }

    protected String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    protected String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
