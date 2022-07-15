package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class QueryProcessorTest {

	private final QueryProcessor queryProcessor = new QueryProcessor();

	@Test
	void testEmptyStringIfCannotProcessQuery() {
		assertEquals("", queryProcessor.process("test"));
	}

	@Test
	void testKnowsAboutShakespeare() {
		String actual = queryProcessor.process("Shakespeare");
		if (!actual.contains("playwright")) {
			fail("The QueryProcessor does not know about Shakespeare.");
		}
	}

	@Test
	void isNotCaseSensitive() {
		String actual = queryProcessor.process("shakespeare");
		if (!actual.contains("playwright")) {
			fail("Your QueryProcessor should not be case sensitive.");
		}
	}

//	@Test
//	void testAddNumbers() {
//		String actual = queryProcessor.process("what is 15 plus 27");
//		if (!actual.contains("42")) {
//			fail("Does not add correctly");
//		}
//	}
//
//	@Test
//	void testLargestNumber() {
//		String actual = queryProcessor.process("which of the following numbers is the largest: 31, 646");
//		if (!actual.contains("646")) {
//			fail("Does not get largest");
//		}
//	}

}
