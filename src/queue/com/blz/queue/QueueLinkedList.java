package com.blz.queue;

import java.util.Scanner;

import com.blz.linkedlist.LLOperations;

public class QueueLinkedList {

	public static LLOperations<Integer> list = new LLOperations<Integer>();
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Queue World");
		System.out.println("1.Queue\n2.DeQueue" + 
		"3.Display Stack\n0.Exit");
		int exit = 1;
		while (exit != 0) {
			System.out.println("Select From Option");
			int option = SC.nextInt();
			switch (option) {
			case 0:
				exit = 0;
				System.out.println("Thank you For\nParticipation Queue.");
				break;
			case 1:
				System.out.println("Enter Value");
				list.addLast(list, SC.nextInt());
				break;
			case 3:
				list.display(list);
				break;
			default:
				break;
			}
		}
	}
}
