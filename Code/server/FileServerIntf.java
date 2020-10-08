import java.rmi.*;
public interface FileServerIntf extends Remote 
{	 	
	String listFiles(String inp) throws RemoteException;
}

