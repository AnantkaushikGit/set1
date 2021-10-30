package Set1Solutions;

import java.util.Scanner;

public class PrintNumberToName {
	 static void disp1(int n) // for 0 to 19 words
	 {
	 switch(n)
	 {
	 case 0 : System.out.print("zero ");
	 break;
	 case 1 : System.out.print("one ");
	 break;
	 case 2 : System.out.print("two ");
	 break;
	 case 3 : System.out.print("three ");
	 break;
	 case 4 : System.out.print("four ");
	 break;
	 case 5 : System.out.print("five ");
	 break;
	 case 6 : System.out.print("six ");
	 break;
	 case 7 : System.out.print("seven ");
	 break;
	 case 8 : System.out.print("eight ");
	 break;
	 case 9 : System.out.print("nine ");
	 break;
	 case 10 : System.out.print("ten ");
	 break;
	 case 11 : System.out.print("eleven ");
	 break;
	 case 12 : System.out.print("twelve ");
	 break;
	 case 13 : System.out.print("thirteen ");
	 break;
	 case 14 : System.out.print("fourteen ");
	 break;
	 case 15 : System.out.print("fifteen ");
	 break;
	 case 16 : System.out.print("sixteen ");
	 break;
	 case 17 : System.out.print("seventeen ");
	 break;
	 case 18 : System.out.print("eighteen ");
	 break;
	 case 19 : System.out.print("nineteen ");
	 break;
	 }
	 }
	 static void disp2(int n) // for twenty,thirty,forty .... ninety
	 {
	 switch(n)
	 {
	 case 2 : System.out.print("twenty ");
	 break;
	 case 3 : System.out.print("thirty ");
	 break;
	 case 4 : System.out.print("forty ");
	 break;
	 case 5 : System.out.print("fifty ");
	 break;
	 case 6 : System.out.print("sixty ");
	 break;
	 case 7 : System.out.print("seventy ");
	 break;
	 case 8 : System.out.print("eighty ");
	 break;
	 case 9 : System.out.print("ninety ");
	 break;
	 }
	 }
	 static void digit2(int n) // for numbers 0-99
	 {
	 if(n<=19)
	 disp1(n);
	 else
	 { disp2(n/10);
	 int r = n%10;
	 if(r!=0)
	 disp1(r);
	 }
	 }

	 static void digit3(int n) // for numbers 0-999
	 { if(n<=99)
	 digit2(n);
	 else
	 { int q = n/100;
	 disp1(q);
	 System.out.print("hundred ");
	 int r = n%100;
	 if(r!=0)
	 digit2(r);
	 }
	 }
	 static void digit5(int n) // for numbers 0-99999
	 { if(n<=999)
	 digit3(n);
	 else
	 { int q = n/1000;
	 digit2(q);
	 System.out.print("thousand ");
	 int r = n%1000;
	 if(r!=0)
	 digit3(r);
	 }
	 }
	 static void digit7(int n) // for numbers 0-9999999
	 { if(n<=99999)
	 digit5(n);
	 else
	 { int q = n/100000;
	 digit2(q);
	 System.out.print("lakh(s) ");
	 int r = n%100000;
	 if(r!=0)
	 digit5(r);
	 }
	 } 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.print("Enter any number ");
		 int n = scan.nextInt(); // for maximum seven digited number.
		 digit7(n);
	}

}
