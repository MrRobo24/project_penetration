import java.io.*;
public class Launcher 
{
	/*essential variables are globally initialized
	 */
	static int gridSize;
	static int[] dropCoordinate = new int[2];
	static int[][] gridMatrix = null;
	
	public static void funcMakeGrid()
	{
		System.out.println("Making grid:");
		gridMatrix = new int[gridSize][gridSize];
		for(int i=0;i<gridSize;i++)
			for(int j=0;j<gridSize;j++)
				gridMatrix[i][j] = 0;
				
	}
	
	public static void funcInitializeParameters() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the size of grid you want to play on: ");
		gridSize = Integer.parseInt(br.readLine());
		//funcMakeGrid();
		
		System.out.print("Enter the drop location: ");
		String[] dropStringCoordinate = br.readLine().split("");
		dropCoordinate[0] = Integer.parseInt(dropStringCoordinate[0]);
		dropCoordinate[1] = Integer.parseInt(dropStringCoordinate[1]);
		
	}
	
	public static void main(String args[])throws IOException
	{
		funcInitializeParameters();
	}
}
