package JDBC03;

import java.util.Scanner;

public class MemberDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원 번호 입력하세요");
		int membernum = Integer.parseInt(sc.nextLine());
		MemberDao mdao = new MemberDao();
		MemberDto mdto = mdao.getMember(membernum);
			
		if(mdto == null) {
			System.out.println("입력한 번호의 회원이 존재하지 않습니다. \n  프로그램을 종료한다");
			return;
		}
		int result = mdao.deleteMember(membernum);
		if( result == 1 ) System.out.println("레코드 삭제 성공");
		else System.out.println("레코드 삭제 실패" + result);
		
		

	}

}
