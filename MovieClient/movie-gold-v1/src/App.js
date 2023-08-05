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


  if (!movies) {
    return null;
  }
  return (
    <div className="App">
      <h1>Movies App</h1>
      {movies.map((movie, index) => {
        return < h2 key={index}> {movie.title}</h2>;
      })}
    </div >
  );
}

export default App;
