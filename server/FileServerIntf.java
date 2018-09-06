import java.rmi.*;
import java.io.*;

	 public interface FileServerIntf extends Remote 
	 {	 	
		File[] listfiles(String inp) throws RemoteException;
	 }

