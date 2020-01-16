package mall;

public class ShopLauncher {

	public static void main(String[] args) {
		IShop shop = new MyShop();
		shop.setTitle("My Shop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
