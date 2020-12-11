package com.gcha.datastructure.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
	
	
	private ListNode nextNode3;
	private ListNode nextNode2;
	private ListNode nextNode;
	private ListNode head;
	private LinkedList list;
	
	@Test
	@DisplayName("node get")
	void getNode() {
		LinkedList linkedList = new LinkedList();
		ListNode temp = linkedList.getNode(head, 2);
		assertEquals(2, temp.getData());	
	}
	
	@Test
	@DisplayName("node add")
	void add() {
		ListNode addNode = new ListNode(0);
		addNode = list.add(head, addNode, 2);
		assertEquals(addNode.getNextNode(), nextNode2);
	}
	
	@Test
	@DisplayName("node remove")
	void remove() {
		ListNode removeNode = nextNode2;
		head = list.remove(head, 1);
		assertEquals(head.getNextNode(), removeNode);
	}
	
	@Test
	@DisplayName("node contain")
	void contain() {
		boolean result = list.contains(head, nextNode3);
		System.out.println(result);
	}
	
	@BeforeEach
	void init() {
		this.nextNode3 = new ListNode(3);
		this.nextNode2 = new ListNode(2,nextNode3);
		this.nextNode = new ListNode(1,nextNode2);
		this.head = new ListNode(0,nextNode);
		this.list = new LinkedList();
	}
}
