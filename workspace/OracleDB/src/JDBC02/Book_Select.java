package JDBC02;

import java.util.ArrayList;

public class Book_Select {

	public static void main(String[] args) {
		// DAO : data acess Object
		BookDao bdao = new BookDao();

		// DTO : data transfer Object 
		ArrayList<BookDto> list = bdao.getBooklist();
		
		System.out.println("도서번호 \t 출판년도 \t 입고가격 \t 대여가격 \t 등급 \t 제목 ");
		System.out.println("-----------------------------------------------------");
		for(BookDto bdto : list) 
			System.out.printf("%4d\t%d\t%d\t%d\t%s\t%s\n",
					bdto.getBooknum(), bdto.getMakeyear(), bdto.getInprice(), bdto.getRentprice(),
					bdto.getGrade(), bdto.getSubject());
		
	}

}
