package com.csstack.util;

/**
 * 
 * @author codersstack
 * Simple Timer Java Example
 *
 */
public class TimerExample
{

	public static void main(String str[]){        
		try {
			Thread.currentThread();
			System.out.println("Wake me up after 10 seconds");
			Thread.sleep(10000);
			System.out.println("Hey Wakeup!!! ");            
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
