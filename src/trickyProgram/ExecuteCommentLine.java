package trickyProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExecuteCommentLine {

	public static void main(String[] args) {
		// This two lines are commented
		// \u000d System.out.println("It is commented");
		Scanner scan = null;
		try {
			scan = new Scanner(new File("./text.txt")).useDelimiter("/");
		} catch (FileNotFoundException e) {
			
		}
		System.out.println(scan);
		String string = scan.next();
		System.out.println(string);
	}
}
