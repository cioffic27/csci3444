package ass1A_java_book1_9_1;

import java.util.*;
public class Test{
	public static void main(String[] args){
		int i;
		String SSN;
		boolean error=false;
		Scanner in =new Scanner(System.in);
			System.out.print("Please enter social security number DDD-DD-DDDD: ");
			SSN=in.nextLine();
if(SSN.length()==11)
      for(i=0;i<11;i++)
         {if(i==3||i==6)
              {if(SSN.charAt(i)!='-')
                   {System.out.println("Invalid SSN");
                  error=true;
                       i=10;
                  }
               }
           else
             if(!Character.isDigit(SSN.charAt(i)))          
                  {System.out.println("Invalid SSN");
                error=true;
                    i=10;
                    }
              
           }
else
     {error=true;
      System.out.println("Invalid SSN");
      }
if(!error)
     System.out.println("Valid SSN");
}
}
