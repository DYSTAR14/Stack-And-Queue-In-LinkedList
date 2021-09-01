package com.blz.linkedlist;

import java.util.ArrayList;


public class LLOperations<K> {
	Node<K> head;

	public LLOperations<K> addFirst(LLOperations<K> myList, K element) {
		Node<K> newNode = new Node<K>(element);
		if (head == null) {
			head = newNode;
			System.out.println("Enter Value at Start:" + newNode.data);
		} else {
			newNode.next = head;
			head = newNode;
			System.out.println("Enter Value at Start:" + newNode.data);
		}
		return myList;
	}
	

	public LLOperations<K> addLast(LLOperations<K> myList, K element) {
		Node<K> newNode = new Node<K>(element);
		if (head == null) {
			head = newNode;
			System.out.println("Enter Value at End:" + newNode.data);
		} else {
			Node<K> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			System.out.println("Enter Value at End:" + newNode.data);
		}
		return myList;	
	}
	
	public LLOperations<K> addAtNthPos(LLOperations<K> list,K data,int pos) {
		Node<K> newNode = new Node<K>(data);
		int counter = 0;
		if(head == null) {
			head = newNode;
		}
		else if(counter <= pos) {
			Node<K> temp = head;
			while(temp.next != null && counter < pos-1) {
				counter++;
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println("Enter Value at "+pos+" : "+ newNode.data);
		}
		return list;	
	}
	
	public LLOperations<K> deleteFirst(LLOperations<K> list) {
		if(head == null) {
			System.out.println("List is Empty");
		}
		Node<K> temp = head;
		head = temp.next;
		temp.next = null;
		return list;
	}
	
	public LLOperations<K> deleteLast(LLOperations<K> list) {
		if(head == null) {
			System.out.println("List is Empty");
		}
		Node<K> temp = head;
		Node<K> last = head;
		while (temp.next != null) {
			last = temp;
			temp = temp.next;
		}
		last.next = null;
		return list;
	}
	
	public LLOperations<K> deleteAtNthPos(LLOperations<K> list,int pos) {
		int counter = 0;
		if(head == null) {
			System.out.println("List is Empty");
		}
		else if(counter == pos) {
			Node<K> temp = head;
			head = temp.next;
			temp.next = null;
		}
		else if(counter < pos) {
			Node<K> temp = head;
			Node<K> last = head;
			while(temp.next != null && counter < pos) {
				counter++;
				last = temp;
				temp = temp.next;
			}
			last.next = temp.next;
			temp.next = null;
		}
		return list;
	}
	
	public ArrayList<K> display(LLOperations<K> myList) {
		ArrayList<K> myListDisplay = new ArrayList<K>();
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			Node<K> temp = head;
			while (temp.next != null) {
				myListDisplay.add(temp.data);
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
			myListDisplay.add(temp.data);
		}
		return myListDisplay;
	}


	public K searchElement(LLOperations<K> list, K element) {
		if (head == null) {
			System.out.println("List is Empty");
			return null;
		} else {
			Node<K> temp = head;
			while (temp.next != null ) {
				if(temp.data == element) {
					return temp.data;	
				}
				else {
					temp = temp.next;					
				}
			}
			return temp.data;
		}
	}

}
