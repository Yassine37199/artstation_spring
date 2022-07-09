import useAxios from "axios-hooks";
import { Artwork } from "../../Models/artwork";
import { GalleryActionsTypes } from "./gallery.types";


export const fetchGalleryStart = () => ({
    type : GalleryActionsTypes.FETCH_GALLERY_START
})

export const fetchGallerySuccess = (artworksData : Artwork[]) => ({
    type : GalleryActionsTypes.FETCH_GALLERY_SUCCESS,
    payload : artworksData
})