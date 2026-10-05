package com.library;

public class LibraryManager {

    public double calculateFine(int overdueDays) {
        if (overdueDays <= 0) {
            return 0.0;
        }
        return overdueDays * 5.0;
    }

    public boolean isBookAvailable(int availableCopies) {
        return availableCopies > 0;
    }

    public String getBorrowStatus(int overdueDays) {
        if (overdueDays <= 0) {
            return "On Time";
        }
        return "Overdue";
    }
}
