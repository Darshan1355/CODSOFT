package atm_machine;

import java.util.Scanner;
class Account{
	public void checkAccountBalance(int balance) {
		System.out.println("----------------------");
		System.out.println("Account User: ______ ");
		System.out.println("Acount no: ______");
		System.out.println("Balance: "+balance);
		System.out.println("----------------------");
		
	}
}
public class ATM {

	public static int menu(Scanner sc) {
		System.out.println();
		System.out.println("----Menu----");
		System.out.println();
		System.out.println("0: Exit");
		System.out.println("1: Deposite cash : ");
		System.out.println("2: Withdraw cash : ");
		System.out.println("3: Check Balance : ");
		int ch=sc.nextInt();
		System.out.println();
		return ch;
	}
	
	public static void main(String[] args) {
		Account ac=new Account();
		Scanner sc=new Scanner(System.in);
		int balance=100;
		int amt=0,userPin;
		int ch,pin=1234;
		while((ch=menu(sc))!=0) {
			switch (ch) {
			case 1: {
				System.out.println("Enter Amount: ");
				amt=sc.nextInt();
				balance=balance+amt;
				System.out.println("Successfully credited "+amt+" rs in your account.");
				System.out.println("Balance remain: "+balance);
				break;
			}
			case 2:{
				System.out.println("Enter Amount: ");
				amt=sc.nextInt();
				System.out.println("Enter pin: ");
				userPin=sc.nextInt();
				if(userPin==pin) {
					if((balance-amt)>100) {
				      balance=balance-amt;
				      System.out.println("Successfully debited "+amt+" rs from your account.");
				      System.out.println("Balance remain: "+balance);
					}
					else
						System.out.println("Insufficient Balance !!");
				}
				else
					System.out.println("Incorrect Pin ! Enter correct pin.");
				break;
			}
			case 3:{
				System.out.println("Enter pin: ");
			    userPin=sc.nextInt();
			    if(userPin==pin) {
			    	ac.checkAccountBalance(balance);
			    }
			    if(userPin!=pin)
			    	System.out.println("Incorrect Pin !!");
			    break;
			}
			default:
				System.out.println("Wrong choice !!");
			}
		}

	}

}
