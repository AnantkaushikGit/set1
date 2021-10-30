package Set1Solutions;
//TODO Armstrong number from 100 to 999
  class ArmstrongNumber {
     public static void main(String[] args) {
    	 
    	 int i = 100, rem, sum, temp, tnum;

    	    System.out.println(" 3-digit Armstrong numbers are : ");

    	    for ( ; i <= 999; i++)
    	    {
    	        tnum = i;
    	        sum = 0;
    	        while (tnum > 0)
    	        {
    	            rem = tnum % 10;
    	            temp = rem * rem * rem;
    	            sum = temp + sum;
    	            tnum = tnum / 10;
    	        }
    	        if (i == sum)
    	        	 System.out.println("\n"+ sum);
    	    }
    	    }
     }
