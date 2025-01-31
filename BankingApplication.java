import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
	BankAccount ba = new BankAccount("001", "Nikhil");
	String message = ":) Welcome to the JSpiders Bank !!!";
	
	for (int i = 0; i < message.length(); i++) {
        System.out.print(message.charAt(i));
        
        // for Delay
        try {
            Thread.sleep(100);  // 100 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	 
    System.out.println();
    
    
				ba.showMenu();	// calling the showmenu Method	
	}
}

class BankAccount
{
	String CustomerID;
	String CustomerName;
	int balance;
	int previoustransaction;
	
	BankAccount(String cid, String cname)
	{
	 CustomerID = cid;
	CustomerName = cname;
	}
	
	void deposit(int amount)
	{
		if(amount!=0)
			{
			balance=balance+amount;
			previoustransaction= amount;
			}
	}
	
	void withdraw(int amount)
	{
		if(amount!=0)
		{
		 balance=balance-amount;
		 previoustransaction=-amount;
		}
	}
	
	void getprevioustransaction()
	{
		if(previoustransaction>0)
		{
	       System.out.println("Deposited :" + previoustransaction);
		}
		else if(previoustransaction<0)
		{
			System.out.println("Deposited:" +Math.abs(previoustransaction));
			
		}
		else {
			System.out.println("No Transaction Occured :(");
		}
	}
		
   void showMenu()
   {
	  char option = 'a' ;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Your Customer Name is " + "Tejas");
	   System.out.println("Your ID is " + CustomerID+";)");
	  System.out.println("\n");
	  
	  System.out.println("A. CheckBalance");
	  System.out.println("B. Deposite");
	  System.out.println("C. Withdraw");
	  System.out.println("D. Previous Transaction");
	  System.out.println("E. Exit");
	  
	  
	  do {
		  System.out.println("===============================================");
		  System.out.println("Enter an option");
		  System.out.println("===============================================");
		  option=sc.next().charAt(0);
		  System.out.println("\n");
		  
		  switch(option) {
		  
		  case 'A': 
			  System.out.println("..............................................................................................................................");
			  System.out.println("balance: "+ balance);
			  System.out.println("..............................................................................................................................");
			  System.out.println("\n");
			  break;
			  
		  case 'B': 
			  System.out.println("..............................................................................................................................");
			  System.out.println("Enter an amount to deposit: ");
			  System.out.println("..............................................................................................................................");
			  int amount= sc.nextInt();
			  deposit(amount);
			  System.out.println("\n");
			  break;
			  
		  case 'C': 
			  System.out.println("..............................................................................................................................");
			  System.out.println("Enter an amount to WithDraw: ");
			  System.out.println("..............................................................................................................................");
			  int amount2= sc.nextInt();
			  withdraw(amount2);
			  System.out.println("\n");
			  break;
			  
		  case 'D': 
			  System.out.println("..............................................................................................................................");
			  getprevioustransaction();
			  System.out.println("..............................................................................................................................");
			  System.out.println("\n");
			  break;
			  
		  case 'E' :
			  System.out.println("*********************************************************************");
			  
			  default:
				  System.out.println("Invalid Input !!! Please try Again :(");
				  break;
			  
		  }
		
	} while (option!= 'E');
	 System.out.println("Thank you so much for Using our Services :)");
	  }
   }
	



	

