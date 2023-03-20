
interface AdvancedMediaPlayer {
    void loadFileName(String fileName);

    void listen();
}

class VlcPlayer implements AdvancedMediaPlayer {

    private String fileName;

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {

        System.out.println("Playing vlc file. File name is :" + fileName);

    }
}

class Mp4Player implements AdvancedMediaPlayer {

    private String fileName;

    @Override
    public void loadFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. File name is :" + fileName);

    }
}