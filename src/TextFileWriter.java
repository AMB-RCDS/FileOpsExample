import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriter
{
	public TextFileWriter()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the filename to write: ");
		String input = keyboard.nextLine();

		try
		{
			//open the output stream
			PrintWriter output = new PrintWriter(input);

			while (!input.equals("_done"))
			{
				System.out.print("Please enter some text: ");
				input = keyboard.nextLine();
				//send things to the output stream
				output.println(input);
			}

			System.out.println("Finished!");
			
			//close the stream!
			output.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		keyboard.close();
	}

	public static void main(String[] args)
	{
		new TextFileWriter();
	}

}
