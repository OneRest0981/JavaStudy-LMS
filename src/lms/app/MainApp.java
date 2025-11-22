package lms.app;

import static lms.service.AddBook.addBook;
import static lms.service.BorrowBook.borrowBook;
import static lms.service.DataStore.*;
import static lms.service.DelBook.delBook;
import static lms.service.SearchBook.searchBook;
import static lms.util.InputControl.SC;

public class MainApp {

    public static void menu() {
        while (true){
            System.out.println(
                    "\n当前选中 菜单:\n" +
                            "1.查询书单\n" +
                            "2.添加书籍\n" +
                            "3.删除书籍\n" +
                            "4.查询书籍\n" +
                            "5.借阅书籍\n" +
                            "6.查询已注册会员\n" +
                            "7.注册会员\n" +
                            "q.退出并保存\n");
            String choose = SC.next();
            switch (choose) {
                case "1":
                    getBookList();
                    break;
                case "2":
                    addBook();
                    break;
                case "3":
                    delBook();
                    break;
                case "4":
                    searchBook();
                    break;
                case "5":
                    borrowBook();
                    break;
                case "6":
                    getMember();
                    break;
                case "7":
                    createMember();
                    break;
                case "q":
                    return;
                default:
                    System.out.println("输入无效 请重试:");
            }
        }



    }



    public static void main(String[] args) {
        menu();

    }





}
