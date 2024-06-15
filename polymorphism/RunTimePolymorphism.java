package polymorphism;

public class RunTimePolymorphism {
	
	static void display(OrderFoodApp re) {
		re.order();
	}
	public static void main(String[] args) {
		display(new Swiggy());
		display(new Zomota());
		
	}

}
