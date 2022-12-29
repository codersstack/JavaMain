package com.csstack.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is a simple example to display predefined activities of a week.

 * What you learn in this program?
 * 
 *   - The conditional statement : switch and break
 *   - Simple methods and method signature
 *   - Calling methods from other methods
 *   - Java Date class to get today's date.
 *   - Building your own simple weekly TimeTable
 *
 *
 *  
 * -- Add your own activities for the week in the printTodaysActivities method.
 * -- Run the program each day to see the activities for the day.
 *
 *
 */
public class WeeklyTimeTable
{        
	public static void main(String str[]){        

		printTodaysActivities(dayOfTheMonth()) ;

	}

	public static void printTodaysActivities(String today){

		switch(today){

		case "Monday" :
			System.out.println("Monday activity") ;
			break ;

		case "Tuesday" :
			System.out.println("Tuesday activity") ;
			break ;

		case "Wednesday" :
			System.out.println("Wednesday activity") ;
			break ;

		case "Thursday" :
			System.out.println("Thursday activity") ;
			break ;

		case "Friday" :
			System.out.println("Friday activity") ;
			break ;

		case "Saturday" :
			System.out.println("Saturday activity") ;
			break ;

		case "Sunday" :
			System.out.println("Sunday activity") ;
			break ;   
		}
	}

	public static String dayOfTheMonth() {        
		Date today = new Date() ;
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEE") ;
		String day = sdf.format(today) ;
		return day ;
	}
}

