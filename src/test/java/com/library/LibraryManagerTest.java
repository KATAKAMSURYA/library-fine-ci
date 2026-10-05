package com.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryManagerTest {

    LibraryManager library = new LibraryManager();

    @Test
    void testCalculateFine() {
        assertEquals(25.0, library.calculateFine(5));
    }

    @Test
    void testBookAvailability() {
        assertTrue(library.isBookAvailable(3));
        assertFalse(library.isBookAvailable(0));
    }

    @Test
    void testBorrowStatus() {
        assertEquals("On Time", library.getBorrowStatus(0));
        assertEquals("Overdue", library.getBorrowStatus(4));
    }
}
