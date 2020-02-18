package mall;

public class ShopLauncher {

	public static void main(String[] args) {
		IShop shop = new MyShop(); //객체 생성후 받아오기
		shop.setTitle("My Shop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
