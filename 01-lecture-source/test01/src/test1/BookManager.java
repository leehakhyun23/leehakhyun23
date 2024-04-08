package test1;
import java.awt.print.Book;
import java.util.List;
import java.util.ArrayList;

public class BookManager {
    private List<BookDTO> bookList = new ArrayList<>();

    public void addList(BookDTO book){
        bookList.add(book);
    }

    public List<BookDTO> selectList() {
        return bookList;
    }
    public boolean updateBook(BookDTO updateBook){

        BookDTO old = null;

        for(int i = 0; i< bookList.size(); i++){
            if(bookList.get(i).getId() == updateBook.getId()){
                old = bookList.set(i, updateBook);
            }
        }
        return old != null;

    }

    public boolean removeBook(int id){
        BookDTO old = null;
        for(int i = 0; i< bookList.size(); i++){
            if(bookList.get(i).getId() == id){
                old = bookList.remove(i);
            }
        }
        return old != null;
    }

}
