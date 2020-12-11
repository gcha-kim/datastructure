package com.gcha.datastructure.stack;

import com.gcha.datastructure.linkedlist.ListNode;

public class ListNodeStack {

	//ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.
	//void push(int data)를 구현하세요.
	//int pop()을 구현하세요.
	
	//head tail이 햇갈린다..
	private ListNode head;
	
	public void push(int data) {
	
		if(head == null) {
			head = new ListNode(data);
		}else {
			ListNode newNode = new ListNode(data);
			newNode.setNextNode(head);
			
			head = newNode;
		}
	}
	
	//후입선
	public int pop() {
		
		if(head.getNextNode() == null) {
			System.out.println("출력할 데이터가 없습니다.");
		}
		int resultData=0;
		ListNode beforeEndNode = null;
		while(true) {
			if(head.getNextNode() != null && head.getNextNode().getNextNode() == null) {
				beforeEndNode = head.getNextNode();
			}else if(head.getNextNode() == null) {
				resultData = head.getData();
				break;
			}
			head = head.getNextNode(); 
		}
		
		beforeEndNode.setNextNode(null);
		
		
		return resultData;
	}
	
	public int getTopData() {
		return head.getData();
	}
	
	
}
