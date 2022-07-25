import React, { ChangeEventHandler } from 'react';

import './form-input.styles.css'


type FormInputPropsType = {
    type : string,
    placeholder : string
    name : string,
    label : string,
    value? : string,
    handleChange? : ChangeEventHandler,
    required? : boolean
    rows? : number,
    cols? : number
    


}

const FormInput = ({type, label , rows, cols, handleChange , ...OtherProps}: FormInputPropsType) => {
    return (
        <div className='form-group'>
            <div className='form-label-container'>
                <label className='form-label'>{label}</label>
            </div>
            <div className='form-input-container'>
                {
                    type === 'textarea' ? 
                    <textarea className='form-input' rows={rows} cols={cols} {...OtherProps}/>
                    :
                    <input 
                        className='form-input'
                        onChange={handleChange}
                        {...OtherProps} 
                    />
                }
                
            </div>
            
        </div>
    );
};

export default FormInput;