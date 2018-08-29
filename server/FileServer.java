import java.net.*; 
import java.rmi.*; 
public class FileServer { 
	public static void main(String args[]) {
		try {
		FileServerImpl fileServerImpl = new FileServerImpl();
		System.setProperty("java.rmi.server.hostname","10.11.3.17"); 
		Naming.rebind("FileServer", fileServerImpl); 
		} 
		
		catch(Exception e) 
		{ 
		System.out.println("Exception: " + e); 
		}
	}
}
