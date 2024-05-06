package com.ata.playFreeAPi.service;


import com.ata.playFreeAPi.dto.FieldDTO;
import com.ata.playFreeAPi.model.Field;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

class FieldServiceTest {

    FieldService fieldService = mock(FieldService.class);
    List<Field> fields = null;
    FieldDTO fieldDTO = null;

    @BeforeEach
    public void setUp() {
        fields = List.of(new Field(1, "Aix", true, "Ruocco"));
        fieldDTO = new FieldDTO(1, "Aix", true, "Ruocco");
    }

    @Test
    void testGetFieldsOk() {
        when(fieldService.getFields()).thenReturn(fields);
        assertEquals("Ruocco", fieldService.getFields().getFirst().getName());
    }

    @Test
    void testGetFieldsKo() {
        List<Field> fieldList = new ArrayList<>();
        when(fieldService.getFields()).thenReturn(fieldList);
        assertEquals(0, fieldService.getFields().size());
    }

    @Test
    void testGetFiledOk() {
        Field field1 = fields.getFirst();
        when(fieldService.getField(anyLong())).thenReturn(field1);
        assertNotNull(fieldService.getField(anyLong()));
    }

    @Test
    void testGetFiledKo() {
        when(fieldService.getField(anyLong())).thenReturn(null);
        assertNull(fieldService.getField(anyLong()));
    }

    @Test
    void testAddOrUpdateFieldOk() {
        Field field1 = fields.getFirst();
        when(fieldService.addOrUpdateFiled(fieldDTO)).thenReturn(field1);
        assertEquals("Aix", fieldService.addOrUpdateFiled(fieldDTO).getLocation());
    }

    @Test
    void testAddOrUpdateFieldKo() {
        when(fieldService.addOrUpdateFiled(any(FieldDTO.class))).thenReturn(null);
        assertNull(fieldService.addOrUpdateFiled(any(FieldDTO.class)));
    }

    @Test
    void testDelete() {
        //TODO
    }

    @AfterEach
    void setDown(){
        fieldService = null;
        fields = null;
        fieldDTO = null;
    }
}
