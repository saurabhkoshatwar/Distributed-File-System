import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
public class FileServerImpl3 extends UnicastRemoteObject implements FileServerIntf3  {
	public FileServerImpl3() throws RemoteException {
		
	} 


	String backup1="",backup2="";
	public void sendBackup(String s1,String s2) throws RemoteException
	 {  
			backup1=s1;
			backup2=s2;

	 }
	 public String getBackup1() throws RemoteException
	 {  
			return backup1;

	 }
	 public String getBackup2() throws RemoteException
	 {  
			return backup2;

	 }
	 
	 
}
