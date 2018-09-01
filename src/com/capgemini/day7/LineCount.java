package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	File file = new File("C:\\madhu\\sai.txt");
	{
	try(FileReader fileReader=new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);)
	{
		String s ;
		while( (s = reader.readLine()) != null) {
		 String line[]=s.split(" ");
		int count = line.length;

	} 
	
		}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}