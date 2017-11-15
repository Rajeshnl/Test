package com.mt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BidProperty {
public static void main(String[] args) {
	try {
		//Input stream from the system console
		InputStreamReader reader = new InputStreamReader(System.in);
		
		//BufferReader reads the input 
		BufferedReader bfReader = new BufferedReader(reader);
		System.out.println("Enter the Michael Bid amount");
		
		//Read the Michael bid amount 
		double michaelAmount = Double.parseDouble(bfReader.readLine());
		
		System.out.println("Enter the Bruce Bid amount");
		
		//Read the Bruce bid amount 
		double bruceAmount = Double.parseDouble(bfReader.readLine());
		
		if(michaelAmount>bruceAmount){
			System.out.println("Michael won the bid");
		}else{
			System.out.println("Bruce won the bid");
		}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
