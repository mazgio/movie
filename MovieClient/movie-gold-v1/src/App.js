import './App.css';
import axios from 'axios';
import { useState, useEffect } from 'react';

function App() {

  const [movies, setMovies] = useState();

  useEffect(() => {
    axios
      .get("http://localhost:8080/api/v1/movies")
      .then((res) => setMovies(res.data));
  }, []);

  return (
    <div className="App">
      <h1>Movies App</h1>
      {console.log(movies)}
    </div>
  );
}

export default App;
