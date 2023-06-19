package Command;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command powerOnCommand = new PowerOnCommand(musicPlayer);
        Command powerOffCommand = new PowerOffCommand(musicPlayer);
        Command playMusicCommand = new PlayMusicCommand(musicPlayer);
        Command shutdownMusicCommand = new ShutdownMusicCommand(musicPlayer);

        button.setCommand(powerOnCommand);
        button.press();     // 음악 플레이어 켭니다.
        button.setCommand(playMusicCommand);
        button.press();
        button.setCommand(shutdownMusicCommand);
        button.press();
        button.setCommand(powerOffCommand);
        button.press();
    }
}
