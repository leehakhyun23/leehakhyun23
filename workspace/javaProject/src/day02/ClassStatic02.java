package day02;
class Student{
	int bunho;
	String name;
	int[] scores;
	
	static int cnt = 1;
	// 항상 클래스 관련 불변의 값을 갖고 필요할때 불러쓸 값이 저장되기도 한다. 
	static final String academyname = "himedia";
	Student(){
		bunho = cnt;
		name = "아무노래" + cnt ;
		cnt++;
		scores = new int[3];
		
	}
}
public class ClassStatic02 {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		System.out.println("훈련기관명" + Student.academyname);
		System.out.println("학생수 : " + (Student.cnt -1));
		
		System.out.println("int 형 자료의 가장 큰값 " + Integer.MAX_VALUE);
		System.out.println("int 형 자료의 가장 작은값 " + Integer.MIN_VALUE);

	}

}
