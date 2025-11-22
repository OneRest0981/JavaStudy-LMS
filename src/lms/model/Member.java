package lms.model;

import java.util.ArrayList;

public class Member {

    String name;
    ArrayList<Book> borrowedBooks;

    public Member(String name, ArrayList<Book> borrowedBooks) {

        this.name = name;
        this.borrowedBooks = borrowedBooks;

    }

    public String getName() {return this.name;}
    public ArrayList<Book> getBorrowedBooks() {return this.borrowedBooks;}

    public void setBorrowedBooks (ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }


    public void memberInfo () {
        System.out.println(name + "\n借阅书籍:");
        for (Book b : borrowedBooks){
            System.out.println(b);
        }

    }

    @Override
    public String toString() {

        System.out.println(name + "\n借阅书籍:");
        for (Book b : borrowedBooks){
            System.out.println(b);
        }
        return "\n";
    }
}
