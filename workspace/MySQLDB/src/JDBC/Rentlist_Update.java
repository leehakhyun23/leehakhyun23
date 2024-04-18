package JDBC;

import java.util.Scanner;

public class Rentlist_Update {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RentDao rdao = RentDao.getInstance();
		RentDto rdto = new RentDto();
		
		
		//수정할 대여기록의 번호 입력
		System.out.print("수정할 대여 기록의 번호를 입력하세요");
		int numseq = Integer.parseInt(sc.nextLine());
		rdto = rdao.getRent(numseq);
		if(rdto == null) {
			System.out.println("입력한 번호의 대여기록이 없습니다, 프로그램이 종료됩니다");
			return;
		}
		// 수정할 대여날짜를 입력
		System.out.printf("날짜 : %s\n", rdto.getRentdate() );
		System.out.printf("수정할 날짜를 입력하세요(yyyy-mm-dd). 수정하지 않으려면 엔터만 입력하세요");
		String rentdate = sc.nextLine(); //20240418
		if(!rentdate.equals("")) rdto.setRentdate(rentdate);
		//수정할 도서번호를 입력, 입력한 번호의 도서가 없으면 다시 입력
		System.out.printf("도서번호 : %s\n", rdto.getBnum() );
		System.out.printf("수정할 도서번호를 입력하세요. 수정하지 않으려면 엔터만 입력하세요");
		String booknum = sc.nextLine();
		if(!booknum.equals("")) rdto.setBnum(Integer.parseInt(booknum));
	
		// 수정할 회원번호를 입력, 입력한 번호의 회원번호가 없으면 다시 입력 
		System.out.printf("회원번호 : %s\n", rdto.getMnum() );
		System.out.printf("수정할 도서번호를 입력하세요. 수정하지 않으려면 엔터만 입력하세요");
		String membernum = sc.nextLine();
		if(!membernum.equals("")) rdto.setMnum(Integer.parseInt(membernum));
		// 수정할 할인금액 입력
		System.out.printf("할인금액 : %s\n", rdto.getDiscount() );
		System.out.printf("수정할 할인금액을 입력하세요. 수정하지 않으려면 엔터만 입력하세요");
		String discount = sc.nextLine();
		if(!discount.equals("")) rdto.setDiscount(Integer.parseInt(discount));
		
		// rentDto에 모두 담아서 updateRent 메소드에 전송
		int result = rdao.UpdateRent(rdto);
		if(result == 1) System.out.println("수정 완료");
		else System.out.println("수정이 실패하였습니다.");
	}
}


