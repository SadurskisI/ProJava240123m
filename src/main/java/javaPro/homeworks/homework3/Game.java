package javaPro.homeworks.homework3;

public class Game {

    final int numberOfPlayers = 2;

    Players player1 = new Players("Player 1");
    Players player2 = new Players("Player 2");
    Players[] playersArray = new Players[2];

    public void prepareTheGame() {
        player1.fillYourField();
        player2.fillYourField();
        playersArray[0] = player1;
        playersArray[1] = player2;
        player1.setRivalPlayer(player2);
        player2.setRivalPlayer(player1);
    }

    public void play() {
        while (true) {
            for (int i = 0; i < playersArray.length; i++) {
                playersArray[i].rivalField.repaint();
                boolean isMissed = false;
                while (!isMissed) {
                    ShotConfirmation result = playersArray[i].makeMove();
                    if (result == ShotConfirmation.MISSED) {
                        isMissed = true;
                        System.out.println("Вы промахнулись. Переход хода.");
                    } else if (result == ShotConfirmation.DAMAGED) {
                        System.out.println("Вы попали. Корабль ранен.");
                    } else {
                        System.out.println("Вы попали. Корабль убит.");
                    }
                    if (!playersArray[i].rivalPlayer.playerField.hasMoreShips()) {
                        System.out.println("Игра окончена. " + playersArray[i].getName() + " победил.");
                        return;
                    }
                }
            }
        }
    }
}
