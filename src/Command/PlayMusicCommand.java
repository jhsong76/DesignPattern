package Command;

public class PlayMusicCommand implements Command{
    private MusicPlayer musicPlayer;

    public PlayMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.playMusic();
    }
}
