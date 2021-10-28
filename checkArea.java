package Set1Solutions;

import java.util.Scanner;

public class checkArea {
	
	void area(double R){//function for area of circle
		double ar = (22/7)*R*R;
		System.out.println("area of circle is "+ar);
		
	}
    void area(float temp1,float temp2){//function for area of rectangle
		float ar = temp1*temp2;
		System.out.println("area of rectangle is "+ar);
		}
    
    void area(float temp1){//function for area of square
    	float ar = temp1*temp1;
    	System.out.println("area of square is "+ar);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		checkArea are = new checkArea();
		
		System.out.println("press 1 for circle");
		System.out.println("press 2 for rectangle");
		System.out.println("press 3 for square");
		
		int opt = obj.nextInt();
		float temp1 = 1 , temp2 = 1;
		double R;
		
		if (opt==1){
			System.out.println("write raddii of circle");
			 R = obj.nextDouble();
			 are.area(R);
			
		}
		else if(opt==2){
			System.out.println("write length");
			temp1 = obj.nextFloat();
			System.out.println("write breath");
			temp2 = obj.nextFloat();
			are.area(temp1,temp2);
		}
		else if(opt==3){
			System.out.println("write side");
			temp1 = obj.nextFloat();
			are.area(temp1);
		}
		else {
			
			System.out.println("not appropriate input");
		}
		

		
		
	}

}
