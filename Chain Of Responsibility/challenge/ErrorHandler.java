class EmailErrorHandler implements IReceiver {
    private IReceiver receiver;

    public EmailErrorHandler() {
    }

    @Override
    public boolean processMessage(Message message) {

        if (message.message.contains("Email")) {
            System.out.println(
                    "EmailErrorHandler processed " + message.messagePriority + " priority issue:" + message.message);
            return true;
        } else {
            if (receiver != null) {
                receiver.processMessage(message);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(IReceiver receiver) {
        this.receiver = receiver;
    }
}

class FaxErrorHandler implements IReceiver {
    private IReceiver receiver;

    public FaxErrorHandler() {
    }

    @Override
    public boolean processMessage(Message message) {

        if (message.message.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.messagePriority + " priority issue:"
                    + message.message);
            return true;
        } else {
            if (receiver != null) {
                receiver.processMessage(message);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(IReceiver receiver) {
        this.receiver = receiver;
    }
}
