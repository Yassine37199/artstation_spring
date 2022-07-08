import React from 'react';
import { Artwork } from '../../Models/artwork';
import userImage from '../../Assets/user-image-example.jpg'

import './gallery-item.styles.css'


type GalleryItemPropsType = {
    key : String
    artwork : Artwork
}

export const GalleryItem = ({artwork : {title , artworkImageLinks , user : {AvatarImageLink , fullname}}} : GalleryItemPropsType) => {
    return (
        <>
        <div className='gallery-item-image group' style={{
            backgroundImage : `url(${artworkImageLinks})`
        }}>

        <div className="gallery-item-info group-hover:opacity-80">
            <img className='gallery-item-profile' src={AvatarImageLink ? AvatarImageLink : userImage} />
            <div className='gallery-item-info-inner'>
                <p className='gallery-item-title'>{title}</p>
                <span className='gallery-item-artist'>{fullname}</span>
            </div>
            
        </div>
           
        </div>
        </>
    );
};
