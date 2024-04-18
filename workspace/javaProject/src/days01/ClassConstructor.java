package days01;
// 생성자
//클래스의 객체가 생성될 때, 멤버필드의 초기화 목적으로 사용되는 메소드
//new 에 각각의 객체가 생성 될 때, 서로다른 메모리를 할당해서 서로 겹치지 않게 하는 기능도 포함

//생성자의 특징
/*1.멤버메소드이다
 * 2. 클래스의 이름과 동일한 이름을 갖는 메소드
 * 3. 리턴값이 없는 메소드 
 * */
class Aclass{
	private int age;
	// 생성자는 별도로 정의하지 않아서 디폴트 생성자(매개변수가 없는 )가 존재한다
	// 컴파일러는 클래스안에 생성자 정의 내역이 없다면 자동으로 피톨자 생성자를 만든다.
	// 생성자가 하는 일 : 메모리를 확보하고 확보된 메모리 주소를 보이지 않는 메소드의 리턴값으로 반환하는 일
	Aclass(){
		age= 100;
	//생성자 원래의 일을 하고 멤버변수에 100도 초기화한다.
		System.out.println("객체가 생성되었습니다. Aclass의 생성자가 호출되었습니다");
	}
	public int getAge() {return age;}
	public void setAge() {this.age = age;}
}
public class ClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aclass a1 = new Aclass(); // Aclass(): 생성자 호출
		
	}

}
