import './App.css';
import Header from './Components/header/header.component';
import { SubHeader } from './Components/sub-header/sub-header.component';
import Homepage from './Pages/homepage/homepage.component';

function App() {
  return (
    <div className="App flex flex-col">
      <Header />
      <SubHeader />
      <Homepage />
    </div>
  );
}

export default App;
