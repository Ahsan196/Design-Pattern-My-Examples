
public class DrinkFactory {
	 public Drink getDrink(String drinkType){
	      if(drinkType == null){
	         return null;
	      }		
	      if(drinkType.equalsIgnoreCase("Marinda")){
	         return new Marinda();
	         
	      } else if(drinkType.equalsIgnoreCase("CocaCola")){
	         return new CocaCola();
	         
	      } else if(drinkType.equalsIgnoreCase("Seven7Up")){
	         return new Seven7Up();
	      }
	      else if(drinkType.equalsIgnoreCase("Pepsi")){
		         return new Pepsi();
		      }
	      
	      return null;
	   }
}
