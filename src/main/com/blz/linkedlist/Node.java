package com.blz.linkedlist;

public class Node<K> {
	K data;
	Node<K> next;

	public Node(K element) {
		data = element;
		next = null;
	}
}
