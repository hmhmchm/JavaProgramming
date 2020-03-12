public class Tiger extends Animal {
 
    public String habitat;
     
    public void showHabitat(){
        System.out.printf("%s는 %s에 살아\n",name,habitat);
    }
     
    //오버라이딩
    public void showName(){
        System.out.println("오버라이딩 보안상 이름을 말할 수 없습니다.");
    }
     
    //오버로딩
    public void showName(String yourName){
        System.out.printf("오버로딩 %s 안녕, 나는 %s라고 해\n",yourName, name);
    }
}
