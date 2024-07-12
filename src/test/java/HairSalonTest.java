import org.example.unitTest.HairSalon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] openingDays = hairSalon.getOpeningDays();
        assertEquals(2, openingDays.length);
        assertEquals("Monday", openingDays[0]);
        assertEquals("Tuesday", openingDays[1]);
    }
    @Test
    public void testGetOpeningDays2() {
        String[] actual = hairSalon.getOpeningDays();
        String[] expected = {"Monday", "Tuesday"};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void testIsOpenOnMonday() {
        assertEquals(true, hairSalon.isOpen("Monday"));
    }
    @Test
    public void testIsOpenOnTuesday() {
        assertEquals(true, hairSalon.isOpen("Tuesday"));
    }
    @Test
    public void testIsOpenOnWednesday() {
        assertEquals(false, hairSalon.isOpen("Wednesday"));
    }
}
