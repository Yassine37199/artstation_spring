import { User } from "./user";

export interface Artwork {
    artworkId : number,
    title : string,
    artworkImageLinks : string,
    projectThumbnailLink : string,
    description : string,
    hasMatureContent : boolean,
    creation_date ? : Date,
    user : User
} 