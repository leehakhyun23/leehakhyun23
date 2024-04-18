package days01;

// 같은 패키지안에서 같은 이름의 클래스는 생성이 불가능하다
//멤버 메소드 : 클래스에 소속되어 클래스 객체에 종속된 메소드
class Animal{
	private String name;
	int age;
	//멤버 메소드는 특별한 경우를 제외하곤 static을 사용하지 않는다
	// 현재 메소드를 호출하는 호출객체 (a1,a2) 를 별도의 매개 변수로 받지 않아도 전달되어져 있다.
	public void prn() {
		// 호출 객체는 this 로 전달된다. 안보인다. 모르게 전달 된다.
		System.out.println("저의 이름은 " + this.name + " 나이는 " + this.age + "살입니다");
	}
	
	public void input(String name, int age) {
		this.name = name;
		this.age =age;
	}
	// 멤버변수, 멤버메소드들은 필요한만큼 자유롭게 정의 할 수 있다.
	/*
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getage() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	*/
	//위 네개의 메서드들을 게터세터라고 부름
	//보통 멤버변수의 값을 저장하거나 얻기위한 메소드인데
	//그 목적만 있다면 메소드 이름이 반드시 위와 같지 않아도됌
	//그러나 getter setter 개발자가 호출하여 사용하기도 하지만
	// 시스템이 또는 컴파일러가 사용하기도 때매 약속된 이름 get변수이름 set변수르이름을 사용하는것이 일반적임.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 직접 입력해서 생성하면 오타가 있을 수 있으므로 메뉴를 통해 getter/setter를 생성할 수 있다.
	
}

//private : 클래스 내부에서만 사용가능한 멤버를 정의하는 키워드
//public : 접근에 제한이 없는 멤버를 정의하는 키워드 
//protected: child class에서만 자유롭게 접근이 가능. 상속 단원에서 자세히 학습 
//default : 접근 지정자를 지정하지 않으면 자동으로 갖게되는 접근지정자이며,
// 			같은 패키지내에서 public 처럼 자유롭게 접근 가능하다. 외부패키지에선 private나 마찬가지

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal();
		Animal a2 = new Animal();
		/*a1.name = "댕댕";
		a1.age= 10;
		a2.name = "냥냥";
		a2.age= 6;*/
		a1.input("댕댕이",10);
		a2.input("냥냥이" , 5);
		prn(a1);
		a1.prn();
		prn(a2);
		a2.prn();
		//System.out.println("저의 이름은 " + a1.name + " 나이는 " + a1.age + "살입니다");
		//System.out.println("저의 이름은 " + a2.name + " 나이는 " + a2.age + "살입니다");
	}
	private static void prn(Animal a1) {
		System.out.println("저의 이름은 " + a1.getName() + " 나이는 " + a1.getAge() + "살입니다");
	}

}
