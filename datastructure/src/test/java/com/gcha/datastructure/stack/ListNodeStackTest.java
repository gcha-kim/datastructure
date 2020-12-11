package com.gcha.datastructure.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListNodeStackTest {
	

	@Test
	@DisplayName("ListNodeStac push and pop")
	void push_pop() {
		ListNodeStack stack = new ListNodeStack();
		
		stack.push(1);
		stack.push(2);
		stack.pop();
		assertEquals(1, stack.getTopData());
		
	}
	
}
