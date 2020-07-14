
public class DrinkMaker {
	
	   private Drink pepsi;
	   private Drink marinda;
	   private Drink S7up;
	   private Drink cc;
	   

	   public DrinkMaker() {
	      cc  = new CocaCola();
	      marinda = new Marinda();
	      pepsi= new Pepsi();
	      S7up = new Seven7Up();
	   }
	   
	   

	   public void makePepsi(){
	      pepsi.pour();
	   }
	   public void makeMarinda(){
	      marinda.pour();
	   }   
	   public void make7up(){
		  S7up.pour();
	   }
	   public void makeCocaCola(){
		  cc.pour();
	   }
}
