interface MediaPlayer {
    void play(String audioType, String fileName);

}

class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing ." + audioType + ". File name: " + fileName);
        } else {
            System.out.println("not supported");
        }
    }
}