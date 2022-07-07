import './App.css';
import Header from './Components/header/header.component';
import { SubHeader } from './Components/sub-header/sub-header.component';

function App() {
  console.log(process.env)
  return (
    <div className="App flex flex-col">
      <Header />
      <SubHeader />
    </div>
  );
}

export default App;
