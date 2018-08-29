import java.rmi.*;
import java.util.*;

public class FileClient {

  public static void main(String args[])
  {
                /*
                Scanner sc = new Scanner(System.in);
                //System.out.println();
                System.out.print(">>>>");
                String inp = sc.next();
                String location = "local";
                
                while(!inp.equals("exit"))
                {
                        if(inp.equals("ls"))
                        {
                                if(location.equals("local"))
                                {
                                        System.out.println("Movies\nVideos");
                                }
                                else
                                {
		                        try {
		                        String fileServerURL = "rmi://" + location + "/FileServer";
		                        FileServerIntf fileServerIntf = (FileServerIntf)Naming.lookup(fileServerURL);
		                        
		                         //System.out.println("The first number is: " + args[1]);
		                         		double d1 = Double.valueOf(args[1]).doubleValue();
		                         		//System.out.println("The second number is: " + args[2]);
		                        //double d2 = Double.valueOf(args[2]).doubleValue(); 
		                        //System.out.println("The sum is: " + addServerIntf.add(d1, d2));
		                        

		                        System.out.println(fileServerIntf.listfiles());

		                        } 

                                  	 catch (Exception e){ 
			                        System.out.println("Exception: " + e);
                         		}
                         	}	
                 	}
                 	else if(inp.contains("cd"))
                 	{
                 	        
                 	
                 	}
                 	
                 	System.out.print(">>>>");
                 	inp = sc.next();	
         	}
         	*/
         	
                Scanner sc = new Scanner(System.in);
                System.out.print(">>>>");
                String inp = sc.next();  
            
                while(!inp.equals("exit"))
                {               
                        try {
                        String fileServerURL = "rmi://" + args[0] + "/FileServer";
                        FileServerIntf fileServerIntf = (FileServerIntf)Naming.lookup(fileServerURL);

                        System.out.println(fileServerIntf.listfiles(inp));

                        } 

                  	 catch (Exception e){ 
                                System.out.println("Exception: " + e);
         		}
                
                 	System.out.print(">>>>");
                 	inp = sc.next();	
         	}   
   
         		
   }
   
   
   
}
