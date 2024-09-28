package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.comparator.AscCategory;
import com.ohgiraffers.test.model.comparator.DescCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {


    public ArrayList<BookDTO> bookList;


    //// bookList 인스턴스 생성
    public BookManager(){
        bookList = new ArrayList<>();
    }


    ////bookList에 도서 추가
    public void addBook(BookDTO book){
        bookList.add(book);
    }


    ////전달받은 index로 삭제
    public void deleteBook(int index){
        bookList.remove(index);
    }


    //// 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
    // //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
    public int searchBook(String title){

        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getTitle().equals(title)){
                return i;
            }
        }

        return -1;
    }


    //// index에 해당하는 객체 출력
    public void printBook(int index){
        System.out.println(bookList.get(index));
    }


    //// 도서 전체 리스트를 출력
    public void displayAll(){

        for (int i =0; i<bookList.size(); i++){
            System.out.println(i + " : " + bookList.get(i));
        }
    }


    //// 전달받은 매개변수의 값에 따라 정렬(1. 오름차순, 2. 내림차순)
    //// for문을 이용하여 ArrayList<BookDTO> 에 추가
    //// 해당 배열 주소 값 리턴
    public ArrayList<BookDTO> sortedBookList(int select){

        ArrayList<BookDTO> arrayList = new ArrayList<>();
        if (select == 1){
            bookList.sort(new AscCategory());
            for (BookDTO book : bookList){
                arrayList.add(book);
            }
        }else if (select == 2){
            bookList.sort(new DescCategory());
            for (BookDTO book : bookList){
                arrayList.add(book);
            }
        }
        return arrayList;
    }


    //// 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
    public void printBookList(ArrayList<BookDTO> br){

        for(BookDTO book : br){
            System.out.println("book = " + book);
        }
    }
}