import java.rmi.*;

	 public interface FileServerIntf3 extends Remote 
	 {	 	
				
		public void sendBackup(String s1,String s2) throws RemoteException;
		public String getBackup1() throws RemoteException;
		public String getBackup2() throws RemoteException;
	 
	 
	 }
	 
	 

