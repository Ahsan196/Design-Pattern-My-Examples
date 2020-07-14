import java.util.concurrent.TimeUnit;

public class Chromatophores {
	public static final String ANSI_RED = "\u001B";
	public void Extract(){
		System.out.println("\u001b[0mChromatophores are extracting.");
		System.out.println("Colour\u001b[0m Changing in Progress.");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\u001b[31mColour Changed.");
	  }
	  public void Contract(){
			System.out.println("\u001b[0mChromatophores are contracting.");
			System.out.println("\u001b[0mColour Changing in Progress.");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\u001b[32mColour Changed.");
	  }
}
