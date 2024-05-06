package com.ata.playFreeAPi.service;

import com.ata.playFreeAPi.dao.FieldRepository;
import com.ata.playFreeAPi.dto.FieldDTO;
import com.ata.playFreeAPi.model.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FieldService {
    @Autowired
    private FieldRepository fieldRepository;

    public List<Field> getFields() {
        List<Field> fields = new ArrayList<>();
        fieldRepository.findAll().forEach(fields::add);
        return fields;
    }

    public Field getField(Long id) {
        return fieldRepository.findById(id).orElse(null);
    }

    public Field addOrUpdateFiled(FieldDTO fieldDTO) {
        if(fieldDTO == null) {
            return null;
        }
        return fieldRepository.save(convertToFiledEntity(fieldDTO));
    }

    public void deleteField(Long id) {
        fieldRepository.deleteById(id);
    }

    public Field convertToFiledEntity(FieldDTO fieldDTO) {
        return new Field(
                fieldDTO.getId(),
                fieldDTO.getLocation(),
                fieldDTO.isAvailability(),
                fieldDTO.getName());
    }

    public FieldDTO convertToFiled(Field field) {
        return new FieldDTO(
                field.getId(),
                field.getLocation(),
                field.isAvailability(),
                field.getName());
    }

}
