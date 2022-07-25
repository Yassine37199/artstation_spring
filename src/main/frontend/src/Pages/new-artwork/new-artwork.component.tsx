import FormInput from '../../Components/form-input/form-input.component';
import './new-artwork.styles.css'

const NewArtwork = () => {
    return (
        <div className="new-artwork-page">
            <h2 className='new-artwork-title'>Untitled</h2>
            <div className='new-artwork-container'>
            <div className='main-form '>
               <FormInput 
                type='text' 
                name='title' 
                label='Artwork Title'
                placeholder = 'What is your artwork called ?'  />
            </div>
            <div className='side-form'>

            </div>
            </div>
           
        </div>
    );
};

export default NewArtwork;