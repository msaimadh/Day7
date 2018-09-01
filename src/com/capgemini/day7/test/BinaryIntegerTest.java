package com.capgemini.day7.test;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.BinaryInteger;


class BinaryIntegerTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\madhu\\sai.txt");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}