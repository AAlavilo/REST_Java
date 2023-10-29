package com.restgame.restgameproject.Game;

public class Game {
    private String playerName;
    private int score;
    private String question;

    public Game(String playerName, int score, String question) {
        this.playerName = playerName;
        this.score = score;
        this.question = question;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
}
