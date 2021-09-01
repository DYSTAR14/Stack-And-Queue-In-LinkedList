package com.blz.stack;

import java.util.Scanner;

import com.blz.linkedlist.LLOperations;

public class StackLinkedList {
	public static LLOperations<Integer> list = new LLOperations<Integer>();
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Stack World");
		System.out.println("1.Push\n2.Pop\n3.Peek\n" + 
		"4.Display Stack\n0.Exit");
		int exit = 1;
		while (exit != 0) {
			System.out.println("Select From Option");
			int option = SC.nextInt();
			switch (option) {
			case 0:
				exit = 0;
				System.out.println("Thank you For\nParticipation LinkedList.");
				break;
			case 1:
				System.out.println("Enter Value");
				list.addLast(list, SC.nextInt());
				break;
			case 2:
				System.out.println("Enter Value");
				list.deleteLast(list);
				break;
			case 3:
				System.out.println("Enter Value");
				list.peek(list);
				break;
			case 4:
				list.display(list);
				break;
			default:
				break;
			}
		}

	}

}
