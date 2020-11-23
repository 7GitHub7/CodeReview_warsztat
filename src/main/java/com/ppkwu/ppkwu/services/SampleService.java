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

    public HashMap recognizeCharacter(String string_To_Recognize) {
       HashMap hashMap = new HashMap();
       return hashMap;

    }
}
