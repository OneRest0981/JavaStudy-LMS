package lms.service;

import lms.model.Book;

import java.util.ArrayList;
import java.util.Objects;

import static lms.service.CreateBook.createBook;
import static lms.service.DataStore.BOOK_LIST;
import static lms.util.InputControl.SC;

public class AddBook {

    public static void addBook () {

        while (true) {
            Book getNewBook = createBook();
            if (Objects.equals(getNewBook.bookTitle(), "q")) {
                return;
            }

            BOOK_LIST.add(getNewBook);
            System.out.println("成功添加:");
            getNewBook.bookInfo();
        }



    }





}
