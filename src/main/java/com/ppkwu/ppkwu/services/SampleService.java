package com.ppkwu.ppkwu.services;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@NoArgsConstructor
public class SampleService {

    public String reverse(String stringToReverse, String reverseToString) {
        String reverse = "";
        char temp;
      for (int inputStringLength = stringToReverse.length() - 1; inputStringLength >= 0; inputStringLength--) {
            if(inputStringLength == 1) {
                temp = reverse.charAt((int)inputStringLength);
            }
            reverse = reverse + stringToReverse.charAt((int) inputStringLength);
        }
        return reverse;
    }

    public HashMap recognizeCharacter(String stringToRecognize) {
        ArrayList digits = new ArrayList();
        ArrayList lettersOne = new ArrayList();
        ArrayList lettersTwo = new ArrayList();
        ArrayList signs = new ArrayList();

        HashMap hashMap = new HashMap();

        for (int i = 0; i < stringToRecognize.length(); i++) {

            if (Character.isDigit(stringToRecognize.charAt(i))) {
                digits.add(stringToRecognize.charAt(i));
            } else if (Character.isLowerCase(stringToRecognize.charAt(i))) {
                lettersOne.add(stringToRecognize.charAt(i));
            } else if(i == stringToRecognize.length()){
                break;
            } else if (Character.isUpperCase(stringToRecognize.charAt(i))) {
                lettersTwo.add(stringToRecognize.charAt(i));
            } else {
                signs.add(stringToRecognize.charAt(i));
            }
        }

        hashMap.put("digits", digits);
        hashMap.put("lowercaseletters", lettersOne);
        hashMap.put("uppercaseletters", lettersTwo);
        hashMap.put("signs", signs);

        return hashMap;
    }
}
