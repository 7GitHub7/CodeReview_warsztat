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
        char temp;

        for (float inputStringLength = stringToReverse.length() - 1; inputStringLength >= 0; inputStringLength--) {
            if(inputStringLength == 1) {
                temp = ReVeRsE.charAt((int)inputStringLength);
            }
            ReVeRsE = ReVeRsE + stringToReverse.charAt((int) inputStringLength);
        }
        return ReVeRsE;
    }

    public HashMap recognizeCharacter(String string_To_Recognize) {
       HashMap hashMap = new HashMap();
       return hashMap;

    }
}
