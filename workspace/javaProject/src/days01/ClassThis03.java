package days01;
class Student{
	private int bunho;
	private String name;
	private int[] scores;
	private int total;
	private double average;
	
	Student(){
		scores = new int[3];
		name = "홍길남";
		scores[0] = 90;
		scores[1] = 90;
		scores[2] = 90;
	}
	Student(String name) {
		this();
		this.name =name;
	}
	Student(String name , int s1, int s2, int s3){
		this(name);
		scores[0] = s1;
		scores[1] = s2;
		scores[2] = s3;
	}
}	

public class ClassThis03 {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("홍길동");
		Student std3 = new Student("홍길남, 98,97,89");
	}
}



