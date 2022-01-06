import java.io.*;

public class FileMerge
{
	public static void main(String[] args) throws IOException
	{

		PrintWriter pw = new PrintWriter("file3.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		
		
		String line1 = br1.readLine();
		String line2 = br2.readLine();

		while (line1 != null || line2 !=null)
		{
			if(line1 != null)
			{
				pw.println(line1);
				line1 = br1.readLine();
			}
			
			if(line2 != null)
			{
				pw.println(line2);
				line2 = br2.readLine();
			}
		}
	
		pw.flush();
		
	
		br1.close();
		br2.close();
		pw.close();
		
		System.out.println("Merged file1.txt and file2.txt alternatively into file3.txt");
	}
}