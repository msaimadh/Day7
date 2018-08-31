package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class PathTest {
		@Test
		void testExistenceOfFile() {
			File file = new File("C:\\Users\\msaimadh\\Downloads");
			assertEquals(true, file.exists());
			
		}
	}
