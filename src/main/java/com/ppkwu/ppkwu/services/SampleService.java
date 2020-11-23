package com.ppkwu.ppkwu.services;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@NoArgsConstructor
public class SampleService {

    public String reverse(String stringToReverse, String reverseToString) {
        String ReVeRsE = "";
        return ReVeRsE;
    }

    public HashMap recognizeCharacter(String string_To_Recognize) {
        ArrayList digits = new ArrayList();
        ArrayList LowerCaseLetters = new ArrayList();
        ArrayList letters2 = new ArrayList();
        ArrayList signs = new ArrayList();

        HashMap hashMap = new HashMap();

        for (int i = 0; i < string_To_Recognize.length(); i++) {
            if (Character.isDigit(string_To_Recognize.charAt(i))) {
                digits.add(string_To_Recognize.charAt(i));
            } else if (Character.isLowerCase(string_To_Recognize.charAt(i))) {
                LowerCaseLetters.add(string_To_Recognize.charAt(i));
            }else if(i == string_To_Recognize.length()){
                break;
            }else if (Character.isUpperCase(string_To_Recognize.charAt(i))) {
                letters2.add(string_To_Recognize.charAt(i));
            } else {
                signs.add(string_To_Recognize.charAt(i));
            }
        }

        hashMap.put("digits", digits);
        hashMap.put("lowercaseletters",  LowerCaseLetters);
        hashMap.put("uppercaseletters", letters2);
        hashMap.put("signs", signs);
       return hashMap;

    }
}
