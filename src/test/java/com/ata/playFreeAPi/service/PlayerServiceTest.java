package com.ata.playFreeAPi.service;

import com.ata.playFreeAPi.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class PlayerServiceTest {
    @Mock
    PlayerService playerService = Mockito.mock(PlayerService.class);
    List<User> users;
    @BeforeEach
    public void setUp() {
        users = List.of(new User());
    }
    @Test
    public void getPlayersOk(){

    }
}
