
import { configureStore } from '@reduxjs/toolkit';
import { applyMiddleware, compose, createStore } from 'redux';
import logger from 'redux-logger'
import persistStore from 'redux-persist/es/persistStore';
import thunk from 'redux-thunk';
import rootReducer from './root-reducer';





const middlewares = [thunk];

if(process.env.NODE_ENV == 'development') {
    middlewares.push(logger)
}

const composedStore = compose(
    applyMiddleware(...middlewares),
    window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
)

const store = configureStore(
    {reducer : rootReducer},
    composedStore
    
)

export const persistor = persistStore(store)

export default store;