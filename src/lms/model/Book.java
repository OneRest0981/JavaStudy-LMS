package lms.model;

public class Book {

    int id;
    String title;
    String author;
    String status; // 状态 入库/出库

    public Book (int id, String title, String author, String status) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;

    }

    public void bookInfo () {
        int printId = id + 1;
        System.out.println("ID:" + printId + " 《" + title + "》 By:" + author + " 当前状态: " + status);

    }
    public int bookId () { return this.id; } // 获取序号

    public String bookTitle () { return this.title; } // 获取书名

    public String bookAuthor () { return this.author; } // 获取作者

    public String bookStatus () { return this.status; } // 获取作者

    public void setStatus (String status) {
        this.status = status;
    }

    public void setId (int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        int printId = id + 1;
        return "ID:" + printId + " 《" + title + "》 By:" + author + " 当前状态: " + status;
    }



}
