import java.net.*; 
import java.rmi.*; 
public class FileServer { 
	public static void main(String args[]) {
		try {
			FileServerImpl fileServerImpl = new FileServerImpl();
			FileServerImpl2 fileServerImpl2 = new FileServerImpl2();
			FileServerImpl3 fileServerImpl3 = new FileServerImpl3();
			
			if(args[0].equals("movies"))
			{
				Naming.rebind("rmi//10.11.3.7:8060/FileServer",fileServerImpl);  
				System.out.println("Movies Server is running");
			}
			else if(args[0].equals("series"))
			{
				Naming.rebind("rmi//10.11.3.7:8070/FileServer",fileServerImpl2);
				System.out.println("Series Server is running");
				
			} 
			else if(args[0].equals("backup"))
			{
				Naming.rebind("rmi//10.11.3.7:8080/FileServer",fileServerImpl3);  
				System.out.println("Backup Server is running");

			}
		}	
		catch(Exception e) 
		{ 
		System.out.println("Exception: " + e); 
		}
	}
}
