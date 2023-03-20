class Message {
    String message;
    MessagePriority messagePriority;

    public Message(String message, MessagePriority messagePriority) {
        this.message = message;
        this.messagePriority = messagePriority;

    }
}

enum MessagePriority {
    NORMAL,
    HIGH
}