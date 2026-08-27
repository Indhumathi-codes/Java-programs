import java.util.Scanner;
public class Students_details
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Your Name:");
	    String name=sc.nextLine();
	    System.out.print("Enter Your Department:");
	    String dept=sc.nextLine();
		System.out.print("Enter Your Reg.no:");
	    String reg=sc.nextLine();
	    System.out.print("Current year:");
	    int yr=sc.nextInt();
	    System.out.print("Enter subject 1 mark:");
	    int m1=sc.nextInt();
	    System.out.print("Enter subject 2 mark:");
	    int m2=sc.nextInt();
	    System.out.print("Enter subject 3 mark:");
	    int m3=sc.nextInt();
	    System.out.print("Enter subject 4 mark:");
	    int m4=sc.nextInt();
	    System.out.print("Enter subject 5 mark:");
	    int m5=sc.nextInt();
	    int per=(m1+m2+m3+m4+m5)/5;
	    if (m1>=30 && m1<=100 && m2>=30 && m2<=100 && m3>=30 && m3<=100 && m4>=30 && m4<=100 && m5>=30 && m5<=100){
	        if (per<=100 && per>=90){
	        System.out.println("You got A+ grade.");
	        }
	        else if (per>=80){
	        System.out.println("You got A grade.");
	        }
	        else if (per>=70){
	        System.out.println("You got B grade.");
	        }
	        else if (per>=60){
	        System.out.println("You got C grade.");
	        }
	        else if (per>=50){
	        System.out.println("You got D grade.");
	        }
	        else if (per<50 && per>30){
	        System.out.println("You got A grade.");
	        }
	  
	    }
	    else{
	        if (m1<=30 || m2<=30 || m3<=30 || m4<=30 || m5<=30){
	        System.out.println("You got fail mark.");
	        }
	        else{
	            System.out.println("Stick within 100");
	        }
	    }
	    double t=per;
	    System.out.print("Your percentage ");
	    System.out.printf("%.2f",t);
	    
	}
}
