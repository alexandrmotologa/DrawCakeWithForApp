import java.util.Scanner;

public class DrawCakeWithForApp {

	public static void main(String[] args) {
		
		final int SMOKE  = 1; 
	    final int FIRE   = 2; 
	    final int CANDLE = 3; 
	    final int CREAM  = 4; 
	    final int BASE   = 5; 
	    
		Scanner in = new Scanner(System.in);
		System.out.print("Please type width of cake (number): ");
		int value = in.nextInt();

	    for(int level=1; level<5 ;level++) {
	        switch(level) {
	            case SMOKE:  
	            	for(int lines=1; lines<=2; lines++) {
	            		for(int elements=1; elements<=(value/2); elements++) {
	            			System.out.print(elements == 1 ? " . " :  ". ");           	                        
	            		}
                    System.out.println();
                }
	            	break;
	            case FIRE: 
                    for(int elements=1; elements<=(value/2); elements++) {
                    	System.out.print(elements == 1 ? " ^ " :  "^ ");   
                    }
                    System.out.println();
                   
	            	break;
	            case CANDLE:
	            	for(int elements=1; elements<=(value/2); elements++) {
	            		System.out.print(elements == 1 ? " | " :  "| ");   
                }
                System.out.println();
	            	break;
	            case CREAM: 
	            	for(int elements=1; elements<=value; elements++) {
	            		System.out.print("~");

                }
	            System.out.print((value%2==0) ? "~" : "");
                System.out.println();

	            case BASE:
	                 for(int lines=1; lines<=3; lines++) {
	                     for(int elements=1; elements<=value; elements++) {
	                         System.out.print("#");
	                     }
	                     System.out.print((value%2==0) ? "#" : "");
	                     System.out.println();
	                 }
	               break;
	        }
	    }

	}

}
