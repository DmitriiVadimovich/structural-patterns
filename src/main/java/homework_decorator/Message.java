package homework_decorator;

public class Message {
    private String author;
    private String address;
    private String text;

    public Message(String author, String address, String text) {
        this.author = author;
        this.address = address;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getAddress() {
        return address;
    }

    public String getText() {
        return text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return author + " -> " + address + "\n" + text;
    }
}
