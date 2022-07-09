import { GalleryActionsTypes } from "./gallery.types";


const INITIAL_STATE = {
    artworks : []
}


export const GalleryReducer = (state = INITIAL_STATE , action : any) => {
    switch(action.type) {
        case GalleryActionsTypes.FETCH_GALLERY_SUCCESS : return {
            ...state,
            artworks : action.payload
        }

        default : return state
    }
}