import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by Senela on 15-1-31.
 */
public class GuessNumberTest {
    @Test
    public void  GuessNumberTest4A0B()
    {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.getTips("1234","1234")).isEqualTo("4A0B");
    }

    @Test
    public void  GuessNumberTest0A4B()
    {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.getTips("1234","4321")).isEqualTo("0A4B");
    }

    @Test
    public void  GuessNumberTest0A0B()
    {
        GuessNumber guessNumber = new GuessNumber();
        assertThat(guessNumber.getTips("1234","5678")).isEqualTo("0A0B");
    }

}
