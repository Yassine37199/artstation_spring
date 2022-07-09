import { combineReducers } from "redux";
import persistReducer from "redux-persist/es/persistReducer";
import storage from 'redux-persist/lib/storage'
import { GalleryReducer } from "./gallery/gallery.reducer";

const persistConfig = {
    key : 'root',
    storage
}

const rootReducer = combineReducers({
    gallery : GalleryReducer
})


export default persistReducer(persistConfig , rootReducer)