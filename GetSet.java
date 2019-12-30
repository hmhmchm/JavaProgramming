public class CircleDemo{
  public static void main(String[] args){
    Circle myCircle = new Circle();
    
    myCircle.setRadius(10.0);
    
    myCircle.show(myCircle.getRadius(), myCircle.findArea());
  }
}

class Circle{
  private double radius; // 내부 클래스에서만 허용
  
  public double getRadius(){
    this.radius = r;
  }
  
  public void setRadius(double r){
    this.radius = r;
  }
  
  double findArea(){
    return 3.14 * radius * radius;
  }
  
  void show(double x, double y){
    System.out.printf("반지름 = %.1ㄹ, 넓이 = %.1f\n", x , y);
  }
}
