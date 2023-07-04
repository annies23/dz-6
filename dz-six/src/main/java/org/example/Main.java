package org.example;

public class Main {
    public static void main(String[] args) {

        String [] arrayOfSrting = {"мама", "папа", "їж їжак желе"};
        int count = 0;

        char [] preFinalResult = new char [(arrayOfSrting[0].length()+arrayOfSrting[1].length()) / 2];
        int counterForPreFinalResult=0;
        for (int i = 0 ; i < arrayOfSrting.length; i++)
        {
            if (count == 2)
            {
                break;
            }
            char[] itemCharArray = arrayOfSrting[i].toCharArray();
            // char a1;
            for (int j = 0 ; j < itemCharArray.length; j++) {
                char a1 = itemCharArray[j];
                int countOfUniqueChar = 0;
                for (int k = j + 1 ; k < itemCharArray.length; k++) {
                    char a2 = itemCharArray[k];
                    if (a1 == a2)
                    {
                        countOfUniqueChar++;

                    }
                }
                if (countOfUniqueChar%2 == 0)
                {
                    preFinalResult[counterForPreFinalResult] = a1;
                    counterForPreFinalResult++;
                }
            }
            count++;
        }

        char[] finalResult = new char[preFinalResult.length];
        int uniqueCount = 0;

        for (int i = 0; i < preFinalResult.length; i++) {
            char a1 = preFinalResult[i];
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (finalResult[j] == a1) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                finalResult[uniqueCount] = a1;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = finalResult[i];
        }
    }
}