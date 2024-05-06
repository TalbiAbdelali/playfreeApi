package com.ata.playFreeAPi.dao;

import com.ata.playFreeAPi.model.Field;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends CrudRepository<Field, Long> {

}
