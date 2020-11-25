package fizz_buzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Here are the rules for this kata:
 * <p>
 * -Write a method that takes an integer and returns a string. This represents the act of saying a number.
 * -The string should be the numerical characters that represent the value of the integer that was passed, EXCEPT:
 * -When the integer passed is a multiple of 3, the method should say Fizz.
 * -When the integer passed is a multiple of 5, the method should say Buzz.
 */
public class FizzBuzzTest {

    private FizzBuzz underTest;

    @BeforeEach
    void setUp() {
        underTest = new FizzBuzz();
    }

    @Test
    public void whenGiven1FizzBuzzSays1() {
        int numberToSay = 1;
        String expectedResult = "1";

        String spokenWord = underTest.say(numberToSay);
        assertThat(spokenWord).isEqualTo(expectedResult);
    }

    @Test
    public void threeShouldReturnFizz() {

        int numberToSay = 4;
        String expectedResult = "Fizz";

        String spokenWord = underTest.say(numberToSay);
        assertThat(spokenWord).isEqualTo(expectedResult);
    }

    @Test
    public void fiveShouldReturnBuzz(){
        String spokenWord = underTest.say(5);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void sevenShouldReturnBang() {
        String spokenWord = underTest.say(11);
        assertThat(spokenWord).isEqualTo("Bang");

    }

    @Test
    public void fifteenShouldReturnFizBang() {
        String spokenWord = underTest.say(44);
        assertThat(spokenWord).isEqualTo("FizzBang");


    }

    @Test
    public void fifteenShouldReturnFizBuzzBang() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(220);
        assertThat(spokenWord).isEqualTo("FizzBuzzBang");


    }

    @Test
    public void negativeNumberShouldReturnPositiveNumberMessage(){
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(-54654);
        assertThat(spokenWord).isEqualTo("You said a negative number. Say a positive number, please!");
    }
}
