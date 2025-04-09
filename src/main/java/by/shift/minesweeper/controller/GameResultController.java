package by.shift.minesweeper.controller;

import by.shift.minesweeper.model.GameResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class GameResultController {

    @GetMapping
    public List<GameResult> getResults() {
        return null;
    }

    @PostMapping
    public void saveResult(@RequestBody GameResult result) {
    }
}
