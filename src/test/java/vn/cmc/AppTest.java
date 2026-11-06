package vn.cmc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetingIsCorrect() {
        assertEquals("Hello Jenkins!", App.greeting());
    }

    @Test
    void addsPositiveNumbers() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void addsNegativeNumbers() {
        assertEquals(-5, App.add(-2, -3));
    }
}
