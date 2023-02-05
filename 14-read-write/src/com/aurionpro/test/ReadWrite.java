package com.aurionpro.test;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadWrite {

	public static void main(String[] args) throws FileNotFoundException {

	
	
		FileWriter filewrite;
		try {
			filewrite=new FileWriter("D:\\krutika\\MyFile.txt",true);
		BufferedWriter bufferwrite=new BufferedWriter(filewrite);
		System.out.println("Writing"); 
		 
	 
		 bufferwrite.write("krutika Bane"); 
		 bufferwrite.close(); 
		 System.out.println("Written successfully"); 
		 } 
		
		 catch (IOException excpt) 
		 { 
		 excpt.printStackTrace(); 
		 } 
		//reading of file 
		File file = new File("D:\\krutika\\MyFile.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		 
		}

	}


