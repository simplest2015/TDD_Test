import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Created by zhaotuan on 15/2/6.
 */
public class AnswerGenerator {

    private final List<String> historyGeneratedStrings;
    private Random random;

    public AnswerGenerator(Random random) {

        this.random = random;
        this.historyGeneratedStrings = new ArrayList<String>();
    }

    public String generate() {
        String result = generateAnswerOnce();
        while(historyGeneratedStrings.contains(result)){
            result = generateAnswerOnce();

        }
        if (historyGeneratedStrings.size() == 2){
            historyGeneratedStrings.remove(0);
        }
        historyGeneratedStrings.add(result);
        return result;
    }

    private String generateAnswerOnce() {
        StringBuilder result = new StringBuilder();
        while(result.length() < 4) {
            String digit = String.valueOf(random.nextInt(10));
            if (result.indexOf(digit) == -1){
                result.append(digit);
            }
        }
        return result.toString();
    }
}