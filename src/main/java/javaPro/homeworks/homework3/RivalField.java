package javaPro.homeworks.homework3;

public class RivalField extends Field {
    private static final char MISSED_SHOT = '*';
    private static final char SUCCESSFUL_SHOT = 'X';

    public void recordShotResult(ShotConfirmation shotConfirmation, Position position) {
        if (shotConfirmation == ShotConfirmation.MISSED) {
            field[position.getX()][position.getY()] = MISSED_SHOT;
        } else {
            field[position.getX()][position.getY()] = SUCCESSFUL_SHOT;
        }
        repaint();
    }
}
