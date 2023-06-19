package Command;

public class ShutdownMusicCommand implements Command{
    private MusicPlayer musicPlayer;

    public ShutdownMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.shutdownMusic();
    }
}
