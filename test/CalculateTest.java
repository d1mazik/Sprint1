import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Här testar jag uträkningen

class CalculateTest {
    Cactus igge = new Cactus("Igge", 0.02);
    Palms laura = new Palms("Laura", 5);
    Carnivorousplant meatloaf = new Carnivorousplant("Meatloaf", 0.7);
    Palms putte = new Palms("Putte", 1);


    @Test
    void calculateLiquid() {

        assert(igge.calculateLiquid()== 0.02);
        assert(laura.calculateLiquid()== 2.5);
        assert(meatloaf.calculateLiquid()== 0.24);
        assert(putte.calculateLiquid()== 0.5);
    }
}