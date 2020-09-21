import java.rmi.*;
import java.rmi.server.*;
import java.io.*;

public class FileServerImpl extends UnicastRemoteObject implements FileServerIntf  {
	
	public FileServerImpl() throws RemoteException {
	} 

	public String listFiles(String inp) throws RemoteException
	{  
		File folder = new File("E://Movies");
		File[] listOfFiles = folder.listFiles();
		String fileList = "";
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				fileList+= System.getProperty("line.separator") +"File " + listOfFiles[i].getName();
			} else if (listOfFiles[i].isDirectory()) {
				fileList += System.getProperty("line.separator") +"Directory " + listOfFiles[i].getName();
			}
		}
		return fileList;
	 }
}
