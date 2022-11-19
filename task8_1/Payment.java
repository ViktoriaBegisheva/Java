package task8_1;

class Client{
	public Item order(EnumProducts prod,String name,float price) {
		Item product = null;
		switch (prod){
			case JUICE:
				product = new Juice(price,name);
				break;
			case MEAL:
				product = new Meal(price,name);
				break;
			default:
				System.out.println("No such item!");
		}
		return product;
	}

}

public class Payment{
	class Warehouse {
		
		public void get(Item it) {
			System.out.println("Get "+it);
		}
		
		public void find(Item it) {
			System.out.println("Find "+it);
		}
		
		public void sell(Item it) {
			System.out.println("Sell "+it+"\n");
			
		}
	}
	
	private Warehouse ware;
	private Client client;
	float pay;
	
	public Payment(Client client) {
		this.client=client;
		ware = new Warehouse();
	}
	
	public Item order(EnumProducts prod,String name,float price) {
		Item it =client.order(prod,name,price);
		ware.find(it);
		ware.sell(it);
		pay+=it.price;
		return it;
	}
	
	public void finishOrder() {
		System.out.println("Order is over! Sum: "+pay);
	}
	
	public static void main(String[] args) {
		Client cl = new Client();
		Payment p =new Payment(cl);
		p.order(EnumProducts.JUICE, "Appel",20);
		p.order(EnumProducts.MEAL, "Sushi",200);
		p.order(EnumProducts.JUICE, "Appel",15);
		p.finishOrder();
		
		
	}
}

