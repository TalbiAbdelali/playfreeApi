package com.ata.playFreeAPi.service;

import com.ata.playFreeAPi.dao.impl.PlayerDao;
import com.ata.playFreeAPi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public List<User> getPlayers() {
        List<User> users = new ArrayList<>();
        playerDao.findAll().forEach(user -> users.add(user));
        return users;
    }

    public Optional<User> getPlayer(long id) {
        return playerDao.findById(id);
    }

    public void addPlayer(User uesr) {

    }
}
