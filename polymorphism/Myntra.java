package polymorphism;

class Myntra{
	void buy(String Name) {
		System.out.println("product name is: "+Name);
	}
	void buy(int cost)
	{
		//buy("Shirt");
		System.out.println("the cost of the product ="+cost);
	}
	void buy(String Name,int cost) {
		//buy(30000);
		System.out.println("the product of :"+Name+"is cost is ="+cost);
	}
	void buy(int cost,String Name){
		//buy("tshirt",10000);
		System.out.println("the "+cost+"is the cost of product is: "+Name);
	}
}
