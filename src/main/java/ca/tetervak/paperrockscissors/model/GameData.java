package ca.tetervak.paperrockscissors.model;

public class GameData {
    private final Choice playerOneChoice;
//    private final Choice playerTwoChoice;
    private final GameResult gameResult;

    public Choice getPlayerOneChoice() {
        return playerOneChoice;
    }

//    public Choice getPlayerTwoChoice() {
//        return playerTwoChoice;
//    }

    public GameResult getGameResult() {
        return gameResult;
    }

    private static GameResult getGameResult(
            Choice playerOneChoice){
        //Change this switch statement, box1, box2 and box3
        switch(playerOneChoice){
            case BOX1:
                return GameResult.IPHONE;

            case BOX2:
                return GameResult.FIFTY_DOLLARS_GIFT_PRIZE;

            case BOX3:
                return GameResult.CANDY;
//                switch(playerTwoChoice){
//                    case PAPER: return GameResult.REPLAY;
//                    case ROCK: return GameResult.PLAYER_ONE_WINS;
//                    case SCISSORS: return GameResult.PLAYER_TWO_WINS;
//                }
//            case ROCK:
//                switch(playerTwoChoice){
//                    case PAPER: return GameResult.PLAYER_TWO_WINS;
//                    case ROCK: return GameResult.REPLAY;
//                    case SCISSORS: return GameResult.PLAYER_ONE_WINS;
//                }
//            case SCISSORS:
//                switch(playerTwoChoice){
//                    case PAPER: return GameResult.PLAYER_ONE_WINS;
//                    case ROCK: return GameResult.PLAYER_TWO_WINS;
//                    case SCISSORS: return GameResult.REPLAY;
//                }
        }
        throw new AssertionError("should never be reached");
    }

    public GameData(Choice playerOneChoice) {
        this.playerOneChoice = playerOneChoice;
        gameResult = getGameResult(playerOneChoice);
    }
}
