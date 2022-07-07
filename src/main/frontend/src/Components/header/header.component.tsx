import React from 'react';
import { BiBell, BiMessage, BiHeart, BiCart, BiUpload, BiChevronDown, BiDotsVertical, BiSearch } from 'react-icons/bi'

import logo from '../../Assets/artstation-logo-white.png';
import userImage from '../../Assets/user-image.png'
import './header.styles.css';

const Header = () => {
    return (
        <div className='header'>
            <div className='logo-box'>
                <img src={logo} className='logo' alt='artstation-logo'/>
            </div>
            <div className='search-form'>
                <BiSearch size={20} color="#878771" className='search-icon' />
                <input placeholder='Search' className='search-form-input' type="text" />
            </div>
            <div className='user-nav'>
                <div className='upload-nav group'>
                    <BiUpload size={20} className='nav-icon group-hover:text-primary'/>
                    <span className='nav-link-text'>UPLOAD</span>
                </div>
                <div className='notification-icon' >
                    <BiBell  size={20} className='nav-icon'/>
                    <div className='notification'>112</div>
                </div> 
                <BiMessage size={20} className='nav-icon' />
                <BiHeart size={20} className='nav-icon'/>
                <BiCart size={20} className='nav-icon'/>
                <div className='user-profile-image'>
                    <img className='user-image' src={userImage} />
                    <BiChevronDown size={20} className="nav-icon" />
                </div>
                <BiDotsVertical size={20} className="nav-icon" />
            </div>
        </div>
    );
};

export default Header;