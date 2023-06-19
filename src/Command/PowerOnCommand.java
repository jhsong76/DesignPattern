package Command;

public class PowerOnCommand implements Command {
    private MusicPlayer musicPlayer;

    public PowerOnCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.powerOn();
    }
}
