class Circle{
	private int radius;//원의 반지름
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {//원의 반지름 리턴
		return radius;
	}

	public void setRadius(int radius) {//원의 반지름 설정
		this.radius = radius;
	}
	
}
class CircleManager{
	public static void copy(Circle src,Circle dest) {
		dest.setRadius(src.getRadius());//복사하는 작업
	}
	public static boolean equals(Circle a,Circle b) {//a와b가 같은지 
		return a.getRadius() == b.getRadius();
	}
}
public class TestClass {

	public static void main(String[] args) {
		Circle pizza = new Circle(5); //반지름이 5인 원 생성
		Circle waffle = new Circle(10); //반지름이 10인 원 생성
		
		boolean res = CircleManager.equals(pizza,waffle);
		if(res == true)
			System.out.println("pizza와 waffle의 크기 같음");
		else
			System.out.println("pizza와 waffle의 크기 다름");
		
		CircleManager.copy(pizza,waffle);//pizza의 반지름을 waffle 반지름으로 복사
		res = CircleManager.equals(pizza, waffle); //pizza와 waffle의 반지름 비교
		if(res == true)
			System.out.println("pizza와 waffle의 크기 같음");
		else
			System.out.println("pizza와 waffle의 크기 다름");

	}

}
