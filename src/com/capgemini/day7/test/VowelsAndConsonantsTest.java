package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.VowelsAndConsonants;

class VowelsAndConsonantsTest {
	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File("C:\\madhu\\ben.txt");
				

		assertEquals("Number of vowels = 8\nNumber of consonants = 12", VowelsAndConsonants.findVowelAndConsonant(file));
	}

}


