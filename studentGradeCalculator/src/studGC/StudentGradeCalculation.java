package studGC;
import java.util.Scanner;
class Student{
      private String name;
      private int marks;
      
      Student(){
    	  
      }
      
	public void accept(Scanner sc,int count) {
		System.out.println("Enter subject "+(count+1)+" Name: ");
		this.name=sc.next();
		System.out.println("Enter marks: ");
		this.marks=sc.nextInt();
	}
	
	public int getMarks() {
		return this.marks;
	}

	public String toString() {
		return " " + name + " = " + marks ;
	}	
}

public class StudentGradeCalculation {

	public static int menu(Scanner sc) {
		System.out.println("----Menu----");
		System.out.println();
		System.out.println("0: Exit");
		System.out.println("1: Enter Subject Details : ");
		System.out.println("2: Display Result :");
		int ch=sc.nextInt();
		System.out.println();
		return ch;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Subjects: ");
		int size=sc.nextInt();
		Student[] st=new Student[size];
		int sum=0,avg=0;
		int ch;
		int count=0;
		 while((ch=menu(sc))!=0) {
			switch (ch) {
			case 1: {
				
				while(count<size) {
				   st[count]=new Student();	
				   st[count].accept(sc,count);
				   sum=sum+st[count].getMarks();
				   avg=sum/(count+1);
				   count++;
				}
				break;
			}
			case 2:{
					if(st[0]!=null) {
						for(int i=0;i<size;i++) 
					       System.out.println(+(i+1)+" "+st[i].toString());
						System.out.println();
						System.out.print("Average percentage: "+avg);
						if(avg==100) 
							System.out.print("  Grade: O(outstanding)");
						if(avg>90 && avg<100)
							System.out.print("  Grade: A");
						if(avg>80 && avg<=90)
							System.out.print("  Grade: B");
						if(avg>70 && avg<=80)
							System.out.print("  Grade: C");
						if(avg>60 && avg<=70)
							System.out.print("  Grade: D");
						if(avg>=50 && avg<=60)
							System.out.print("  Grade: E");
						if(avg<50)
							System.out.print("  Grade: F(fail)");
						
						System.out.println();
						System.out.println();
						System.out.print("Grade System  | (100/100): O above 90: A above 80: B above 70: C above 60: D above 50: E below 50:F |");
						System.out.println();
					}
					else {
						System.out.println("Enter subject details first !!!");
						break;
					}
				break;
			}
			default:
				System.out.println("wrong choice!!");
			} 
		 }
	}
}
