package com.gcha.datastructure.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.gcha.datastructure.stack.ListNodeStack;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class QueueTest {
	
	
	@Test
	void arra_queue_add_poll() {
		Queue queue = new Queue(3);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		queue.poll();
		
		assertEquals(queue.getQueueArr()[0], 2);
	
	}
	
	@Test
	void listnode_queue_add_poll() {
		
		ListNodeQueue q = new ListNodeQueue();
		
		q.add(1);
		q.add(2);
		q.poll();
		assertEquals(2, q.getTail().getData());
	
	}
}
