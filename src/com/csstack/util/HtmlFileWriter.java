package com.csstack.util;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * 
 * HtmlFileWriter
 *
 */

public class HtmlFileWriter
{    
	static String htmlTemplate = "<!DOCTYPE html><html>" +
			"<body style=\"background-color:white;\"><h1 style=\"color:blue;text-align:center;\">" +
			"Welcome to <REPLACE_HEADER> Web Page !!!</h1>" +
			"<P style=\"color:green;\"><REPLACE_PARAGRAPH></p>" +
			"<center><button style=\"color:red;\" type=\"button\"onclick=\"document.getElementById('myid').innerHTML = Date()\">Display Date and Time.</button><p id=\"myid\"></p></center>" +
			"</body></html>" ;

	public static void main(String str[]) throws Exception {
		writeToHtmlFile("Student Name", "Output") ;     
	}

	public static void writeToHtmlFile(String name, String output) throws Exception {

		try (BufferedWriter br = new BufferedWriter(new FileWriter(String.format("C:\\javaoutput\\%s.html", name)))) {
			htmlTemplate = htmlTemplate.replaceAll("<REPLACE_HEADER>", name) ;
			htmlTemplate = htmlTemplate.replaceAll("<REPLACE_PARAGRAPH>", output) ;            
			br.write(htmlTemplate);
		}
		System.out.println("Html output file generated"); 
	}
}
