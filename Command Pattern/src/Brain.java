
public class Brain {
	private Command command;
	  public void setCommand(Command command){
	    this.command = command;
	  }
	  
	  public void SendSignal(){
	    command.execute();
	  }
	
}
