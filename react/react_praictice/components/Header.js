import { NavLink } from 'react-router-dom';
import FontStyle from '../css/font.css'
import NavStyle from '../css/nav.css'
import logo from './nav-logo-dark.png'; // 이미지 파일 import

function Header() {
    return (
        <>
            <nav>
            <NavLink to="/main"><img src={logo} alt="nav-logo" /></NavLink>
                <span><NavLink to="/about">소개</NavLink></span>
                <span><NavLink to="/notice">공지사항</NavLink></span>
                <span><NavLink to="/post">게시판</NavLink></span>
                <span>MBTI 검사</span>
                <span><NavLink to="/login">로그인</NavLink></span>
                <span>회원가입</span>
            </nav>
        </>
    );
}

export default Header;
