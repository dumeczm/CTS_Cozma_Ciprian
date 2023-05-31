package tests;

import dubluri.FakePersoana;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicaDiscountTest {

    @Test
    void nuSeAplicaDiscountVarstniciTest() {
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setVarstaValue(6);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"",100.0);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(100.0,pachetTuristic.getPret());
    }

    @Test
    void seAplicaDiscountVarstniciTest() {
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setVarstaValue(70);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"",100.0);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(50.0,pachetTuristic.getPret());
    }
}