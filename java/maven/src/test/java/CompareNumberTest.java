import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by Senela on 15-1-31.
 */
public class CompareNumberTest {
    @Test
    public void should_return_4A0B_when_getTips_given_input_is_1234_and_answer_is_1234() {
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.getTips("1234","1234")).isEqualTo("4A0B");
    }

    @Test
    public void should_return_0A4B_when_getTips_given_input_is_1234_and_answer_is_4321() {
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.getTips("1234","4321")).isEqualTo("0A4B");
    }

    @Test
    public void should_return_0A0B_when_getTips_given_input_is_1234_and_answer_is_5678() {
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.getTips("1234","5678")).isEqualTo("0A0B");
    }

    @Test
    public void should_return_1A0B_when_getTips_given_input_is_1234_and_answer_is_1567() {
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.getTips("1234","1567")).isEqualTo("1A0B");
    }


    @Test
    public void should_return_2A0B_when_getTips_given_input_is_1234_and_answer_is_1267() {
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.getTips("1234","1267")).isEqualTo("2A0B");
    }

    @Test
    public void  should_return_3A0B_when_getTips_given_input_is_1234_and_answer_is_1237() {
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.getTips("1234","1237")).isEqualTo("3A0B");
    }

    @Test
    public void  should_return_0A1B_when_getTips_given_input_is_1234_and_answer_is_4567() {
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.getTips("1234","4567")).isEqualTo("0A1B");
    }


    @Test
    public void should_return_0A2B_when_getTips_given_input_is_1234_and_answer_is_4367() {
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.getTips("1234","4367")).isEqualTo("0A2B");
    }
}
