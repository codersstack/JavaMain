package com.csstack.datastructures;

/**
 * Create a BookStack program and add the books and print the books.
 * Stack - Last In First Out.
 */
import java.util.Stack;

public class BookStack {

	public static void main(String str[]) {

		Stack<String> bookStack = new Stack<String>() ;

		bookStack.push("Book1") ;
		bookStack.push("Book2") ;
		bookStack.push("Book3") ;

		System.out.println(bookStack.pop());
		System.out.println(bookStack.pop());
		System.out.println(bookStack.pop());
	}
}
