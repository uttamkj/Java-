import java.util.Scanner;
class Student{
	private String name;
	private String branch;
	private int regd;
	private double cgpa;
	
	Student(String name,String branch,int regd,double cgpa){
		this.name = name;
		this.branch = branch;
		this.regd = regd;
		this.cgpa = cgpa;
	}
	public void getStudentData(){
		System.out.println(this.regd + " "+this.branch + " " + this.name + " "+ this.cgpa );
	}
	public double getCgpa(){
		return this.cgpa;
	}
}
class ManageStudent {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the Number of student: ");
		int n = sc.nextInt();
		
		Student students[ ] = new Student[n];
		
		for(int i = 0; i<n;i++){
			System.out.println("Enter the details: ");
			
			System.out.println("Enter your name: ");
			String name = sc.next();
			System.out.println("Enter your branch: ");
			String branch = sc.next();
			System.out.println("Regd number: ");
			int regd = sc.nextInt();
			System.out.println("Enter your cgpa: ");
			double cgpa = sc.nextDouble();
			
			students[i] = new Student(name,branch,regd,cgpa);
		}
		
		System.out.println("Avalabile students record: ");
		for(int i=0;i<n;i++){
			students[i].getStudentData();
		}
		Student toppor = students[0];
		for(int i = 0;i<n;i++){
			if(toppor.getCgpa() < students[i].getCgpa()){
				toppor = students[i];
			}
		}
		System.out.println("Topper is : ");
		toppor.getStudentData();
	}
}