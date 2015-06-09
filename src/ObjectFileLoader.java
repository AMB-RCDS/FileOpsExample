import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectFileLoader
{
	private final String filename = "savedFile.ser";
	
	public ObjectFileLoader()
	{
		//placeholder for the data to load in
		DataFile readFile = null;
		
		//get input from the FILE
		try
		{
			FileInputStream fileStream = new FileInputStream(filename);
			ObjectInputStream inStream = new ObjectInputStream(fileStream);

			//read the entire object at once!
			readFile = (DataFile)inStream.readObject();
			
			//don't forget to close the streams!  This protects the file!
			fileStream.close();
			inStream.close();

			ArrayList<String> fileData = readFile.getTheData();
			String fileOwner = readFile.getOwner();
			
			//print out all the information loaded
			System.out.println("This file owned by: "+fileOwner);
			System.out.println("Contents:");
			for (int i = 0; i < fileData.size(); i++)
				System.out.println("Line " + i + ": " + fileData.get(i));
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
