package com.ata.playFreeAPi.controller;

import com.ata.playFreeAPi.model.User;
import com.ata.playFreeAPi.service.PlayerService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PlayerControllerTest {

    PlayerController playerController = mock(PlayerController.class);
    PlayerService playerService = mock(PlayerService.class);
    List<User> users = null;
    User user = null;
    @BeforeEach
    void setUp() {
        playerController.setPlayerService(new PlayerService());
        users = List.of(new User("test", "test", "test", "test", false));
        user = new User("test", "test", "test", "test", false);
    }

    @Test
    void getPlayers() {
        when(playerController.getPlayers()).thenReturn(ResponseEntity.ok().body(users));
        assertEquals(users, playerController.getPlayers().getBody());
    }

    @Test
    void getPlayer() {
        when(playerService.getPlayer(anyInt())).thenReturn(Optional.ofNullable(user));
        when(playerController.getPlayer(anyInt())).thenReturn(ResponseEntity.ok().body(user));
        //assertEquals(user, playerController.getPlayer(anyInt()));
    }

    @Test
    void addPlayer() {
    }

    @Test
    void deletePlayer() {
    }

    @Test
    void updatePlayer() {
    }
}