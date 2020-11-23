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
        ArrayList Digits = new ArrayList();
        ArrayList Letters1 = new ArrayList();
        ArrayList Letters2 = new ArrayList();
        ArrayList SIGNS = new ArrayList();

        HashMap hashMap = new HashMap();

        for (int i = 0; i < string_To_Recognize.length(); i++) {
            if (Character.isDigit(string_To_Recognize.charAt(i))) {
                Digits.add(string_To_Recognize.charAt(i));
            } else if (Character.isLowerCase(string_To_Recognize.charAt(i))) {
                Letters1.add(string_To_Recognize.charAt(i));
            }else if(i == string_To_Recognize.length()){
                break;
            }else if (Character.isUpperCase(string_To_Recognize.charAt(i))) {
                Letters2.add(string_To_Recognize.charAt(i));
            } else {
                SIGNS.add(string_To_Recognize.charAt(i));
            }
        }

        hashMap.put("digits", Digits);
        hashMap.put("lowercaseletters", Letters1);
        hashMap.put("uppercaseletters", Letters2);
        hashMap.put("signs", SIGNS);
       return hashMap;

    }
}
