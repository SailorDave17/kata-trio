package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        if (startingHour <= 4) {
            startingHour += 24;
        }
        if (startingHour < bedtime) {
            return 12;
        }
        return 0;
    }
}


