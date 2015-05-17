public class Main {
	public static void main(String[] args) {
		Pizza pizza = new Pizza("large", 3, 1, 5);
		System.out.println(pizza.getSize());
		System.out.println(pizza.getNumOfCheese());
		System.out.println(pizza.getNumOfPepperoni());
		System.out.println(pizza.getNumOfHam());
		
		pizza = new Pizza();
		pizza.setSize("medium");
		pizza.setNumOfCheese(2);
		pizza.setNumOfPepperoni(4);
		pizza.setNumOfHam(1);
		System.out.println(pizza.getSize());
		System.out.println(pizza.getNumOfCheese());
		System.out.println(pizza.getNumOfPepperoni());
		System.out.println(pizza.getNumOfHam());
		
		System.out.println(pizza.calcCost());
		System.out.println(pizza.toString());
		System.out.println(pizza.equals(new Pizza("large", 2, 4, 1)));
		System.out.println(pizza.equals(new Pizza()));
		System.out.println(pizza.equals(new Pizza("medium", 2, 4, 1)));
	}
}