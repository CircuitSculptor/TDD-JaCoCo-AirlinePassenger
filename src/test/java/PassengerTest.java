import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {
    Passenger myPass;

    @BeforeEach
    void setup()
    {
        myPass = new Passenger("Mr", "Bartek", "Drapinski");
    }

    @Test
    void ConstructorSuccess()
    {
        assertEquals("Mr", myPass.getTitle());
        assertEquals("Bartek", myPass.getFirstName());
        assertEquals("Drapinski", myPass.getLastName());
    }

    @Test
    void testTitle()
    {
        //Mr, Mrs or Ms
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Dr", "Bartek", "Drapinski");});
    }

}
