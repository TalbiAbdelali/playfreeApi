package com.ata.playFreeAPi.controller;

import com.ata.playFreeAPi.dto.FieldDTO;
import com.ata.playFreeAPi.model.Field;
import com.ata.playFreeAPi.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fields")
public class FieldController {
    @Autowired
    FieldService fieldService;

    @GetMapping
    public ResponseEntity<List<Field>> getFields() {
        return ResponseEntity.ok().body(fieldService.getFields());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Field> getFields(@PathVariable Long id) {
        return ResponseEntity.ok().body(fieldService.getField(id));
    }

    @PutMapping
    public ResponseEntity<Field> addOrUpdateField(@RequestBody FieldDTO fieldDTO) {
        Field field = fieldService.addOrUpdateFiled(fieldDTO);
        return ResponseEntity.ok().body(field);
    }

    @DeleteMapping("/{id}")
    public void deleteField(@PathVariable Long id) {
        fieldService.deleteField(id);
    }
}
