import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectFileLoader
{
	public ObjectFileLoader()
	{
		
		
		//get input from the FILE
		try
		{
			textLoader = new Scanner(new File(fName));

			ArrayList<String> rawData = new ArrayList<>();
			
			//as long as there are lines left to read...
			while (textLoader.hasNext())
				//read a line, store it in rawData
				rawData.add(textLoader.nextLine());

			//don't forget to close the Scanner!  This protects the file!
			textLoader.close();

			//print out all the information loaded
			for (int i = 0; i < rawData.size(); i++)
				System.out.println("Line " + i + ": " + rawData.get(i));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		new ObjectFileLoader();
	}
}
