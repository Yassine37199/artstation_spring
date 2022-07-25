import { useCallback, useMemo } from "react";
import { useDropzone } from "react-dropzone";
import {ImUpload} from 'react-icons/im'

import './dropzone.styles.css'

const baseStyle = {
  flex: 1,
  display: 'flex',
  flexDirection: 'column',
  alignItems: 'center',
  justifyContent : 'center',
  padding: '20px',
  borderWidth: 2,
  borderRadius: 2,
  borderColor: '#333',
  borderStyle: 'dashed',
  backgroundColor: '#171717',
  color: '#fff',
  outline: 'none',
  transition: 'border .24s ease-in-out',
  height : '200px'
};

const focusedStyle = {
  borderColor: '#2196f3'
};

const acceptStyle = {
  borderColor: '#00e676'
};

const rejectStyle = {
  borderColor: '#ff1744'
};

export const FileDropzone = (props : any) => {

  const onDrop = useCallback((acceptedFiles : any) => {
    const {userProfileId} = props
    const file = acceptedFiles[0];
    const formData = new FormData();
    formData.append("file", file)

    // axios.post(
    //   `http://localhost:8081/api/v1/user-profile/${userProfileId}/image/upload`,
    //   formData,
    //   {
    //     headers : {
    //       "Content-Type": "multipart/form-data"
    //     }
    //   }
    // ).then(() => console.log("file uploaded successfully")
    // ).catch(err => console.log(err))
  }, [])


  const {
    getRootProps,
    getInputProps,
    isFocused,
    isDragAccept,
    isDragReject
  } = useDropzone({accept: {'image/*': []} , onDrop});

  const style : any = useMemo(() => ({
    ...baseStyle,
    ...(isFocused ? focusedStyle : {}),
    ...(isDragAccept ? acceptStyle : {}),
    ...(isDragReject ? rejectStyle : {})
  }), [
    isFocused,
    isDragAccept,
    isDragReject
  ]);

  return (
    <div className="container">
      <div {...getRootProps({style})}>
        <input {...getInputProps()} />
        <p>Click to upload media files or drag and drop here</p>
        <ImUpload color="#fff" size='32' className="my-5"/>
      </div>
    </div>
  );
}