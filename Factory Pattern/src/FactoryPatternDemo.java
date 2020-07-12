
public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  DrinkFactory drinkFactory = new DrinkFactory();

	      //get an object of Circle and call its draw method.
	      Drink d1 = drinkFactory.getDrink("CocaCola");

	      //call draw method of Circle
	      d1.pour();

	      //get an object of Rectangle and call its draw method.
	      Drink d2 = drinkFactory.getDrink("Marinda");

	      //call draw method of Rectangle
	      d2.pour();

	      //get an object of Square and call its draw method.
	      Drink d3 = drinkFactory.getDrink("Seven7Up");

	      //call draw method of square
	      d3.pour();
	      
	      Drink d4 = drinkFactory.getDrink("Pepsi");

	      //call draw method of square
	      d4.pour();
	}

}
