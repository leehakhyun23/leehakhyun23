package day02;

class MemberCall{
	int iv = 10; // 인스턴스 변수
	static int sv =20; // 스태틱 변수 
	int iv2 = sv; // 스태틱 변수로 인스턴스변수값을 초기화 가능
	static int sv2 =new MemberCall().iv;
	
	void instanceMethod1() { // 인스턴스 메소드
		System.out.println(iv); // 인스턴스 메소드에서는 인스턴스 변수 사용 0
		System.out.println(sv); // 인스턴스 메소드에서는 스태틱 변수 사용 0
		intanceMethod2(); // 인스턴스 메소드에서는 인스턴스 메소드 호출 0
		staticMethod2(); // 인스턴스 메서드에서는 스태틱 메소드 호출 0
	}
	static void staticMethod() { //스태틱 메소드
		//System.out.println(iv); // 인스턴스 메소드에서는 인스턴스 변수 사용 x
		System.out.println(sv); // 인스턴스 메소드에서는 스태틱 변수 사용 0
		//intanceMethod2(); // 인스턴스 메소드에서는 인스턴스 메소드 호출 x
		staticMethod2(); // 인스턴스 메서드에서는 스태틱 메소드 호출 0
	}
	void intanceMethod2() {
		
	}
	static void staticMethod2() {
		
	}
}

public class ClassStatic03 { 

	public static void main(String[] args) {
		//스태틱 멤버는 객체 생성없이 바로 사용이 가능
		MemberCall.sv= 300;
		MemberCall.staticMethod();
		
		//인스턴스 메소드는 객체생성 후에 사용이 가능
		MemberCall mc = new MemberCall();
		mc.iv = 30;
		mc.instanceMethod1();

		
	}

}
