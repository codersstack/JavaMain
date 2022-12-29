package com.csstack.datastructures;

import java.util.LinkedList;
import java.util.Queue ;

/**
 * 
 * Queue is First In First Out Data structure.
 *
 */
public class TicketQueue
{   
    public static void main(String str[]){
        Queue<String> ticketQueue = new LinkedList<String>() ;        
        ticketQueue.add("A") ;
        ticketQueue.add("B") ;
        ticketQueue.add("C") ;
        
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        
    }
}
