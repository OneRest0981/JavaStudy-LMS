package lms.service;

import lms.model.Book;
import lms.model.Member;

import java.util.ArrayList;
import java.util.Objects;

import static lms.service.DataStore.*;
import static lms.util.InputControl.*;

public class BorrowBook {

    /**
     * 借阅人 书名
     */
    public static void borrowBook() {

        System.out.println("输入 <借阅人>");
        String name = safeString(); // 借阅人
        Member nowMember;

        // 检查借阅人

        Member check = checkMember(name);
        if (check != null){
            nowMember = check;
        }else {
            System.out.println("验证失败! 是否注册新账户:\n1.确认注册\n2.取消注册->返回菜单");
            String choose = SC.next();
            if(Objects.equals(choose, "1")) {
                System.out.println("注册成功");
                nowMember = new Member(name, new ArrayList<>());
                MEMBER.add(nowMember);
            }else return;


        }






        // 借阅书
        ArrayList<Book> searchBook = new ArrayList<>();  // 搜索到的书列表

        System.out.println("输入 <借阅书名>");
        String bookName = safeString();

        if (!Objects.equals(bookName, "q")){ // 退出

            for (Book b : BOOK_LIST) { // 将搜索到的书添加至列表
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




        //确认借阅书的id (防止同时借阅多本
        System.out.println("确认借阅书id");

        ArrayList<Book> borrowBook = nowMember.getBorrowedBooks();  // 借阅的书列表

        int bookId = safeInt()-1;
        for (Book b : searchBook) {
            if(bookId == b.bookId()){
                if(Objects.equals(b.bookStatus(), "借阅中")){
                    System.out.println("借阅失败 该书籍已被借阅\n" + b);
                    return;
                }else {
                    System.out.println("借阅成功\n" + b);
                    BOOK_LIST.get(bookId).setStatus("借阅中"); // 设置书籍状态

                    borrowBook.add(b); // 将书添加至借阅列表
                }
            }
        }

        for(Member m : MEMBER) {
            if(Objects.equals(name, m.getName())) {
                m.setBorrowedBooks(borrowBook);
            }
        }







    }


}
