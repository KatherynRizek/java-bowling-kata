public class Bowling {

    int score = 0;
    public void roll(int pinsKnocked) {
        score = pinsKnocked + score;
    }

    public int getScore() {
        return score;
    }

}