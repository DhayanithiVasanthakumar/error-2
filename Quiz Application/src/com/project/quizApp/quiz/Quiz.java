package com.project.quizApp.quiz;

import com.project.quizApp.question.*;

import java.util.HashMap;
import java.util.Map;

public class Quiz {
	public void logic() {
		
		/*
		 * questions in this format
		 * 
		 * Question class constructor
		 * 
		 * 	public Question(String question,   
		 * String option1, 
		 *  String option2,
		 *  String option3,
		 *  String option4)

		 */
		
		Question q1=new Question("1) Which of the following option leads to the portability and security of Java?","A. Bytecode is executed by JVM","B. The applet makes the Java code secure and portable","C. Use of exception handling","D. Dynamic binding between objects ");
		Question q2=new Question("Which of the following is not a Java features?",	
									"A. Dynamic",
									"B. Architecture Neutral",
									"C. Use of pointers",
				 					"D. Object-oriented");	
		
		Question q3=new Question("_____ is used to find and fix bugs in the Java programs.",
				
									"A. JVM",
									"B. JRE",
									"C. JDK",
									"D. JDB");
				
		Question q4=new Question("What is the return type of the hashCode() method in the Object class?",
				
									"A .Object",
									"B. int",
									"C. long",
				 					"D. void");
		
		
		
		
		/*
		 * create hash map ->to store the question and options 
		 * 
		 * inside the hashmap store 
		 * KEY -> question
		 * VALUE -> options ->  as a characte i,e A,B,C,D
		 */
		
		Map<Question,Character> hmap=new HashMap<>();
		
		hmap.put(q1, 'A');
		hmap.put(q2, 'C');
		hmap.put(q3, 'D');
		hmap.put(q4, 'B');
		
		
		for(Map.Entry<Question,Character> map:hmap.entrySet()) {
			map.getKey();
		}
		
	
		}
}
