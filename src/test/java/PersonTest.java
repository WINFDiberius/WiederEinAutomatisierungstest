import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person daniel;

    @BeforeEach
    void setUp(){
        daniel = new Person("Daniel", "Sattler");
    }

    @Test
    void combineFirstandLast() {

        String danielsGanzerName = "Daniel Sattler";

        Assertions.assertEquals(danielsGanzerName, daniel.combineFirstandLast());

    }
}