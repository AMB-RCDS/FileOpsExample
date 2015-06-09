import java.io.Serializable;
import java.util.ArrayList;


public class DataFile implements Serializable
{
	private static final long serialVersionUID = 1L;
	private ArrayList<String> theData;
	private String owner = "";
	
	public DataFile(String o)
	{
		owner = o;
		theData = new ArrayList<>();
	}
	
	public void addString(String s)
	{
		theData.add(s);
	}

	public ArrayList<String> getTheData()
	{
		return theData;
	}

	public String getOwner()
	{
		return owner;
	} 
}
