package com.ata.playFreeAPi.service;

import com.ata.playFreeAPi.dao.PlayerRepository;
import com.ata.playFreeAPi.dto.UserDTO;
import com.ata.playFreeAPi.enums.Level;
import com.ata.playFreeAPi.model.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Data
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<User> getPlayers() {
        List<User> users = new ArrayList<>();
        playerRepository.findAll().forEach(users::add);
        return users;
    }

    public Optional<User> getPlayer(long id) {
        return playerRepository.findById(id);
    }

    public User addPlayer(UserDTO userdto) {
        if(userdto != null) {
            User user = convertToEntity(userdto, null);
            return playerRepository.save(user);
        }
        return null;
    }

    public User updatePlayer(UserDTO userdto, long id) {
        if(id > -1 && userdto != null) {
            User user = playerRepository.findById(id).orElse(null);
            user = convertToEntity(userdto, user);
            return playerRepository.save(user);
        }
        return null;
    }

    public void deletePlayer(long id) throws Exception {
        try {
            playerRepository.deleteById(id);
        } catch (Exception e) {
            throw new Exception("Player has not been deleted!");
        }
    }

    private User convertToEntity(UserDTO userdto, User user) {
        if(user == null) {
            user = new User();
        }
        user.setPseudo(userdto.getPseudo());
        user.setPhone(userdto.getPhone());
        user.setEmail(userdto.getEmail());
        user.setSoccerLevel(userdto.getSoccerlevel());
        user.setAvailable(userdto.isAvailablity());
        return user;
    }

    private UserDTO convertToDTO(User user, UserDTO userdto) {
        if(userdto == null) {
            userdto = new UserDTO();
        }
        userdto.setPseudo(user.getPseudo());
        userdto.setPhone(user.getPhone());
        userdto.setEmail(user.getEmail());
        userdto.setSoccerlevel(user.getSoccerLevel());
        userdto.setAvailablity(user.isAvailable());
        return userdto;
    }
}
