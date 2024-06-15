package polymorphism;

class OrderFoodApp{
	void order() {
		System.out.println("food order");
	}
}
class Swiggy extends OrderFoodApp{
	void order() {
		super.order();
		System.out.println(" is food ready in swiggy");
	}
}
class Zomota extends OrderFoodApp{
	void order() {
		super.order();
		this.ram();
		System.out.println("the food is ready in zomota");
	}
	void ram() {
		System.out.println("hello ram");
	}
}
