package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import com.capgemini.day7.MyDate;
import com.capgemini.day7.WeekDay;

class DateFormatTest {
	@Test
	void testWeekDay() {
	
			assertEquals("Saturday,September 01,2018",WeekDay.displayWeekDay());
			 
		}
}
