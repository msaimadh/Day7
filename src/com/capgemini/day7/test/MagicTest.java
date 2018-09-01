package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Magic;

class MagicTest {

		@Test
		void test() {
			assertEquals(true, Magic.checkMagic(4,4,16));
			assertEquals(false, Magic.checkMagic(2,6,14));
		}
	}

