package ca.tetervak.paperrockscissors.model;

public enum Choice {
//    PAPER, ROCK, SCISSORS;
    BOX1,BOX2,BOX3;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
