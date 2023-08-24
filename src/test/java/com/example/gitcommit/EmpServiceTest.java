package com.example.gitcommit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EmpServiceTest {

    @InjectMocks
    private EmpService empService;

    @Test
    void add() {
        assertEquals(3, empService.add(1,2));


    }
}