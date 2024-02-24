package com.ata.playFreeAPi.dao.impl;

import com.ata.playFreeAPi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerDao extends CrudRepository<User, Long> {
}
