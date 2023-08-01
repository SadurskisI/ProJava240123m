package javaPro.homeworks.homework3;

import java.util.Scanner;

public class Players {

    PlayerField playerField;
    RivalField rivalField = new RivalField();
    private final String name;

    public void setRivalPlayer(Players rivalPlayer) {
        this.rivalPlayer = rivalPlayer;
    }

    Players rivalPlayer;

    public Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fillYourField() {
        playerField = new PlayerField();
        playerField.createPlayerField(this);
    }

    public ShotConfirmation makeMove() {
        System.out.println(name + ", введите координаты вашего выстрела");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Position shotPosition = new Position(Integer.parseInt(input[0]) - 1, Integer.parseInt(input[1]) - 1);
        ShotConfirmation shotConfirmation = rivalPlayer.playerField.takeAShot(shotPosition);
        rivalField.recordShotResult(shotConfirmation, shotPosition);
        return shotConfirmation;
    }
}
