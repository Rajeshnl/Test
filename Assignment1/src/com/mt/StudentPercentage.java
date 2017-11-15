package com.mt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentPercentage {
	
	public static void main(String[] args) {
		try {
		//Input stream from the system console
		InputStreamReader reader = new InputStreamReader(System.in);
		
		//BufferReader reads the input 
		BufferedReader bfReader = new BufferedReader(reader);
		
		System.out.println("Enter the Student Name: ");
		
		//Read the name and Storing the student name to the name variable
		String strName = bfReader.readLine();
		
		System.out.println("Enter the Mathematics marks");
		//Read the maths marks from the console and store it into variable
		int mathsMarks = Integer.parseInt(bfReader.readLine());
		
		System.out.println("Enter the English marks");
		//Read the maths marks from the console and store it into variable
		int englishMarks = Integer.parseInt(bfReader.readLine());
		
		System.out.println("Enter the Science marks");
		//Read the maths marks from the console and store it into variable
		int scienceMarks = Integer.parseInt(bfReader.readLine());
		
		System.out.println("Enter the Social Science marks");
		//Read the maths marks from the console and store it into variable
		int socialScienceMarks = Integer.parseInt(bfReader.readLine());
		
		
		//Total marks is calculated and store it in an integer variable
		int total =mathsMarks+englishMarks+scienceMarks+socialScienceMarks;
				
		System.out.println("Total: "+total);
		total=total/4;
		
		String grade = null;
		if(total <40){
			grade="Poor Grade";
			
		}else if(total>=40 && total<59){
			grade="Average";
		}else if(total>=60 && total<79){
			grade="Good";
		}else if(total>=80 && total<89){
			grade="Very Good ";
		}else if( total>=90 ){
			grade="Excellent ";
		}
		
		
		System.out.println(strName +" percentage is : "+total + "% and his grade is: "+grade);
		
		
		
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
