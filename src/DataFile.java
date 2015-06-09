import java.io.Serializable;
import java.util.ArrayList;


public class DataFile implements Serializable
{
	private static final long serialVersionUID = 1L;
	ArrayList<String> theData;
	String owner = "";
	
	public DataFile(String o)
	{
		owner = o;
		theData = new ArrayList<>();
	}
	
	public void addString(String s)
	{
		theData.add(s);
	}
}
