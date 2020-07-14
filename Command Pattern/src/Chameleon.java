import java.util.concurrent.TimeUnit;

public class Chameleon {
	public static void main(String[] args)    {
	    Brain br = new Brain();
	    Chromatophores ch = new Chromatophores();
	    Command c1 = new ExtractCommand(ch);
	    Command c2 = new ContractCommand(ch);
	    //Extract
	    br.setCommand(c1);
	    br.SendSignal();
	    try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //Contract
	    br.setCommand(c2);
	    br.SendSignal();
	  }
}
