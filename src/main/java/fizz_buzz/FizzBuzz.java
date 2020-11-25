package fizz_buzz;

public class FizzBuzz {

    public String say(Integer number) {

        if (number < 0){
            return "You said a negative number. Say a positive number, please!";
        }


        if (number % 220 == 0) {
            return "FizzBuzzBang";}

            if (number % 20 == 0) {
                return "FizzBuzz";
            }
            if (number % 44 == 0) {
                return "FizzBang";

            }

            if (number % 4 == 0) {
                return "Fizz";
            }
            if (number % 5 == 0) {
                return "Buzz";
            }
            if (number % 11 == 0) {
                return "Bang";
            }

            return "" + number;
        }
    }



