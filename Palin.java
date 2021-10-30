package Set1Solutions;

// TODO  check whether a positive number is a Palindrome number or not. The number ‘N’ is palindrome if the original number and it’s reverse are the same.

import java.util.Scanner;
public class Palin {
	 int num,revnum, temp1, temp2;// data members
	
	int accept(Scanner obj){//to accept the  value
		System.out.println("Input a positive no.");
		  num = obj.nextInt();
		  return(num);
		  }
	
	int reverse(int num){ //function to reverse the number
		temp2=num; // to store the value of original number to keep it intact 
		do{
			temp1=num%10;// to check last digit
			revnum= revnum*10+temp1;//to reverse the number
			num=num/10;//to remove last digit
		}while(num!=0);
		return(revnum);
		}
	
	void check(int revnum, int temp2){ //to check if the reverse no is equal to original or not 
		if(revnum==temp2){
			System.out.println(temp2+" is a Palindrome number");
		}else{
			System.out.println(temp2+" is not a Palindrome number");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);//object of scanner
		Palin cls = new Palin();//object of class Palin
	    
		cls.num =cls.accept(obj);
		cls.revnum = cls.reverse(cls.num);
		cls.check(cls.revnum, cls.temp2);
		
		
		
		
		

	}

}
