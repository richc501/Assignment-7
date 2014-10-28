package cycleFileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CycleFileInput{
	public static void main(String[] args)
	{
		try
		{
			Cycle test = new Cycle();
			Scanner fileReader = new Scanner(new File("CycleOut.txt"));
			System.out.println(fileReader.nextLine());
			fileReader.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("problem reading file");
		}
	}
}
