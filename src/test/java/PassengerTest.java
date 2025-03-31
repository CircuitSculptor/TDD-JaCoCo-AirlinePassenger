import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    Passenger myPass;

    @BeforeEach
    void setup()
    {
        myPass = new Passenger("Mr", "Bartek", "Drapinski");
    }

    void ConstructorSuccess()
    {
        assertEquals("Mr", myPass.getTitle());
        assertEquals("Bartek", myPass.getFirstName());
        assertEquals("Drapinski", myPass.getLastName());
    }

}
