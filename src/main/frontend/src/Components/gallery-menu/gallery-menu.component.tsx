import axios from 'axios';
import useAxios from 'axios-hooks';
import { connect } from 'react-redux';
import { Artwork } from '../../Models/artwork';
import { GalleryItem } from '../gallery-item/gallery-item.component';
import WithSpinner from '../with-spinner/with-spinner.component';

import './gallery-menu.styles.css';

const GalleryMenu = () => {

    const [{data , loading , error} , refresh] = useAxios(`${process.env.REACT_APP_API_URL}/artwork/list`)

    if(loading) return <WithSpinner />
    if(error) return <p>Error !!</p>

    console.log(data)

    return (
        <div className='gallery-menu'>
        {
            data.map((artwork : any) => (
                <GalleryItem key={artwork.artworkId} artwork={artwork} />
            ))
        }
        </div>
    );
};

export default connect()(GalleryMenu);