package com.ohgiraffers.level02.normal.book.run;

import com.ohgiraffers.level02.normal.book.model.dto.BookDto;

public class Application {
    public static void main(String[] args) {
        BookDto bookDto= new BookDto();
        bookDto.printInformation();

        System.out.println();
        BookDto bookDto1= new BookDto("자바의 정석", "도우출판", "남궁성");
        bookDto1.printInformation();

        System.out.println();
        BookDto bookDto2 = new BookDto("홍길동전","활빈당","허균",500000,0.5);
        bookDto2.printInformation();
    }
}
