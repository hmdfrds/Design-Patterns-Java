package Memento;

public class Client {
    public static void main(String[] args) {
        FileWriterCareTaker careTaker = new FileWriterCareTaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.text");

        fileWriterUtil.write("First set of Data \nMyra\nLucy\n");

        System.out.println(fileWriterUtil + "\n\n");
        // save the file
        careTaker.save(fileWriterUtil);

        // write something else
        fileWriterUtil.write("Second set of data:\nJason\n");
        System.out.println(fileWriterUtil + "\n\n");
        // undo to last save
        careTaker.undo(fileWriterUtil);
        // check content again
        System.out.println(fileWriterUtil + "\n\n");

    }

}
