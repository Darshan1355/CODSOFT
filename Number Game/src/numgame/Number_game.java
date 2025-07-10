package numgame;
import java.util.Scanner;
import java.util.Random;

public class Number_game {

	public static int menu(Scanner sc) {
		System.out.println("----Menu----");
		System.out.println();
		System.out.println("0: Exit");
		System.out.println("1: Play : ");
		int ch=sc.nextInt();
		System.out.println();
		return ch;
	}
	
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		
		int ch;
		int i=0;
		int score=0,random_no=0;
		while((ch=menu(sc))!=0) {
			 switch (ch) {
			case 1: {
				System.out.println("You get 3 attempts !           Target : 08");
				for( i=0;i<3;i++) {
				   if(score<8) {
					 System.out.println("Enter number: ");
				     int user_no=sc.nextInt();
			    	 random_no=rand.nextInt(15);
				     System.out.println("number generated: "+random_no);
				     if((user_no-random_no)==0) {
					    score=score+5;
				        System.out.println("you got 5 points           Score:"+score);
				     }  
				     if(Math.abs(user_no-random_no)<=2 && Math.abs(user_no-random_no)!=0 ) {
					    score=score+3;
					    System.out.println("you got 3 points           Score:"+score);
				     }   
				     if(Math.abs(user_no-random_no)<=5 && Math.abs(user_no-random_no)>2) {
					    score=score+2;
					    System.out.println("you got 2 points           Score:"+score);
				     }   
				     
				     System.out.println(+(2-i)+" attempts remain");
				     System.out.println();
				   }
				 
			    }
				if(score>=8) {
					 System.out.println("You Win !!!");
				}  
				else
					System.out.println("You Loss !!");
				
			    System.out.println("Score: "+score);
				System.out.println("Attempts taken: "+i);
				System.out.println("---press 1 for replay---");
				System.out.println();
				break;
			}
			default:
				System.out.println("Wrong choice !!");
			}
		 }
	}

}
