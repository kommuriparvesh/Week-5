package pattern;

import java.util.Scanner;

public class StateDesignPattern {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Chalk Enterprises");
		while(true) {
			ChalkFactory cf=new ChalkFactory();
			System.out.println("Select your service:\n"
					+ "1.Make Chalk\n"
					+ "2.Make Board\n"
					+ "3.Make Side Walk Board\n"
					+ "4.exit");
			int num=sc.nextInt();
			switch(num) {
			case 1:{
				
				System.out.println("Enter Chalk color");
				cf.makeChalks(sc.next());
				break;
			}
			case 2:{
				System.out.println("Enter Board color");
				cf.makeBoard(sc.next());
				break;
			}
			case 3:{
				sc.nextLine();
				System.out.println("Enter SideWalk Board content");
				
				String con=sc.nextLine();
				cf.makeSideWalkBoard(con);
				break;
			}
			case 4:
				System.out.println("Exiting........");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				break;
				
			
			}
			
			
		}	
		
	}
		
}
