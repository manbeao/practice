import React, { useEffect, useRef } from 'react';
import { Link } from 'react-router-dom';
import Fbtn1 from '../images/main/folating-btn-dark.png';
import Fbtn2 from '../images/main/folating-btn-click-dark.png';
import Fbtn3 from '../images/main/top-btn-dark.png';
import Fbtn4 from '../images/main/light-btn-dark.png';
import Fbtn5 from '../images/main/test-btn-dark.png';
import Logo from '../images/main/main-logo-dark.png';
import SubTitle from '../images/main/main-subtitle-dark.png';
import Bg1 from '../images/main/main-dark-bg.png';
import Bg3 from '../images/main/main-dark-bg3.png';
import Hand from '../images/main/main3-gost-hand-dark.png';
import Hand2 from '../images/main/main3-hand-dark.png';
import checkMark from '../images/main/check-mark.png';
import Best from '../images/main/best/best.png';
import Best2 from '../images/main/best/best2.png';
import Best3 from '../images/main/best/best3.png';
import Best4 from '../images/main/best/best4.png';
import Bg2 from '../images/main/main2-dark-bg.png';
import BestPost from '../images/main/main2-img1.png';
import BestPost2 from '../images/main/main2-img2.png';
import BestPost3 from '../images/main/main2-img3.png';
import BestPost4 from '../images/main/main2-img4.png';
import '../css/main.css';

function Main() {
    const floatBtn1Ref = useRef(null);
    const floatBtn2Ref = useRef(null);
    const qickMenu1Ref = useRef(null);
    const qickMenu2Ref = useRef(null);
    const qickMenu3Ref = useRef(null);


    // const floatBtn1 = document.getElementById("light");
    // const floatBtn2 = document.getElementById("dark");
    // const qickMenu1 = document.getElementById("top");
    // const qickMenu2 = document.getElementById("mode");
    // const qickMenu3 = document.getElementById("test");


    // floatBtn1.addEventListener('click', function () {
    //     floatBtn1.classList.toggle('dn');
    //     floatBtn2.classList.toggle('dn');
    //     qickMenu1.classList.toggle('dn');
    //     qickMenu2.classList.toggle('dn');
    //     qickMenu3.classList.toggle('dn');
    // });


    // floatBtn2.addEventListener('click',function (){
    //     floatBtn1.classList.toggle('dn');
    //     floatBtn2.classList.toggle('dn');
    //     qickMenu1.classList.toggle('dn');
    //     qickMenu2.classList.toggle('dn');
    //     qickMenu3.classList.toggle('dn');

    // });
    // setTimeout(function() {
    //     qickMenu1.addEventListener('click', function() {
    //         window.scrollTo({
    //             top: 0,
    //             behavior: 'smooth'
    //         });
    //     });
    // }, 3000);

    // const mainLink = document.getElementById("mainbox");
    // const black = document.getElementById("black");
    // mainLink.addEventListener('mouseover',function (){
    //     mainLink.style.backgroundColor="#4A7236";
    //     mainLink.style.border="1px solid white";
    //     black.style.color="#fff";
    // });
    // mainLink.addEventListener('mouseout',function (){
    //     mainLink.style.backgroundColor="#fff";
    //     mainLink.style.border="none";
    //     black.style.color="#4B9D21";
    // });

    // document.addEventListener("DOMContentLoaded", function() {
    //     const calendar = document.getElementById('calendar');
    //     const checkAttendanceBtn = document.getElementById('checkAttendanceBtn');
    //     const monthTitle = document.getElementById('monthTitle');
    //     const date = new Date();
    //     const month = date.getMonth();
    //     const year = date.getFullYear();
    //     const daysInMonth = new Date(year, month + 1, 0).getDate();
    //     const today = date.getDate();
    //     const monthNames = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"];
    //     const dayNames = ["일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"];

    //     // 월 표시
    //     monthTitle.textContent = monthNames[month];

    //     // 요일 헤더 추가
    //     dayNames.forEach(day => {
    //         const dayHeader = document.createElement('div');
    //         dayHeader.classList.add('day-header');
    //         dayHeader.textContent = day;
    //         calendar.appendChild(dayHeader);
    //     });

    //     // 첫 번째 날의 요일에 맞추어 빈 칸 추가
    //     const firstDayOfMonth = new Date(year, month, 1).getDay();
    //     for (let i = 0; i < firstDayOfMonth; i++) {
    //         const emptyDiv = document.createElement('div');
    //         calendar.appendChild(emptyDiv);
    //     }

    //     // 달력 만들기
    //     for (let i = 1; i <= daysInMonth; i++) {
    //         const dayDiv = document.createElement('div');
    //         dayDiv.classList.add('day-cell');
    //         dayDiv.textContent = i;
    //         dayDiv.id = `day-${i}`;
    //         calendar.appendChild(dayDiv);
    //     }
    //     // 출석 상태 로드
    //     fetch('/attendanceStatus')
    //         .then(response => response.json())
    //         .then(dates => {
    //             dates.forEach(dateStr => {
    //                 const [checkedYear, checkedMonth, checkedDay] = dateStr.split("-");
    //                 if (parseInt(checkedYear) === year && parseInt(checkedMonth) === month + 1) {
    //                     const checkedDiv = document.getElementById(`day-${parseInt(checkedDay)}`);
    //                     if (checkedDiv) {
    //                         checkedDiv.classList.add('checked');

    //                         // 중복 체크 마크 방지
    //                         if (!checkedDiv.querySelector('img')) {
    //                             const img = document.createElement('img');
    //                             img.src = '/images/main/check mark.png';
    //                             checkedDiv.appendChild(img);
    //                         }
    //                     }
    //                 }
    //             });
    //         })
    //         .catch(error => console.error('출석 상태 로드 실패:', error));


    //     // 출석 체크 버튼 클릭 이벤트
    //     checkAttendanceBtn.addEventListener('click', function() {
    //         // 서버로 출석 체크 요청 보내기
    //         fetch('/attendenceCheck', { method: 'POST' })
    //             .then(response => response.text())
    //             .then(message => {
    //                 alert(message);

    //                 if (message === "출석 체크가 완료되었습니다.") {
    //                     const todayDiv = document.getElementById(`day-${today}`);
    //                     todayDiv.classList.add('checked');

    //                     checkAttendanceBtn.style.backgroundColor = "#0E2813";
    //                     checkAttendanceBtn.style.width = "560px";
    //                     checkAttendanceBtn.style.color = "#C0CBBC";
    //                     checkAttendanceBtn.style.left = "400px";
    //                     checkAttendanceBtn.textContent = "출석체크를 완료 했습니다";

    //                     document.getElementById("hand").classList.remove("dn");

    //                     // 중복 체크 마크 방지
    //                     if (!todayDiv.querySelector('img')) {
    //                         const img = document.createElement('img');
    //                         img.src = '/images/main/check mark.png';
    //                         todayDiv.appendChild(img);
    //                     }

                      

    //                 }
    //             })
    //             .catch(error => console.error('출석 체크 실패:', error));
    //     });
    // });

    return (
        <main>
            <div className="main1">
                <div className="qickBtn">
                    <img ref={floatBtn1Ref} src={Fbtn1} id="light" className="tr" alt="플로팅 버튼" />
                    <img ref={floatBtn2Ref} src={Fbtn2} className="dn tr" id="dark" alt="플로팅 버튼 클릭" />
                    <div className="clikbtn tr">
                        <img ref={qickMenu1Ref} src={Fbtn3} className="dn" id="top" alt="탑버튼" />
                        <img ref={qickMenu2Ref} src={Fbtn4} className="dn" id="mode" alt="테마 변경" />
                        <Link to="/mbti">
                            <img ref={qickMenu3Ref} src={Fbtn5} className="dn" id="test" alt="MBTI 테스트" />
                        </Link>
                    </div>
                </div>
                <div className="logo">
                    <img src={Logo} alt="남호정 메인 로고" id="mainLogo" />
                </div>
                <div className="subtitle">
                    <img src={SubTitle} alt="남이 이야기 해주는 호러정원" id="subTitle" />
                </div>
                <img className="bg" src={Bg1} alt="다크모드 메인페이지 배경화면" id="bg" />
                <div className="mainbox tr" id="mainbox" onClick={() => window.location.href = '/mbti'}>
                    <p id="black">나의 공포 MBTI는?</p>
                </div>
            </div>

            <img src={Best} className="ghost" />
            <img src={Best2} className="ghost"/>
            <img src={Best3} className="ghost" />
            <img src={Best4} className="ghost"/>
            <div className="main2">
                <h2>베스트 정원</h2>
                <img src={Bg2} alt="나뭇가지" id="bg2"/>
                    <div className="firstbest">
                        <a className="best">
                            <img src={BestPost} alt="베스트 게시물 이미지1"/>
                                <p  className="ellipsis">개구리의 다리를 자르던 코우군</p>
                                <span className="multiline-ellipsis"> aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</span>
                        </a>

                        <a className="best">
                            <img src={BestPost2} alt="베스트 게시물 이미지2"/>
                                <p  className="ellipsis">개구리의 다리를 자르던 코우군</p>
                                <span className="multiline-ellipsis" >aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</span>
                        </a>

                        <a className="best">
                            <img src={BestPost3} alt="베스트 게시물 이미지3"/>
                                <p  className="ellipsis">개구리의 다리를 자르던 코우군</p>
                                <span className="multiline-ellipsis">aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</span>
                        </a>

                        <a className="best" >
                            <img src={BestPost4} alt="베스트 게시물 이미지4"/>
                                <p  className="ellipsis">개구리의 다리를 자르던 코우군</p>
                                <span className="multiline-ellipsis">aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</span>
                        </a>
                    </div>
            </div>

            <div className="main3">
                <img src={Hand} style={{ mixBlendMode: 'screen' }} className="gosthand" id="bg3" alt="손이미지" />
                <img src={Bg3} id="calendarbg" alt="달력배경" />
                <img src={Hand2} id="hand" className="dn" alt="hand" />
                <h1 id="monthTitle"></h1>
                <div id="calendar"></div>
                <button id="checkAttendanceBtn">출석 체크 하기</button>
            </div>
        </main>
    );
}

export default Main;
