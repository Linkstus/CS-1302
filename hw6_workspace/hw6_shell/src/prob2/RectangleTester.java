package prob2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;

public class RectangleTester {

	public static void main(String[] args) {
		try {
			File inFile = new File("src\\prob2\\rectangles.txt");
			File iREFile = new File("src\\prob2\\illegalRectangles.txt");
			
			readFile(inFile, iREFile);
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
	}
	
	public static void readFile(File inFile, File iREFile) {
		try {
			PrintWriter pw = new PrintWriter(iREFile);
			Scanner fileRead = new Scanner(inFile);
			
			while(fileRead.hasNext()) {
				double width = fileRead.nextDouble();
				double heigth = fileRead.nextDouble();

				try {
					Rectangle r = new Rectangle(width, heigth);

					System.out.println(r.toString());
				}
				catch(IllegalRectangleException iRE) {
					writeFile(iREFile, iRE, pw);
				}
			}
			fileRead.close();
			pw.close();
		}
		catch(Exception e) {
			System.out.println("Filure");
		}
	}
	
	public static void writeFile(File iREFile, IllegalRectangleException iRE, PrintWriter pw) {
		System.out.printf("Illegal Rectangle: width=%.2f, height=%.2f, area=%.2f\n", iRE.getWidth(), iRE.getHeight(), iRE.getWidth()*iRE.getHeight());
		pw.printf("Illegal Rectangle: width=%.2f, height=%.2f, area=%.2f\n", iRE.getWidth(), iRE.getHeight(), iRE.getWidth()*iRE.getHeight());
	}
}
