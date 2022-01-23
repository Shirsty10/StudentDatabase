import java.util.Scanner;

public class Student {
	private static int id=1000;
	private String studentID;
	private String firstName;
	private String lastName;
	private int studentClass;
	private int totalFees = 500;
	private int balance=0;
	private int payment=0;
	
	//asking info
	public void info() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter Student First Name : ");
		firstName = inp.nextLine();
		System.out.print("Enter Student Last Name : ");
		lastName = inp.nextLine();
	}
	
	//Asking for class
	public void askClass() {
		Scanner inp = new Scanner(System.in);
		System.out.print("For which class you want to enroll: ");
		studentClass = inp.nextInt();
		System.out.println("Thanks for providing information.For class "+studentClass+ " ,here is further information-");
	}
	
	//create student unique ID
	public void createID() {
		studentID = studentClass+""+id;
		id++;
		
	}
	 
	public void totalFeesInfo() {
		totalFees = totalFees*studentClass;
		System.out.println("Total fees for class "+studentClass+" is: "+totalFees);
		paymentInfo();
	}
	
	public void balanceInfo() {
		balance = totalFees-payment;
		System.out.println("Current balance is "+balance);
		
	}
	
	public void paymentInfo() {
		Scanner inp= new Scanner(System.in);
		System.out.print("Enter what you want to pay : Rs");
		payment = inp.nextInt();
		balanceInfo();
	}
	
	public String showInfo() {
		return " Student's Name : "+firstName +" "+lastName
				+"\n Student new StudentID id :"+studentID
				+"\n Student want to enroll for class : "+studentClass
				+"\n Total Fees is : "+totalFees
				+"\n Balance left is : "+balance;
				
	}

}
