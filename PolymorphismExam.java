/**
 * 다형성 polymorphism : 부모의 참조변수에 자식의 객체를 저장할 수 있는 성질.
 * 참조 변수의 타입에따라 사용할수 있는 멤버가 달라진다.
 */
public class Polymorphism {
	public static void main(String[] args) {
		
		
//		SportCar sc = new SportCar();
//		Car c1 = sc;
//		한줄로 처리
		Car c1 = (Car) new SportsCar(); // 형변환 - 컴파일러가 자동형변환
//		SportsCar sc = (SportsCar)c1; // 강제형변환
//		FireCar fc = (FireCar)c1; // 강제형변환
		//컴파일러는 컴파일타임에 체크사항 : 부모 자식간의 상속 관계인지만 체크.
		//현재 컴파일할때는 오류가 없지만 실행할 경우 ClassCastException 예외 발생
		//이러한 경우 작성하기 전에 변환가능한지 체크해줘야한다. instanceof 사용
		
		if(c1 instanceof SportsCar){
			SportsCar sc = (SportsCar)c1;
		}
		
		if(c1 instanceof FireCar){
			SportsCar sc = (SportsCar)c1;
		}
		
		Car cc = new Car();
		SportsCar scc = new SportsCar();
		FireCar fcc = new FireCar();
		WhiteCar wcc = new WhiteCar();
		
		//배열에 저장하기 : 같은 타입의 변수들의 묶음.
		//다형성을 통해 부모 클래스 변수안에 자식클래스들을 넣는다
		Car crr[]  = new Car[4];
		crr[0] = cc;
		crr[1] = scc; // 다형성
		crr[2] = fcc;
		crr[3] = wcc;
		
		
		// for문을 돌면서 crr[i]에 각각의 클래스들의 인스턴스들이 있는지 확인하고 있다면 형변환후 출력.
		for (int i = 0; i < crr.length; i++) {
			 if( crr[i] instanceof SportsCar){
				SportsCar sccc = (SportsCar) crr[i];
				System.out.println("SportsCar 객체 : " + sccc.openRoof);
			}else if(crr[i] instanceof FireCar){
				FireCar fccc = (FireCar) crr[i];
				System.out.println("FireCar 객체 : " + fccc.water);	
			}else if(crr[i] instanceof WhiteCar){
				WhiteCar wccc = (WhiteCar) crr[i];
				System.out.println("WhiteCar 객체 : " + wccc.isHwanJa);	
			}else if(crr[i] instanceof Car){
				System.out.println("Car 객체 : " + crr[i].speed);
			}
			
		}
	} // end of main
} // end of class

class Car {
	int speed;
}

class SportsCar extends Car {
	boolean openRoof; // 자동차 뚜겅이 열리는지.
}

class FireCar extends Car {
	boolean water; // 물의양
}

class WhiteCar extends Car {
	boolean isHwanJa; // 환자 탑승여부
}
