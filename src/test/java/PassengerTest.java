import org.junit.jupiter.api.BeforeEach;

public class PassengerTest {
    Passenger myPass;

    @BeforeEach
    void setup()
    {
        myPass = new Passenger("Mr", "Bartek", "Drapinski");
    }

}
