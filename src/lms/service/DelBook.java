package lms.service;

import lms.model.Book;

import java.util.Objects;

import static lms.service.CreateBook.createBook;
import static lms.service.DataStore.*;
import static lms.util.InputControl.*;

public class DelBook {
    /**
     *
     *  id 1
     *  书名
     *
     */
    public static void delBook () {

        while (true){

            getBookList();

            System.out.println("当前选中 删除书籍:\n" +
                    "1.id <id> -> 按id删除\n" +
                    "2.<书名> -> 按书名删除\n" +
                    "3.q -> 返回菜单");

            String type = safeString();

            if (Objects.equals(type, "q")) {
                return;
            }

            // 检查是否是id删除
            if (Objects.equals(type, "id")) {
                int getId = safeInt()-1;

                try {
                    if (getId - 1 > BOOK_LIST.size()) {
                        System.out.println("输入id不在列表中, 请重试");
                        continue;
                    }

                    BOOK_LIST.get(getId).setStatus("正在删除");
                    System.out.println("当前书籍已删除:\n" + BOOK_LIST.get(getId));

                    BOOK_LIST.remove(getId);
                }catch (IndexOutOfBoundsException e){
                    System.out.println("输入id不在列表中, 请重试");
                    continue;
                }

            } else {

                // 按名称删除书籍
                for (Book b : BOOK_LIST) {
                    if (Objects.equals(b.bookTitle(), type)) {
                        b.setStatus("已删除");
                        System.out.println("当前书籍已删除:\n" + BOOK_LIST.get(b.bookId()));
                        BOOK_LIST.remove(b.bookId()); // 删除对应名称的书
                    }
                }


            }
            updateBookList();
        }




    }





}
