class AdvancedMediaPlayerAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer adapter) {
        this.advancedMediaPlayer = adapter;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.loadFileName(fileName);
        advancedMediaPlayer.listen();
    }

}
