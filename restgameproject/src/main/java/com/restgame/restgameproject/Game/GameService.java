package com.restgame.restgameproject.Game;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    private String playerName = "";
    private int score = 0;
    private String question = "What is 2+2?";
    private String answer = "4";

    public Game getGameInfo() {
        return new Game(playerName, score, question);
    }

    public String startGame(PlayerInfo playerInfo) {
        playerName = playerInfo.getPlayerName();
        score = 0;
        return "Game has started for player: " + playerName;
    }

    public String answerQuestion(PlayerAnswer playerAnswer) {
        if(playerAnswer.getAnswer().equals(answer)) {
            score++;
            question = "Next question...";
            answer = "Next answer...";
            return "Correct answer! Your score: " + score;
        } else {
            question = "Wrong answer. Try again.";
            return "Wrong answer.";
        }
    }
}
