package cis232.lab;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.*;


public class Randomizer {

	public static void main(String[] args) throws IOException{
		
		File originalFile = new File("original_list.txt");
		Scanner input = new Scanner(originalFile);
		ArrayList<String> lines = new ArrayList<>();
		Random random = new Random();
		String filename = "randomizefiles.txt";
        FileWriter writefile = new FileWriter(filename, false);
        PrintWriter output = new PrintWriter(writefile);
		while(input.hasNextLine()){
			lines.add(input.nextLine());
		}
		
		int originalSize = lines.size();
        for(int i = 0; i < originalSize; i++){
        	int randomNumber = random.nextInt(lines.size());
        	output.print(lines.remove(randomNumber));
			output.println();
		}
        
        

		//For testing purposes, output all the lines
		for(String line : lines){
			System.out.println(line);
		}
		
		input.close();
		output.close();
	}
	
}
