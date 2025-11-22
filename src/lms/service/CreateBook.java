package lms.service;

import lms.model.Book;

import java.util.ArrayList;
import java.util.Objects;

import static lms.service.DataStore.BOOK_LIST;
import static lms.util.InputControl.safeString;

public class CreateBook {

    public static Book createBook () {
        System.out.println("输入书籍名称 / 作者 (空格分割)");
        String title = safeString();

        // 退出创建
        if (Objects.equals(title, "q")) {
            return new Book(-1, "q", null, null);
        }

        String author = safeString();

        return new Book(BOOK_LIST.size(), title, author, "入库");

    }





}
