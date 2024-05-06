package com.ata.playFreeAPi.controller;
import com.ata.playFreeAPi.service.PlayerService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = PlayerController.class)
class PlayerControllerUT {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    PlayerService playerService;
    @Test
    void getPlayers() throws Exception {
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk());
    }
}