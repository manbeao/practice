package com.ohgiraffers.test.model.comparator;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        // 양수, 음수 형태로 두 비교값이 순서를 바꿔야 하는지를 알려주기 위한 용도의 변수
        int result = 0;

        if(o1.getCategory() > o2.getCategory()) {

            // 오름차순을 위해 순서를 바꿔야 하는 경우 양수 반환
            result = 1;

        } else if(o1.getCategory() < o2.getCategory()) {

            // 이미 오름차순 정렬로 되어 있는 경우 음수를 반환
            result = -1;
        } else {

            // 두 값이 같은 경우는 0을 반환
            result = 0;
        }
        return result;
    }
}

