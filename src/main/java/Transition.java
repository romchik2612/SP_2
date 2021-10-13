public class Transition {
    private int from;
    private int to;
    private char letter;

    public Transition(int from, int to, char letter) {
        this.from = from;
        this.to = to;
        this.letter = letter;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public char getLetter() {
        return letter;
    }
}
