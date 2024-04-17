package com.ata.playFreeAPi.controller;

import com.ata.playFreeAPi.dto.UserDTO;
import com.ata.playFreeAPi.model.User;
import com.ata.playFreeAPi.service.PlayerService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@Data
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public ResponseEntity<List<User>> getPlayers() {
        return ResponseEntity.ok().body(playerService.getPlayers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getPlayer(@PathVariable long id) {
        Optional<User> user = playerService.getPlayer(id);
        return user.map(value -> ResponseEntity.ok().body(value)).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PostMapping
    public ResponseEntity<Object> addPlayer(@RequestBody @Validated UserDTO userDTO) {
        if(playerService.addPlayer(userDTO) != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(new Object[]{"User has been created."});
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable long id) throws Exception {
        playerService.deletePlayer(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePlayer(@RequestBody @Validated UserDTO userDTO, @PathVariable long id) {
        if(playerService.updatePlayer(userDTO, id) != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new Object[]{"User has been updated."});
        }
        return null;
    }
}
