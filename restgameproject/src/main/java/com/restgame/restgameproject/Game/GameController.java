package com.restgame.restgameproject.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping("/") // This is the root and it gives the player the info they need to control the game. 
    public String getGameInfo() {
        return "Welcome to my game. You can use the following endpoints to control the game\n" +
                "GET /game_state - You can look at the current state of the game using this command\n" + 
                "POST /start_game - You can start a new game by giving the player name\n" + 
                "POST /answer_question - You can give your answer to the question";
    }

    @GetMapping("/game_state") // by using this you should be able to see the current state of the game. The player name, score and the question.
    public Game getGameState() {
        return gameService.getGameInfo();
    }

    @PostMapping("/start_game") // This starts the game by giving a player name.
    public String startGame(@RequestBody PlayerInfo playerInfo) {
        return gameService.startGame(playerInfo);
    }

    @PostMapping("/answer_question") // Using this you are able to answer the question.
    public String answerQuestion(@RequestBody PlayerAnswer answer) {
        return gameService.answerQuestion(answer);
    }

}


