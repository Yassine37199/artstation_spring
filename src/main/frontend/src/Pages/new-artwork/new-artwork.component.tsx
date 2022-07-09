import './new-artwork.styles.css'

const NewArtwork = () => {
    return (
        <div className="new-artwork-page">
            <h2 className='new-artwork-title'>Untitled</h2>
            <div className='new-artwork-container'>
            <div className='main-form '>
                <div className='artwork-title-form'>
                    <label className='artwork-title-input-label'>Artwork Title</label>
                    <input className='artwork-title-input block' type='text' placeholder='what is your artwork called ?' />
                </div>
            </div>
            <div className='side-form'>

            </div>
            </div>
           
        </div>
    );
};

export default NewArtwork;