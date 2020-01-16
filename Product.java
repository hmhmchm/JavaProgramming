package mall;

public abstract class Product {
	private String pName;
	private int price;
	
	public Product(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	public String getpName() {
		return pName;
	}

	public int getPrice() {
		return price;
	}
	
	public void printDetail() {
		System.out.print("상품명: " + pName + ", ");
		System.out.print("가격: " + price + ", ");
		printExtra();
	}
	
	public abstract void printExtra();
}
