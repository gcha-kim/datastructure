package com.gcha.datastructure.queue;

public class Queue {
//	배열을 사용해서 한번
//	ListNode를 사용해서 한번.
	
	private int[] queueArr;
	private int topIdx;
	public int[] getQueueArr() {
		return queueArr;
	}
	
	Queue(int size){
		this.queueArr = new int[size];
		this.topIdx = -1;
	}
	
	//data 추가
	public void add(int data) {
		queueArr[topIdx+1] = data;
		topIdx++;
		
	}
	
	//data 제거
	public int poll() {
		int pollData = 0;
		int[] newQueueArr = new int[queueArr.length];
		for(int i=0; i < queueArr.length ; i++) {
			
			if(i == 0) {
				pollData = queueArr[0];
			}else {
				newQueueArr[i-1] = queueArr[i];
			}
			
		}
		queueArr = newQueueArr;
		topIdx--;
		return pollData;
	}
	
}
