import org.junit.Test;
import org.mockito.InOrder;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.api.Fail.fail;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by zhaotuan on 15/2/6.
 */
public class AnswerGeneratorTest {
    @Test
    public void should_generate_4_digits_string() {
        String result = new AnswerGenerator(new Random()).generate();
        assertThat(result.length()).isEqualTo(4);
    }

    @Test
    public void should_generate_number() {
        String result = new AnswerGenerator(new Random()).generate();
        try {
            Integer.parseInt(result);
        } catch (NumberFormatException e) {
            fail("return value should be number");
        }
    }

    @Test
    public void should_generate_no_duplicated_digits_string() {
        String result = new AnswerGenerator(new Random()).generate();

        for (int i = 0; i < result.length(); i++){
            assertThat(result.lastIndexOf(result.charAt(i))).isEqualTo(i);
        }
    }

    @Test
    public void should_not_repeat_in_3_times() {
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4)
                .thenReturn(1, 2, 3, 4)
                .thenReturn(2, 3, 4, 5)
                .thenReturn(3, 4, 5, 6);

        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        Set<String> result = new HashSet<String>();
        result.add(answerGenerator.generate());
        result.add(answerGenerator.generate());
        result.add(answerGenerator.generate());

        assertThat(result.size()).isEqualTo(3);

    }

    @Test
    public void should_result_repeatable_out_of_3_times(){
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4)
                .thenReturn(2, 3, 4, 5)
                .thenReturn(3, 4, 5, 6)
                .thenReturn(1, 2, 3, 4);
        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        Set<String> result = new HashSet<String>();
        result.add(answerGenerator.generate());
        result.add(answerGenerator.generate());
        result.add(answerGenerator.generate());
        result.add(answerGenerator.generate());
        assertThat(result.size()).isEqualTo(3);
    }

    @Test
    public void verify_inorder() {
        List list = mock(List.class);
        list.add(1);
        list.add(2);
        list.add(3);

        InOrder inOrder = inOrder(list);
        inOrder.verify(list).add(2);
        inOrder.verify(list).add(3);
//        inOrder.verify(list).add(2);


    }

}
