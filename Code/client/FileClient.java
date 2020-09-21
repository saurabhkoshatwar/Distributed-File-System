import java.rmi.*;
import java.util.*;

public class FileClient {

static FileServerIntf fileServerIntf;
static FileServerIntf3 fsib;
static String fileServerURL ;
static 				String location,s3="";

 public static void InitBackup(String inp){
	try{
					//movies
					fileServerURL = "rmi//10.11.3.7:8060/FileServer";
					fileServerIntf = (FileServerIntf)Naming.lookup(fileServerURL);
					String s1=fileServerIntf.listFiles(inp);
					
					//series
					fileServerURL = "rmi//10.11.3.7:8070/FileServer";
					fileServerIntf = (FileServerIntf)Naming.lookup(fileServerURL);
					String s2=fileServerIntf.listFiles(inp);
			
					//backup
					fileServerURL = "rmi//10.11.3.7:8080/FileServer";
					
					fsib = (FileServerIntf3)Naming.lookup(fileServerURL);
					fsib.sendBackup(s1,s2);
					
				}
				catch(Exception e){
					System.out.println(e);
					System.out.println("Error occurred while connecting to server");
				}
}

  public static void main(String args[])
  {
                
                Scanner sc = new Scanner(System.in);
                System.out.print(">>>>");
                String inp = sc.next();
				
				InitBackup(inp);
				location = "local";
                while(!inp.equals("exit")){
					if(inp.equals("ls")){
						if(location.equals("local")){
							System.out.println("movies\nseries");
                        }
                        else
                        {
							try {
		                        fileServerURL = "rmi//"+location+"/FileServer";
		                        fileServerIntf = (FileServerIntf)Naming.lookup(fileServerURL);
								System.out.println(fileServerIntf.listFiles(inp));

		                    } 
							catch (Exception e){ 
							try{
										
								if(location.equals("10.11.3.7:8060")){
									fileServerURL = "rmi//10.11.3.7:8080/FileServer";
									fsib = (FileServerIntf3)Naming.lookup(fileServerURL);
									System.out.println("==============   "+"Movie Server (8070)is crashed"+"   =============="+"\nRetreiving data from BACKUP SERVER!!!");
									System.out.println(fsib.getBackup1());
								}
								else{
									fileServerURL = "rmi//10.11.3.7:8080/FileServer";
									System.out.println("==============   "+"Series Server (8060)is crashed"+"   =============="+"\nRetreiving data from BACKUP SERVER!!!");
									fsib = (FileServerIntf3)Naming.lookup(fileServerURL);
									System.out.println(fsib.getBackup2());
								}
							}
							catch(Exception j){
								System.out.println("Something went wrong");
							}
                         		
								
								}
                         	}	
					}
					else if(inp.contains("cd"))
					{
							if(inp.toLowerCase().contains("movies"))
							{
								location = "10.11.3.7:8060";
							}
							else if(inp.toLowerCase().contains("series"))
							{
								location = "10.11.3.7:8070";
							}
							else
								location="local";
						}
                 	
                 	System.out.print(">>>>");
                 	inp = sc.nextLine();	
         	}
			}
   
   
   
}
