import React from 'react';

import {BiBook , BiCube , BiPrinter , BiGroup, BiBuildings, BiBriefcase, BiTrophy, BiMap, BiMapAlt} from 'react-icons/bi'

import './sub-header.styles.css'

export const SubHeader = () => {
    return (
        <div className='sub-header'>
            <div className='sub-nav-item group'>
                <BiBook size={16} className="sub-nav-icon group-hover:text-primary" />
                <span className='sub-nav-text'>Learning</span>
            </div>
            <div className='sub-nav-item group'>
                <BiCube size={16} className="sub-nav-icon group-hover:text-primary" />
                <span className='sub-nav-text'>Marketplace</span>
            </div>
            <div className='sub-nav-item group'>
                <BiPrinter size={16} className="sub-nav-icon group-hover:text-primary" />
                <span className='sub-nav-text'>Prints</span>
            </div>
            <div className='sub-nav-item group'>
                <BiBook size={16} className="sub-nav-icon group-hover:text-primary" />
                <span className='sub-nav-text'>Schools</span>
            </div>
            <div className='sub-nav-item group'>
                <BiGroup size={16} className="sub-nav-icon group-hover:text-primary" />
                <span className='sub-nav-text'>Studio</span>
            </div>
            <div className='sub-nav-item group'>
                <BiBriefcase size={16} className="sub-nav-icon group-hover:text-primary" />
                <span className='sub-nav-text'>Jobs</span>
            </div>
            <div className='sub-nav-item group'>
                <BiTrophy size={16} className="sub-nav-icon group-hover:text-primary" />
                <span className='sub-nav-text'>Challenges</span>
            </div>
            <div className='sub-nav-item group' >
                <BiMapAlt size={16} className="sub-nav-icon group-hover:text-primary" />
                <span className='sub-nav-text'>Guides</span>
            </div>
        </div>
    );

}

