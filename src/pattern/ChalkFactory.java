package pattern;

public class ChalkFactory {

	Context context = new Context();

	public void makeChalks(String color) {
		System.out.println("Welcome to Chalk Factory-3.\nWe are making your color chalks with color:"+color);
		 StartState startState = new StartState();
	     startState.doAction(context);

	     System.out.println("Work State:"+context.getState().toString());
	     System.out.println();
	     try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your "+color+" chalks are ready.Please collect from delivery Section");
		   StopState stopState = new StopState();
		      stopState.doAction(context);

		      System.out.println("Work State:"+context.getState().toString());
			     System.out.println();			 
			 
	}
	public void makeBoard(String color) {
		System.out.println("Welcome to Chalk Factory-3.\nWe are making your color board with color:"+color);
		 StartState startState = new StartState();
	     startState.doAction(context);

	     System.out.println("Work State:"+context.getState().toString());	
	     System.out.println();
	     try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your "+color+" board is ready.Please collect from delivery Section");
		   StopState stopState = new StopState();
		      stopState.doAction(context);

		      System.out.println("Work State:"+context.getState().toString());
			 
			     System.out.println();
	}
	public void makeSideWalkBoard(String content) {
	System.out.println("Welcome to Chalk Factory-3.\nWe are making your sidewalk board with given content.\nContent:"+content);
	 StartState startState = new StartState();
     startState.doAction(context);

     System.out.println("Work State:"+context.getState().toString());	 
     System.out.println();
     try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Your sidewalk board is ready.Please collect from delivery Section");
	
	     
	     

	      StopState stopState = new StopState();
	      stopState.doAction(context);

	      System.out.println("Work State:"+context.getState().toString());
		     System.out.println();
		 
	}
	
	
	
}
