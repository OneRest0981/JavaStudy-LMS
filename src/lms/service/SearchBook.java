package lms.service;

import lms.model.Book;

import java.util.ArrayList;
import java.util.Objects;

import static lms.service.DataStore.BOOK_LIST;
import static lms.util.InputControl.safeString;

public class SearchBook {

    public static void searchBook () {

        System.out.println("输入要查询到书籍名称");
        String bookName = safeString();
        if (!Objects.equals(bookName, "q")){
            ArrayList<Book> searchBook = new ArrayList<Book>();

            for (Book b : BOOK_LIST) {
                if (Objects.equals(b.bookTitle(), bookName)) {
                    searchBook.add(b);
                }
            }

            if (!searchBook.isEmpty()) {
                System.out.println("查询到相关书籍如下:");
                for (Book b : searchBook) {
                    System.out.println(b);
                }
            } else {
                System.out.println("未查询到相关书籍");
            }
        }else {
            return;
        }
    }




}
