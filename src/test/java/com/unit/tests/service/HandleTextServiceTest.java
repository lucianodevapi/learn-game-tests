package com.unit.tests.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class HandleTextServiceTest {

    @InjectMocks
    private HandleTextService handleTextService;

    @Test
    public void numberOfCharsTest(){
        String result = handleTextService.numberOfChars("Java");
        assertEquals("Seu texto tem 4 letras!", result);
    }
    @Test
    public void getRandomNumber(){
        String result = handleTextService.getRandomNumber("John:");
        assertTrue(result.contains("John"));
    }
}
