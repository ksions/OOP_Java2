package lab2;

public class SquareRoot{
    public static void main(String args [])
    {
    	double a = 3;
    	double b = 2.5;
    	double c = -0.5;
    	double D = b*b - 4*a*c;
    	double x1, x2;
    	if(Math.sqrt(D) > 0)
    	{
    		if((2*a) == 0)
    		{
    			System.out.print("x1=0.0\nx2=0.0\n");
    		}
    		else
    		{
    		x1 = (-b + Math.sqrt(D))/(2*a);
    		x2 = (-b - Math.sqrt(D))/(2*a);
    		System.out.print("x1="+x1+"\n"+"x2="+x2+"\n");
    		}
    	}
    		else if(Math.sqrt(D) == 0){
    		if((2*a) == 0)
    		{
    			System.out.print("x1=\nx2=\n");
    		}
    		else
    		{
    		x1 = (-b + Math.sqrt(D))/(2*a);
    		x2 = (-b - Math.sqrt(D))/(2*a);
    		System.out.print("x1="+x1+"\n"+"x2="+x2+"\n");
    		}
    	}
    		else {
    		 	System.out.print("x1= \nx2= \n");
    			 }
    	
    }
}