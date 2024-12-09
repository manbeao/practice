import React, { useState } from 'react';
import { NavLink } from 'react-router-dom';
import headerLogo from '../images/header-logo.png';
import menuIcon from '../images/menu-icon.png'; // 햄버거 아이콘 추가
import '../css/reset.css';
import '../css/header.css';

function Header() {
    const [menuOpen, setMenuOpen] = useState(false);

    const toggleMenu = () => {
        setMenuOpen(!menuOpen);
    };

    return (
        <>
            <header>
                <NavLink><img src={headerLogo} alt='header-logo' /></NavLink>
                <span className={`menu ${menuOpen ? 'open' : ''}`}>
                    <NavLink to="/">검색</NavLink>
                    <NavLink to="/">소개</NavLink>
                    <NavLink to="/">공지사항</NavLink>
                    <NavLink to="/">마이페이지</NavLink>
                    <NavLink to="/">로그인</NavLink>
                    <NavLink to="/">회원가입</NavLink>
                </span>
                <button className="menu-button" onClick={toggleMenu}>
                    <img src={menuIcon} alt="Menu" />
                </button>
            </header>
        </>
    );
}

export default Header;
