import Dropzone from 'react-dropzone';
import { FileDropzone } from '../../Components/dropzone/dropzone.component';
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
                <FileDropzone />
                <FormInput
                    type='textarea'
                    name='description'
                    label='Artwork Details'
                    placeholder='Artwork Description'
                    rows={5}
                    cols={33} />
            </div>
            <div className='side-form'>

            </div>
            </div>
           
        </div>
    );
};

export default NewArtwork;