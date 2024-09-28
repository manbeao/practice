package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu{

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();


    public BookMenu(){}

    public void menu(){

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("번호를 입력하세요 : ");
            int num = sc.nextInt();
            System.out.println();

            switch (num){
                case 1:
                    bm.addBook(inputBook());
                    break;


                case 2:
                    System.out.println("1. 오름차순 2. 내림차순");
                    System.out.print("원하는 도서 정렬을 선택하세요 : ");
                    int up = sc.nextInt();

                    if (up==1 || up==2){
                        System.out.println("선택한 방식으로 도서를 정렬 합니다");
                        ArrayList<BookDTO> read = bm.sortedBookList(up);
                        bm.printBookList(read);
                    }
                    else {
                        System.out.println("번호를 잘못입력하였습니다");
                    }break;


                case 3: String deleteSearch = inputBookTitle();
                    int deleteBook = bm.searchBook(deleteSearch);
                    if (deleteBook != -1){
                        bm.deleteBook(deleteBook);
                        System.out.println("성공적으로 삭제");

                    }else{
                        System.out.println("삭제할 글이 존재하지 않음");
                    }break;


                case 4:
                    String index = inputBookTitle();
                    int searchBookId = bm.searchBook(index);
                    if (searchBookId == -1){
                        System.out.println("조회한 도서가 존재하지 않음");
                    }else {
                        bm.printBook(searchBookId);
                    }break;


                case 5:
                    bm.displayAll();
                    break;

            }

            if (num==6){
                break;
            }


        }



    }
    public BookDTO inputBook(){

        BookDTO bookDTO = new BookDTO();

        System.out.print("도서 번호를 입력해주세요.: ");
        int bookNum = sc.nextInt();
        bookDTO.setbNo(bookNum);
        System.out.println();

        System.out.print("도서 제목을 입력해주세요. : ");
        sc.nextLine();
        String bookTitle = sc.nextLine();
        bookDTO.setTitle(bookTitle);
        System.out.println();

        System.out.print("도서 장르를 선택하세요. (1. 인문,  2. 자연과학,  3. 의료,  4. 기타) : ");
        int bookCategory = sc.nextInt();
        bookDTO.setCategory(bookCategory);
        System.out.println();

        System.out.print("도서 저자를 입력해주세요. : ");
        sc.nextLine();
        String bookAuthor = sc.nextLine();
        bookDTO.setAuthor(bookAuthor);
        System.out.println();

        return bookDTO;
    }

    public String inputBookTitle(){

        BookDTO bookDTO = new BookDTO();
        System.out.print("도서 제목을 입력해 주세요 : ");
        String bookTitle = sc.next();
        bookDTO.getTitle();
        return bookTitle;
    }
}