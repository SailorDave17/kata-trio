package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        if (startingHour <= 4) {
            startingHour += 24;
        }
        if (endingHour <= 4) {
            endingHour += 24;
        }
        int wages = 0;
        for (int i = startingHour; i < endingHour; i++) {
            wages += getHourlyRate(i, bedtime);
        }
        return wages;
    }

    private int getHourlyRate(int hour, int bedtime) {
        if (hour <= 4) {
            hour += 24;
        }
        if (hour < bedtime) {

            return 12;
        } else if (hour >= bedtime && hour < 24) {
            return 8;

        } else if (hour >= 24) {
            return 16;
        }
        return 0;

    }
}





