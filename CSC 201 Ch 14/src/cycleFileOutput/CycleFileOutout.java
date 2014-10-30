package cycleFileOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CycleFileOutout{
	public static void main(String[] args)
	{
		try
		{
			Cycle test = new Cycle();
			File file = new File("CycleOut.txt");
			PrintWriter fileWriter = new PrintWriter(file);
			if (file.exists())
				System.out.println("TRUE");
			fileWriter.println(test);
			System.out.println(test);
			fileWriter.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not found.");
		}
	}
}
