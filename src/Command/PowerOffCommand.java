package Command;

public class PowerOffCommand implements Command{
    private MusicPlayer musicPlayer;

    public PowerOffCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.powerOff();
    }
}
