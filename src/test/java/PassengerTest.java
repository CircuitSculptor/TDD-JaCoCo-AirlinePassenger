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
    void testTitleSuccess()
    {
        assertEquals("Mr", myPass.getTitle());
        Passenger myPass2 = new Passenger("Ms", "Bartek", "Drapinski");
        assertEquals("Ms", myPass2.getTitle());
        Passenger myPass3 = new Passenger("Mrs", "Bartek", "Drapinski");
        assertEquals("Mrs", myPass3.getTitle());
    }

    @ParameterizedTest
    @ValueSource(strings= {"Mr", "Mrs", "Ms"})
    void testTitleSuccessv2(String title)
    {
        Passenger myPass4 = new Passenger(title, "Bartek", "Drapinski");
    }

    @Test
    void testTitleFailure()
    {
        //Mr, Mrs or Ms
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Dr", "Bartek", "Drapinski");});
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("", "Bartek", "Drapinski");});
    }

}
