
interface IReceiver {
    boolean processMessage(Message message);

    void setNextChain(IReceiver receiver);
}