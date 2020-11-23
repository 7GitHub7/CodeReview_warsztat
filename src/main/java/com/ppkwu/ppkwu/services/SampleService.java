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
}
