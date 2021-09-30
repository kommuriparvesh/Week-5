package pattern;

public class StopState implements State {

	   public void doAction(Context context) {
	      System.out.println("Work completed and in stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}