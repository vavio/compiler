package robol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EnumGenerator {
	public static void main(String[] args) throws Exception {
		new EnumGenerator("/src/parser/RoboL.tokens", "JFlexToken");
	}
	
	public EnumGenerator(String antlrTokens, String enumName) throws Exception{
		//String path = this.getClass().getResource("").getPath();
		String basicPath = new File("").getAbsolutePath();
		File sourceFile = new File(basicPath + antlrTokens);
		
		FileInputStream fileInputStream = new FileInputStream(sourceFile);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		
		String destinationPath = sourceFile.getAbsolutePath();
		destinationPath = destinationPath.substring(0,destinationPath.lastIndexOf(File.separator));
		File destinationFile = new File(destinationPath + "\\" + enumName + ".java");
		System.out.println("File path: " + destinationFile.getAbsolutePath());
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile));
		
		System.out.println("Generator started");
		bufferedWriter.write(String.format("public enum %s {\n", enumName));
		
		String line = null;
		int n = 0;
		
		while ((line = bufferedReader.readLine()) != null) {
			line = line.trim().replace("\n", "").replace("\r", "");
			String args[] = line.split("=");
			
			if (n==0) {
				bufferedWriter.write(String.format("%s(%s)", args[0], args[1]));
			}
			else {
				bufferedWriter.write(",");
				bufferedWriter.write("\n");
				bufferedWriter.write(String.format("%s(%s)", args[0], args[1]));
			}
			n++;
		}
		
		bufferedWriter.write(";\n\n");
		bufferedWriter.write("private int value;\n");
		bufferedWriter.write(enumName);
		bufferedWriter.write("(int value) {this.value = value;}\n");
		bufferedWriter.write("public int getValue() {return value;}\n");
		bufferedWriter.write("\n}");
		
		bufferedWriter.close();
		bufferedReader.close();
		System.out.println("Enum generation completed successfully");
	}
}
