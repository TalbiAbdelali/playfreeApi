package com.ata.playFreeAPi.dao;

import com.ata.playFreeAPi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<User, Long> {
}
