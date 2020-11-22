package fizz_buzz;

public class FizzBuzz {

    public String say(Integer number) {

        if ((number % 3 ==0) && (number % 5 ==0)){
            return  "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }
        if(number % 5 ==0){
            return "Buzz";
        }
        if(number % 7 == 0){
            return "Qix";
        }




        return "" + number;
    }
}
