package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileReading {

	public static void main(String[] args) {
		List<String> file = Arrays.asList();
		
		      // Creates a reader using the FileReader
		      try(BufferedReader br = Files.newBufferedReader(Paths.get("D:\\file.txt"))){
		     file=br.lines().collect(Collectors.toList());
		    	  
		      } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      file.forEach(System.out::println);
		  
	}

}
