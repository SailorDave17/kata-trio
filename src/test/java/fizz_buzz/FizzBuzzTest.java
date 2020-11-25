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

    public void assertFizzBuzz(int numberToSay, String expectedResult) {
        String spokenWord = underTest.say(numberToSay);
        assertThat(spokenWord).isEqualTo(expectedResult);
    }

    @Test
    public void whenGiven1FizzBuzzSays1() {
        assertFizzBuzz(1, "1");
    }

    @Test
    public void fourShouldReturnFizz() {
        assertFizzBuzz(4, "Fizz");
    }

    @Test
    public void fiveShouldReturnBuzz(){
        assertFizzBuzz(5, "Buzz");
    }

    @Test
    public void elevenShouldReturnBang() {
        assertFizzBuzz(11, "Bang");
    }

    @Test
    public void fortyFourShouldReturnFizBang() {
        assertFizzBuzz(44, "FizzBang");
    }

    @Test
    public void twoHundredAndTwentyShouldReturnFizBuzzBang() {
        assertFizzBuzz(220, "FizzBuzzBang");
    }

    @Test
    public void negativeNumberShouldReturnPositiveNumberMessage(){
        assertFizzBuzz(-54654, "You said a negative number. Say a positive number, please!");
    }

    @Test
    public void twoShouldReturnTwo(){
        assertFizzBuzz(2, "2");
    }
}
