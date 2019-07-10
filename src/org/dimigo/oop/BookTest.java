package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book = new Book();

        Book book2 = new Book();

        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("Math's Bible");
        book.setAuthor("민경도");
        book.setPage(400);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        Book book3 = new Book("언어의 정원", "신카이 마코토", 50);

        System.out.println(book3.getTitle());
        System.out.println(book3.getAuthor());
        System.out.println(book3.getPage());
    }
}
