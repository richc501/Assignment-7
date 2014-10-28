package cycleFileOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CycleFileOutout{
	public static void main(String[] args)
	{
		try
		{
			Cycle test = new Cycle();
			PrintWriter fileWriter = new PrintWriter("CycleOut.txt");
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
