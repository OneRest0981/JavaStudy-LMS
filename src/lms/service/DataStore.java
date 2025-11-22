package lms.service;

import lms.model.Book;
import lms.model.Member;

import java.util.ArrayList;
import java.util.Objects;

import static lms.util.InputControl.SC;
import static lms.util.InputControl.safeString;

public class DataStore {

    public static final ArrayList<Book> BOOK_LIST = new ArrayList<>();;

    // 获取全部书
    public static void getBookList() {
        System.out.println();
        for (Book b : BOOK_LIST) {
            System.out.println(b.toString());
        }
        System.out.println();


    }

    // 更新书籍列表
    public static void updateBookList() {

        for (int i = 0; i <BOOK_LIST.size(); i++) {
            BOOK_LIST.get(i).setId(i);
        }

    }

    public static final ArrayList<Member> MEMBER = new ArrayList<>();;
    // 获取全部成员
    public static void getMember() {
        System.out.println();
        for (Member b : MEMBER) {
            System.out.println(b.toString() + "\n");
        }
        System.out.println();


    }

    // 验证系统
    public static Member checkMember(String name) {

        for (Member m : MEMBER){
            if (Objects.equals(name, m.getName())){
                System.out.println("验证成功");
                return m;
            }
        }
        return null;


    }

    // 注册会员
    public static void createMember() {
        System.out.println("输入注册名称:");
        String name = safeString();
        Member member = new Member(name, new ArrayList<>());
        MEMBER.add(member);

        System.out.println("成功注册: \n" + member);
        System.out.println("\n");



    }



}
