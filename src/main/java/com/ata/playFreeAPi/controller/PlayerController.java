package com.ata.playFreeAPi.controller;

import com.ata.playFreeAPi.model.User;
import com.ata.playFreeAPi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getPlayers() {
        return ResponseEntity.ok().body(playerService.getPlayers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getPlayer(@RequestBody long id) {
        Optional<User> user = playerService.getPlayer(id);
        if(!user.isEmpty()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
