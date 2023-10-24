package com.demo.DataStructure;

import java.util.Scanner;

//single linked list inserting in the front of the list;
public class LIstDataStructure {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void pushEle(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	public void pushEleEnd(int newData) {
		Node newNode = new Node(newData);
		
		if(head== null) {
			head=newNode;
			return;
		}
		Node cur=head;
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.next = newNode;
		
	}
  
	public void pushEleAtGivenPoint(int newData,int pos) {
		Node temp=head;
		if(pos==1) {
			Node newNode= new Node(newData);
			newNode.next=head;
			head=newNode;
			
		}
		else {
			for(int i=1;i<pos-1;i++){
				
				temp=temp.next;
			}
			Node newNode= new Node(newData);
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}

	public void display() {
		Node temp = head;
		System.out.println(head);
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		LIstDataStructure l = new LIstDataStructure();
		System.out.print("enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("enter the  elements");
		for (int i = 0; i < n; i++) {

			int ele = sc.nextInt();
			//l.pushEle(ele);
			l.pushEleEnd(ele);
			
		}
		l.display();
		System.out.print("enter the  elements to be inserted and pos");
		int n1 = sc.nextInt();
		int pos = sc.nextInt();
		l.pushEleAtGivenPoint(n1, pos);
		l.display();
	}
}
