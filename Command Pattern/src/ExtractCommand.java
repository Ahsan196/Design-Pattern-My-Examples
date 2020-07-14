
public class ExtractCommand implements Command{

	Chromatophores chm;
	  public ExtractCommand(Chromatophores ch){
	    this.chm = ch;
	  }
	 
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		chm.Extract();
	}

}
