package tests;

import dubluri.StubPersoanaMajor;
import dubluri.StubPersoanaMinor;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PoateRezervaTest {

    @Test
    void unMinorNUpoateRezervaTest() {
        StubPersoanaMinor stubPersoana = new StubPersoanaMinor();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoana,"",0.00);
        assertEquals(false,pachetTuristic.poateRezerva());
    }

    @Test
    void unMajorPoateRezervaTest(){
        StubPersoanaMajor stubPersoana = new StubPersoanaMajor();
        PachetTuristic pachetTuristic = new PachetTuristic(stubPersoana,"",0.00);
        assertEquals(true,pachetTuristic.poateRezerva());
    }

}