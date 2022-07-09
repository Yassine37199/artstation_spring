import { Ring } from '@uiball/loaders';

import './with-spinner.styles.css'

const WithSpinner = () => {
    return (
        <div className='spinner-container'>
            <Ring
                size={70}
                speed={1.75}
                color="white"
            />
        </div>
    );
};

export default WithSpinner;