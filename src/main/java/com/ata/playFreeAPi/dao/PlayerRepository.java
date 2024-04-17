package com.ata.playFreeAPi.dao;

import com.ata.playFreeAPi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<User, Long> {
}
