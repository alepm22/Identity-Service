package com.example.examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentityServiceTest {

    @Test
    @DisplayName("Verify an existent ci")
    void verifyExistence() {
        IdentityService identityService = new IdentityService();
        assertEquals(identityService.verifyExistence(1), true);
    }
    @Test
    @DisplayName("Verify an not existent ci")
    void verifyUnExistence() {
        IdentityService identityService = new IdentityService();
        assertEquals(identityService.verifyExistence(5), false);
    }
}