class IssueRaiser {
    private IReceiver receiver;

    public IssueRaiser(IReceiver receiver) {
        this.receiver = receiver;
    }

    public void raiseMessage(Message message) {
        if (receiver != null) {
            receiver.processMessage(message);
        }
    }
}