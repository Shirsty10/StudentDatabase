import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stu.paymentInfo();
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter how many student you want to enroll : ");
		int noOfStudent = inp.nextInt();
		
		while(noOfStudent-->0){
			Student stu = new Student();
			stu.info();
			stu.askClass();
			stu.createID();
			stu.totalFeesInfo();
			System.out.println("\nSTUDENT IS SUCCESSFULLY ENROLLED...\n");
			System.out.println("Detilas are - ");
			System.out.println(stu.showInfo()+"\n");
			
		}
		
		

	}

}
