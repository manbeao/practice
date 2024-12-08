import { NavLink } from 'react-router-dom';
import headerLogo from '../images/header-logo.png'
import Css from '../css/reset.css'
import componentsCss from '../css/header.css'

function Header() {
    return (
        <>
            <header>
                <NavLink><img src={headerLogo} alt='header-logo' /></NavLink>
                <span>
                    <NavLink to="/">검색</NavLink>
                    <NavLink to="/">소개</NavLink>
                    <NavLink to="/">공지사항</NavLink>
                    <NavLink to="/">마이페이지</NavLink>
                    <NavLink to="/">로그인</NavLink>
                    <NavLink to="/">회원가입</NavLink>
                </span>
            </header>
        </>
    )
}

export default Header;