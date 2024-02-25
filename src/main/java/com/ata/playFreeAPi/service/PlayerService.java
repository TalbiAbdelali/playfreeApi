package com.ata.playFreeAPi.service;

import com.ata.playFreeAPi.dao.impl.PlayerDao;
import com.ata.playFreeAPi.dto.UserDTO;
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

    public User addPlayer(UserDTO userdto) {
        if(userdto != null) {
            User user = new User();
            user.setPseudo(userdto.getPseudo());
            user.setPhone(userdto.getPhone());
            user.setEmail(userdto.getEmail());
            user.setSoccerlevel(userdto.getSoccerlevel());
            user.setAvailablity(userdto.isAvailablity());
            return playerDao.save(user);
        }
        return null;
    }

    public User updatePlayer(UserDTO userdto, long id) {
        if(id > -1 && userdto != null) {
            User user = playerDao.findById(id).orElse(null);
            if(user != null) {
                user.setPseudo(userdto.getPseudo());
                user.setPhone(userdto.getPhone());
                user.setEmail(userdto.getEmail());
                user.setSoccerlevel(userdto.getSoccerlevel());
                user.setAvailablity(userdto.isAvailablity());
                return playerDao.save(user);
            }
        }
        return null;
    }

    public void deletePlayer(long id) throws Exception {
        try {
            playerDao.deleteById(id);
        } catch (Exception e) {
            throw new Exception("Player has not been deleted!");
        }
    }
}
