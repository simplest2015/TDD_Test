import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.api.Fail.fail;

/**
 * Created by zhaotuan on 15/2/6.
 */
public class AnswerGeneratorTest {
    @Test
    public void should_generate_4_digits_string() {
        String result = new AnswerGenerator().generate();
        assertThat(result.length()).isEqualTo(4);
    }

    @Test
    public void should_generate_number() {
        String result = new AnswerGenerator().generate();
        try {
            Integer.parseInt(result);
        } catch (NumberFormatException e) {
            fail("return value should be number");
        }
    }

    @Test
    public void should_generate_no_duplicated_digits_string() {
        String result = new AnswerGenerator().generate();

        for (int i = 0; i < result.length(); i++){
            assertThat(result.lastIndexOf(result.charAt(i))).isEqualTo(i);
        }
    }

}
