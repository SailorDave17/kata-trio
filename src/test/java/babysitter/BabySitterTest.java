package babysitter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BabySitterTest {
    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 18, 20);
        assertThat(wage).isEqualTo(12);
    }

    @Test
    public void oneHourBeforeMidnightAfterBedtimeShouldPay8(){
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(22, 23, 21);
        assertThat(wage).isEqualTo(8);
    }

    @Test
    public void oneHourAfterMidnightShouldPay16(){
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(24, 25, 21);
        assertThat(wage).isEqualTo(16);
    }

    @Test
    public void entireShiftShouldPay132(){
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 4, 20);
        assertThat(wage).isEqualTo(132);
    }
}
