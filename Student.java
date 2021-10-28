package Set1Solutions;

import java.util.Scanner;

public class Student {
	 String name;
	static int rno,m1,m2,m3;
	void accept(Scanner obj){ //Function for accepting value
		
		
		System.out.println("name");
		 name= obj.nextLine();
		System.out.println("roll no");
		rno= obj.nextInt();
		System.out.println("marks in first subject");
		m1 = obj.nextInt();
		System.out.println("marks in second subject");
		m2 =  obj.nextInt();
		System.out.println("marks in third subject");
		m3 = obj.nextInt();
		
		}
	 int getTotal(int m1,int m2,int m3){//function for getting total marks
		 int total = m1+m2+m3;
		 return(total);
		 
	 }
	 
	 float getpercentage(int tot){//function to get percentage
		 float per = (tot*100)/300;
		 return(per);
	 }
	 
	 char getGrade(float per){//function for  getting grades
		 char grd;
		 
		 if(per>=90){//checking for grade A
		grd = 'A';	 
		 }
		 else if(per>=70&&per<90){//checking for grade b
			 grd='B';
		 }
		 else if(per>=50&&per<70){//checking for grade c
			 grd='c';
		 
		 }else {//checking for grade d
			 grd='D';
		  }
		 return(grd);
		 
	 }
	 void display(int tot, float per, char grd){ //function to display output
		 System.out.println("Student name is "+name);
		 System.out.println("Student roll number is "+rno);
		 System.out.println("marks in following subjects are:");
		 System.out.println("1st \t 2nd \t 3rd");
		 System.out.println(+m1+"\t"+m2+"\t"+m3);
		 System.out.println("total marks obtained is "+tot);
		 System.out.println("percentage got is "+per+"%");
		 System.out.println("Grade is "+grd);
		 
	 }

	public static void main(String[] args) {//main method
		Scanner obj =new Scanner(System.in); //object for Scanner
		Student acc = new Student();//object for class Students
	
		acc.accept(obj);//calling function "accept" by reference
		
		
		int tot = acc.getTotal(m1,m2,m3); //passing values to function total
		float per = acc.getpercentage(tot);//passing to percentage and storing returned value to per
		char grd = acc.getGrade(per); //passing to get grade and storing returned value to grd
		acc.display(tot, per, grd);//passing value to display function
		
	}

}
