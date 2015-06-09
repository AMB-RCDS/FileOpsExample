import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectFileWriter
{
	private final String filename = "savedFile.ser";
	
	public ObjectFileWriter()
	{
		Scanner keyboard;

		// get input from the CONSOLE
		keyboard = new Scanner(System.in);
		System.out.print("Please enter the name of the owner: ");
		String input = keyboard.nextLine();
		
		DataFile file = new DataFile(input);

		while (!input.equals("_done"))
		{
			System.out.print("Enter data element or \"_done\" to finish: ");
			input = keyboard.nextLine();
			file.addString(input);
		}

		keyboard.close();
		
		//write the DataFile instance to a file
		try
		{
			//open the streaming connections to the file
			FileOutputStream fileStream = new FileOutputStream(filename);
			ObjectOutputStream outStream = new ObjectOutputStream(fileStream); 
			
			//write the file
			outStream.writeObject(file);
			
			//close everything!
			fileStream.close();
			outStream.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		new ObjectFileWriter();
	}
}
