import { Route, Routes ,  } from 'react-router-dom';
import './App.css';
import Header from './Components/header/header.component';
import { SubHeader } from './Components/sub-header/sub-header.component';
import Homepage from './Pages/homepage/homepage.component';
import NewArtwork from './Pages/new-artwork/new-artwork.component';

function App() {
  return (
    <div className="App flex flex-col">
      <Header />
      <SubHeader />
      <Routes>
        <Route path='/' element={<Homepage />} />
        <Route path='/artworks/2/new' element={<NewArtwork />} />
      </Routes>
    </div>
  );
}

export default App;
