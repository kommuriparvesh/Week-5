package pattern;

public class StartState implements State {

	   public void doAction(Context context) {
	      System.out.println("Work started and it in progress.");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Working State";
	   }
	}