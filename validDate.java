package Set1Solutions;

import java.util.Scanner;

public class validDate {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);//object for scanner
		System.out.println("year");
		int yr= obj.nextInt();    //input year
		System.out.println("month");
		int mm= obj.nextInt();//input months
		System.out.println("day");
		int dd= obj.nextInt();//input date
		System.out.println("DD\tmm\tyyyy");
		System.out.println(dd+"\t"+mm+"\t"+yr);
		
		if(yr>=1000&&yr<=9999){//year check 1
			if(mm<=12){//month check 
			if(yr%4==0||yr%400==0){    //leap year check
				        
					if(mm==1|| mm==3|| mm==5|| mm==7|| mm==9|| mm==11){ //month check for days 31
						if(dd<=31){                                       //date check for 31
							System.out.println("date valid");
						}
						else{
							System.out.println("date invalid");
						}
					} else if(mm==2&&dd<=29){                       //month check for feb leap year
						                                            //date check for 29
						System.out.println("date valid");
						
					}else if(mm==4|| mm==6|| mm==8|| mm==10|| mm==12){  //month check for date 30
						if(dd<=30){                                     //date check for 30
						System.out.println("date valid");
					}else{
						System.out.println("date invalid");
					}
						}
						
					
			}else{
					       
						if(mm==1|| mm==3|| mm==5|| mm==7|| mm==9|| mm==11){ //month check for days 31
							if(dd<=31){                                       //date check for 31
								System.out.println("date valid");
							}
							else{
								System.out.println("date invalid");
							}
						} else if(mm==2&&dd<=28){                                    //month check for feb not leap       
							System.out.println("date valid");                              //date check for 28
							
						}else if(mm==4|| mm==6|| mm==8|| mm==10|| mm==12){  //month check for date 30
							if(dd<=30){                                     //date check for 30
							System.out.println("date valid");
						}else{
							System.out.println("date invalid");
						}
							}else{
								System.out.println("date invalid");
							}
							 
						}
			
			}else{
				System.out.println("month invalid");
			}	
				
			}else{
				System.out.println("year is invalid");
				}
			
	
	}

}
