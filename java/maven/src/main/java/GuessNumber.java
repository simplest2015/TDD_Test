import java.lang.reflect.Array;

/**
 * Created by Senela on 15-1-31.
 */
public class GuessNumber {
    private String randomNumber;

    public String getTips(String input, String answer) {
        int length = input.length();
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < length; i++){

            if (input.charAt(i) == answer.charAt(i)) {
                aCount++;
            } else if (input.contains(answer.subSequence(i,i + 1))){
                System.out.print(answer.subSequence(i,i));
                bCount++;
            }
        }
        return aCount + "A" + bCount + "B";
    }

    public String getRandomNumber() {

        int index = 0;
        String randomNumber;

        do {

            randomNumber =String.valueOf( (int)(Math.random()*9000+1000) );
            System.out.println("RandomNumber：" + randomNumber);
//
//            String  firstString = randomNumber.substring(0, 1);
//            String  subString = randomNumber.substring(1, 4);
//
//            System.out.println(subString);
//            index = subString.indexOf(firstString);
//
//            if(index == -1)
//            {
//                String secondString = randomNumber.substring(1, 2);
//                subString =randomNumber.substring(0, 1) + randomNumber.substring(2,4);
//                index = subString.indexOf(secondString);
//            }
//
//            if(index == -1)
//            {
//                String thirdString = randomNumber.substring(2, 3);
//                subString =randomNumber.substring(0, 2) + randomNumber.substring(3,4);
//                index = subString.indexOf(thirdString);
//            }


            for(int i=0; i< randomNumber.length(); i++)
            {
                String compareString = randomNumber.substring(i, i+1);
                String subString = randomNumber.substring(0, i) + randomNumber.substring(i+1, randomNumber.length());
                index = subString.indexOf(compareString);
                if(index != -1)
                    break;
            }

        }while (index != -1);

        return randomNumber;
    }
}
