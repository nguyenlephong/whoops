package com.whoops.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ds.stack.*;

import java.util.Stack;

@SpringBootApplication
public class StudentsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StudentsApplication.class, args);
		DSStack<String> dsStack = new DSStack<String>();
		dsStack.push("Nguyen");
		dsStack.push("Le");
		dsStack.push("Phong");
		System.out.println("Initial Stack: " + dsStack);

		System.out.println("Peek element: " + dsStack.peek());

		// Removing elements using pop() method
		System.out.println("Popped element: " + dsStack.pop());

		// Creating an empty Stack
		Stack<Integer> stack = new Stack<Integer>();

		// Use add() method to add elements
		stack.push(10);
		stack.push(15);
		stack.push(30);
		stack.push(20);
		stack.push(5);

		// Displaying the Stack
		System.out.println("Initial Stack: " + stack);

		// Removing elements using pop() method
		System.out.println("Popped element: "
				+ stack.pop());
		System.out.println("Popped element: "
				+ stack.pop());

		// Displaying the Stack after pop operation
		System.out.println("Stack after pop operation "
				+ stack);
	}

}
