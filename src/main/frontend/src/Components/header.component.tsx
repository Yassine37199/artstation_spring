import React from 'react';
import {BiBell , BiMessage, BiHeart , BiCart, BiUpload} from 'react-icons/bi'

import logo from '../Assets/artstation-logo-white.png';
import userImage from '../Assets/user-image.png'
import './header.styles.css';

const Header = () => {
    return (
        <div className='header'>
            <div className='logo-box'>
                <img src={logo} className='logo' alt='artstation-logo'/>
            </div>
            <div className='search-form'>
                <input placeholder='Search' className='search-form-input' type="text" />
            </div>
            <div className='user-nav'>
                <div className='upload-nav'>
                    <BiUpload size={20} color="#fff" />
                    <span className='nav-link-text'>UPLOAD</span>
                </div>
                <div className='notification-icon' >
                    <BiBell  size={20} color='#fff' />
                    <div className='notification'>112</div>
                </div> 
                <BiMessage size={20} color='#fff' />
                <BiHeart size={20} color='#fff' />
                <BiCart size={20} color='#fff'/>
                <div className='user-profile-image'>
                    <img className='user-image' src={userImage} />
                </div>
            </div>
        </div>
    );
};

export default Header;