public class AdapterPatternDemo {
    public static void main(String[] args) {

        MediaPlayer mediaPlayer1 = new AudioPlayer();

        mediaPlayer1.play("mp3", "rihana.mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advancMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancMediaPlayerAdapter1.play("mp4", "alone.mp4");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();

        MediaPlayer advancMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancMediaPlayerAdapter2.play("vlc", "far far away.vlc");

        mediaPlayer1.play("vlc", "far far away .vlc");
    }

}
