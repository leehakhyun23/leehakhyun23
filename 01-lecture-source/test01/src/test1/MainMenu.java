package test1;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.List;

public class MainMenu {
    private BookManager bookManager = new BookManager();
    private Scanner sc = new Scanner(System.in);
    public void mainMenu(){

        mainMenu:
        while (true){
            System.out.println("====메뉴======");
            System.out.println("1. 책 추가");
            System.out.println("2. 책 전체 조회");
            System.out.println("3. 책 정보 수정");
            System.out.println("4. 책 정보 삭제");
            System.out.println("0. 프로그램 종료");

            System.out.println("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1 :
                    addList();
                    break;
                case 2 :
                    selectList();
                    break;
                case 3 :
                    updateBook();
                    break;
                case 4 :
                    removeBook();
                    break;
            }




        }

    }
    public void addList(){
        System.out.println(" ==== 책 추가 = ==");
        System.out.println(" 책 제목 입력 : ");
        String name = sc.nextLine();
        System.out.println(" 저자 입력 : ");
        String author = sc.nextLine();

        bookManager.addList(new BookDTO(name, author));
    }
    public void selectList(){
        System.out.println(" 책 전체 조회");
        List<BookDTO> bookList = bookManager.selectList();
        if (!bookList.isEmpty()) {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        } else {
            System.out.println("목록이 존재하지 않습니다.");
        }

    }

    public void updateBook(){
        System.out.println("===== 책 정보 수정 =====");
        System.out.print("수정할 책의 id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 책의 제목 : ");
        String updatename = sc.nextLine();
        System.out.print("수정할 책의 작가 : ");
        String updateauthor = sc.nextLine();

        BookDTO updateBook = new BookDTO(id, updatename, updateauthor);

        if(bookManager.updateBook(updateBook)) {
            System.out.println("성공적으로 수정되었습니다.");
        }else {
            System.out.println("수정할 책을 찾지 못했습니다.");
        }
    }

    public void removeBook(){
        System.out.println("==== 책 삭제====");
        System.out.println(" 삭제할 책의 id : ");
        if(bookManager.removeBook(sc.nextInt())){
            System.out.println("성공적으로 삭제 되었습니다.");
        } else {
            System.out.println("삭제할 책을 찾지 못했습니다.");
        }
        sc.nextLine();
    }
}
