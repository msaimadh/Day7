package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.WordCount;
class WordCountTest {
@Test
void testWordCount() {
	File file = new File("C:\\madhu\\ben.txt");
	{

	assertEquals(3, WordCount.countWords(file));
}
}
}