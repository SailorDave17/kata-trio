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
        String spokenWord = underTest.say(1);
        assertThat(spokenWord).isEqualTo("1");
    }

    @Test
    public void threeShouldReturnFizz() {
        String spokenWord = underTest.say(4);
        assertThat(spokenWord).isEqualTo("Fizz");
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
}
