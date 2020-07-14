
public class ContractCommand implements Command{

	Chromatophores chm;
	  public ContractCommand(Chromatophores ch){
	    this.chm = ch;
	  }
	 
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chm.Contract();
	}


}
