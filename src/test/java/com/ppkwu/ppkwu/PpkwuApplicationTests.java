package com.ppkwu.ppkwu;

import com.ppkwu.ppkwu.services.SampleService;
import org.assertj.core.internal.Maps;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class PpkwuApplicationTests {
	private SampleService sampleService;

	@Before
	public void setUp() {
		sampleService = new SampleService();
	}

	@Test()
	public void test01reverse() {
		String input = "12345";
		String expected = "54321";
		String result = sampleService.reverse(input);
		assertEquals(expected,result);
	}

	@Test()
	public void test02recognizeCharacter() {
		String input = "1+aB";

		HashMap expectedMap = new HashMap();
		ArrayList digits = new ArrayList();
		ArrayList lowerCaseLetters = new ArrayList();
		ArrayList upperCaseLetters = new ArrayList();
		ArrayList signs = new ArrayList();

		expectedMap.put("digits", digits);
		expectedMap.put("lowercaseletters", lowerCaseLetters);
		expectedMap.put("uppercaseletters", upperCaseLetters);
		expectedMap.put("signs", signs);

		digits.add(input.charAt(0));
		signs.add(input.charAt(1));
		lowerCaseLetters.add(input.charAt(2));
		upperCaseLetters.add(input.charAt(3));


		HashMap resultMap = sampleService.recognizeCharacter(input);
		assertTrue(expectedMap.equals(resultMap));


	}

}
