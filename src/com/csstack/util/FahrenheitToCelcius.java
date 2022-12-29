package com.csstack.util;

import java.util.Scanner;
/**
 * 
 * Celsius = (Fahrenheit -32)* (5.0/9)
 *
 */
public class FahrenheitToCelcius
{
	public static void main(String[] args) {
		Scanner celsiusScanner = null ;
		try {
			celsiusScanner = new Scanner(System.in);
			System.out.print("Enter a degree in Fahrenheit: ");
			double inFahrenheit = celsiusScanner.nextDouble();
			double celsius = (inFahrenheit - 32) * (5.0 / 9) ;
			System.out.println(String.format("%s Fahrenheit = %s Celsius", inFahrenheit , celsius));
		}finally {
			celsiusScanner.close() ;
		}
	}
}

