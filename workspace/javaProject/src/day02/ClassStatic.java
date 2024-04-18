package day02;

//static 키워드
//멤버변수, 멤버 메소드에 사용할 수 있는 키워드
// 정적 변수(클래스의 변수), 정적 메소드(클래스의 메소드) 선언할때 사용

//프로그램 실행전부터 메모리에 자리를 확보하고 실행되기를 기다리는 변수/메소드(객체생성과 상관X)

class StaticA{
	int num;
	static int number =500;
	StaticA(){
		num =100;
	}
}
// 정의된 클래스는 순수한 정의내용일뿐 실제로 전재한느 객체는 아니다.

// JVM은 프로그램이 시작되면 static요소들만 따로 모아서 정리합니다.
// 그 중에서도 main 메소드는 실행의 시작으로 인식해서 먼저 실행한다.
public class ClassStatic {

	public static void main(String[] args) {
		
		StaticA s1 = new StaticA();
		System.out.println(s1.num);
		// 1. 인스턴스 객체 생성이 되어야 그 이후에 비로서 멤버변수에 접근해서 저장하고 읽어올수가 있다.
		
		System.out.println(new StaticA().num);
	
		//2. static멤버 변수는 객체의 생성 유무와 전혀 상관없이 그 변수를 사용할 수 있따
		System.out.println(StaticA.number);
		//number 도 멤버변수이기때문에 앞에 소속객체를 써줘야하는데, static은 소속 객체가 없으므로
		//클래스 이름을 써서 사용합니다ㅓ
		//객체생성과 무관하게 생성된 변수이기 때매 객체가 몇개가 생성되든 static변수는 그변수하나만 존재한다
		//객체를 생성하지 않고도 사용할 수 있는 클래스의 멤버변수임
	
	
		// 인스턴스 변수는 생성되는 개체마다 하나씩 생성, 존재하는변수이고
		// 스태틱변수는 현재 프로그램 통틀어서 하남나 존재하는 변수
		
		StaticA s2= new StaticA();
		s2.num = 200;
		System.out.println("S1의 인스턴스 변수 num : " + s1.num);
		System.out.println("S2의 인스턴스 변수 num : " + s2.num);
		StaticA s3 = new StaticA();
		s3.num = 300;
		System.out.println("S3의 인스턴스 변수 num : " + s3.num);
		
		StaticA.number= StaticA.number + 50;
		System.out.println("StaticA 클래스의 static 멤버변수 값 : " + StaticA.number);
		//클래스에는 속해있지만 생성되는 개체에는 별개인 변수
		
		
	}

}
