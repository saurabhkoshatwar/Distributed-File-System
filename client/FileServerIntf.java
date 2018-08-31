import java.rmi.*;

	 public interface FileServerIntf extends Remote 
	 {	 	
		String listfiles(String inp) throws RemoteException;
	 }

