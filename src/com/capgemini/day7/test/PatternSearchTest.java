package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.PatternSearch;

class PatternSearchTest {
		@Test
		void testPatternSearch() throws FileNotFoundException, IOException {
			File file = new File("C:\\madhu\\sai.txt");
					
			assertEquals("Line number 6 : import java.util.Objects;\n", PatternSearch.findString(file,"import"));
		}
	}
