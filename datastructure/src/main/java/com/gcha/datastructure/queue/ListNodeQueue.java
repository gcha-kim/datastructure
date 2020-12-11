package com.gcha.datastructure.queue;

import com.gcha.datastructure.linkedlist.ListNode;

public class ListNodeQueue {

//	ListNode를 사용해서 한번.
	
private ListNode head;
	
	public void add(int data) {
	
		if(head == null) {
			head = new ListNode(data);
		}else {
			ListNode newNode = new ListNode(data);
			newNode.setNextNode(head);
			
			head = newNode;
		}
	}
	
	public int poll() {
		
		if(head.getNextNode() == null) {
			System.out.println("출력할 데이터가 없습니다.");
		}
		int resultData = 0;
		ListNode beforeTailNode = null;
		while(true) {
			if(head.getNextNode()!=null && head.getNextNode().getNextNode() == null) {
				beforeTailNode = head.getNextNode();
			}else if(head.getNextNode() == null) {
				resultData = head.getData();
				break;
			}else {
				head = head.getNextNode();
			}
		}
		beforeTailNode.setNextNode(null);
		
		
		
		return resultData;
	}
	
	public ListNode getTail() {

		while(true) {
			if(head.getNextNode() == null) {
				return head;
			}
			head = head.getNextNode();
		}
	}
	
	
}
