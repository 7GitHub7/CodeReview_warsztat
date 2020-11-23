package com.ppkwu.ppkwu.services;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@NoArgsConstructor
public class SampleService {

    public String reverse(String stringToReverse) {
        StringBuilder toReverse = new StringBuilder(stringToReverse);
        return toReverse.reverse().toString();
    }

    public HashMap recognizeCharacter(String stringToRecognize) {
        ArrayList digits = new ArrayList();
        ArrayList lettersLowerCase = new ArrayList();
        ArrayList lettersUpperCase = new ArrayList();
        ArrayList signs = new ArrayList();

        HashMap hashMap = new HashMap();

        for (int i = 0; i < stringToRecognize.length(); i++) {
            if (Character.isDigit(stringToRecognize.charAt(i))) {
                digits.add(stringToRecognize.charAt(i));
            } else if (Character.isLowerCase(stringToRecognize.charAt(i))) {
                lettersLowerCase.add(stringToRecognize.charAt(i));
            }  else if (Character.isUpperCase(stringToRecognize.charAt(i))) {
                lettersUpperCase.add(stringToRecognize.charAt(i));
            } else {
                signs.add(stringToRecognize.charAt(i));
            }
        }

        hashMap.put("digits", digits);
        hashMap.put("lowercaseletters", lettersLowerCase);
        hashMap.put("uppercaseletters", lettersUpperCase);
        hashMap.put("signs", signs);

        return hashMap;
    }
}
