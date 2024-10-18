package itoro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FilesOperation {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f1 = new File ("files\\demo.rtf"); // This is the shortcut path 
		File f2 = new File("/Users/apple/Desktop/My\\ docs/testfile.rtf");
		
		System.out.println(f1.getAbsolutePath()); // This is used to get the absolute path or complete path .
		
		
		File f3 = new File("sample.txt");
		File f4 = new File("sample.txt");
		
		// FileReader and BurredReader are used to read files in java 
		
		FileReader Fr = new FileReader(f3);
		
		
		BufferedReader Bf = new BufferedReader(f4);
		
		System.out.println(Bf.readLine());// This is to read the line on a txt file based on the BufferedRead class.

		String str;
		
		//Here the line is read till it shows a null for empty line 
		while ((str=Bf.readLine())!=null) {  
			
			System.out.println(str);
		}
	}

}
