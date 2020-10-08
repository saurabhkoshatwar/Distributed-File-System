import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
public class FileServerImpl2 extends UnicastRemoteObject implements FileServerIntf  {
	public FileServerImpl2() throws RemoteException {
	} 

	public String listFiles(String inp) throws RemoteException
	 {  
			File folder = new File("E://Movies/Series");
			
			File[] listOfFiles = folder.listFiles();
			String filel = "";
			for (int i = 0; i < listOfFiles.length; i++) {
			  if (listOfFiles[i].isFile()) {
				filel+= System.getProperty("line.separator") +"File " + listOfFiles[i].getName();
			  } else if (listOfFiles[i].isDirectory()) {
				filel += System.getProperty("line.separator") +"Directory " + listOfFiles[i].getName();
			  }
			}
		return filel;
	 }
}
